package com.webike.service;

import com.webike.dto.JsonResult;
import com.webike.dto.Page;
import com.webike.pojo.Bike;
import com.webike.pojo.Student;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by Ming on 2018/2/9.
 */
public interface BikeService {



    JsonResult add(MultipartFile bikeIcon, Bike bike, HttpServletRequest request,Integer bCount);

    JsonResult update(MultipartFile bikeIcon,Bike bike,HttpServletRequest request);

    Page<Bike> findAllToPage(Integer page, Integer rows);

    //当前bike d掉 和 更新该分类的数量
    JsonResult deleteById(String bids,String cids);

    Bike findById(Integer bid);
}
