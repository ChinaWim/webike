package com.webike.service.impl;

import com.webike.dao.BikeMapper;
import com.webike.dao.CategoryMapper;
import com.webike.dto.JsonResult;
import com.webike.enums.ResultEnum;
import com.webike.pojo.BikeExample;
import com.webike.pojo.Category;
import com.webike.pojo.CategoryExample;
import com.webike.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.Date;
import java.util.List;

/**
 * Created by Ming on 2018/2/11.
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    @Autowired
    private BikeMapper bikeMapper;

    @Override
    public List<Category> findAll() {
        return categoryMapper.selectByExample(new CategoryExample());
    }

    @Override
    public boolean updateRemainById(Integer cid,Integer count) {
        Category category = categoryMapper.selectByPrimaryKey(cid);
        if( (category.getcRemain() + count) < 0) return true;
        category.setcRemain(category.getcRemain() + count);
        category.setcUpdateTime(new Date());
        return categoryMapper.updateByPrimaryKeySelective(category) > 0 ? true : false;
    }

    @Override
    public JsonResult add(Category category) {
        category.setcRemain(0);
        category.setcCreateTime(new Date());
        category.setcUpdateTime(new Date());
        int i = categoryMapper.insertSelective(category);
        return i > 0 ? new JsonResult(true, ResultEnum.ADD_SUCCESS)
                : new JsonResult(false, ResultEnum.ADD_FAIL);

    }

    @Override
    public JsonResult update(Category category) {
        category.setcUpdateTime(new Date());
        int i = categoryMapper.updateByPrimaryKeySelective(category);
        return i > 0 ? new JsonResult(true, ResultEnum.UPDATE_SUCCESS)
                : new JsonResult(false, ResultEnum.UPDATE_FAIL);
    }

    //删除分类 全部该分类的单车也会被删除
    @Transactional
    @Override
    public JsonResult deleteById(Integer cid) {
        try{
            BikeExample bikeExample = new BikeExample();
            bikeExample.createCriteria().andBCidEqualTo(cid);
            bikeMapper.deleteByExample(bikeExample);
            categoryMapper.deleteByPrimaryKey(cid);
            return new JsonResult(true, ResultEnum.DELETE_SUCCESS);
        }catch (Exception e ){
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return new JsonResult(false,ResultEnum.SYSTEM_ERROR);
        }

    }

    @Override
    public Category findById(Integer cid) {
        if(cid != null )
        return  categoryMapper.selectByPrimaryKey(cid);
        return null;
    }
}
