package com.webike.service.impl;

import com.webike.dao.BikeMapper;
import com.webike.dto.JsonResult;
import com.webike.dto.Page;
import com.webike.enums.BikeStateEnum;
import com.webike.enums.ResultEnum;
import com.webike.pojo.Bike;
import com.webike.pojo.BikeExample;
import com.webike.service.BikeService;
import com.webike.service.CategoryService;
import com.webike.utils.ArithmeticUtil;
import com.webike.utils.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.*;

/**
 * Created by Ming on 2018/2/10.
 */
@Service
public class BikeControllerImpl implements BikeService {
    @Autowired
    private BikeMapper bikeMapper;

    @Autowired
    private CategoryService categoryService;

    //事务控制 该单车分类剩余量+1
    @Transactional
    @Override
    public JsonResult add(MultipartFile bikeIcon, Bike bike, HttpServletRequest request,Integer bCount) {
        if(!bikeIcon.isEmpty()){
            String path = FileUtil.uploadImage(bikeIcon, "bikeIcon", request);
            if(path == null) return new JsonResult(false, ResultEnum.UPLOAD_TYPE_ERROR);
            bike.setbIcon(path);
        }
        bike.setbState(BikeStateEnum.AVAILABLE.getState());
        bike.setbCreateTime(new Date());
        bike.setbUpdateTime(new Date());
        try{
            int row = 0;
            for (int i = 0; i < bCount; i++) {
                row += bikeMapper.insertSelective(bike);
            }
            if(row == bCount){
                return categoryService.updateRemainById(bike.getbCid(),bCount) ?
                        new JsonResult(true, ResultEnum.ADD_SUCCESS):new JsonResult(false, ResultEnum.ADD_FAIL);
            }else{
                throw new RuntimeException();
            }
        }catch (Exception e){
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return new JsonResult(false,ResultEnum.SYSTEM_ERROR);
        }

    }

    @Override
    public JsonResult update(MultipartFile bikeIcon, Bike bike, HttpServletRequest request) {
        try{
            if(!bikeIcon.isEmpty()){
                //更新首先要先删除原来的文件
                if(bike.getbIcon() != null){
                    File file = new File(request.getServletContext().getRealPath("/" + bike.getbIcon()));
                    if(file != null) file.delete();
                }
                String path = FileUtil.uploadImage(bikeIcon, "bikeIcon", request);
                if(path == null) return new JsonResult(false, ResultEnum.UPLOAD_TYPE_ERROR);
                bike.setbIcon(path);
            }
            bike.setbUpdateTime(new Date());
            int i = bikeMapper.updateByPrimaryKeySelective(bike);
            return i > 0 ? new JsonResult(false, ResultEnum.UPDATE_SUCCESS)
                    : new JsonResult(false, ResultEnum.UPDATE_FAIL);
        }catch (Exception e){
            e.printStackTrace();
            return new JsonResult(false, ResultEnum.SYSTEM_ERROR);
        }
    }

    @Override
    public Page<Bike> findAllToPage(Integer page, Integer rows) {
        Page<Bike> bPage = new Page<>();
        List<Bike> lists = bikeMapper.findToPage((page-1)*rows,rows);
        bPage.setRows(lists);
        bPage.setTotal(bikeMapper.countByExample(new BikeExample()));
        return bPage;
    }
    //事务控制 该单车的分类剩余量减size
    @Transactional
    @Override
    public JsonResult deleteById(String bids,String cids) {
        try{
            String[] bidList = bids.split(",");
            String[] cidList = cids.split(",");

            int row = 0;
            for (int i = 0; i < bidList.length; i++) {
                row += bikeMapper.deleteByPrimaryKey(Integer.parseInt(bidList[i]));
            }
            if(row == bidList.length){ //更新分类表的剩余数量
                HashMap<String, Integer> cidMap = ArithmeticUtil.getElementForTimes(cidList);
                Set<Map.Entry<String, Integer>> entries = cidMap.entrySet();
                for (Map.Entry<String, Integer> entry : entries) {
                    boolean isSuccess = categoryService.updateRemainById(Integer.parseInt(entry.getKey()), - entry.getValue());
                    if(!isSuccess) throw new RuntimeException();
                }
                return new JsonResult(true, ResultEnum.DELETE_SUCCESS);
            }else{
                throw new RuntimeException();
            }
        }catch (Exception e){
            e.printStackTrace();
//            throw new RuntimeException(e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return new JsonResult(false,ResultEnum.SYSTEM_ERROR);
        }
    }

    @Override
    public Bike findById(Integer bid) {
        return bikeMapper.selectByPrimaryKey(bid);
    }



}
