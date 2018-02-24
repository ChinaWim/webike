package com.webike.web;

import com.webike.dto.JsonResult;
import com.webike.dto.Page;
import com.webike.pojo.Bike;
import com.webike.pojo.Category;
import com.webike.pojo.Student;
import com.webike.service.BikeService;
import com.webike.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * Created by Ming on 2018/2/10.
 */
@Controller
@RequestMapping("/bike")
public class BikeController {

    @Autowired
    private BikeService bikeService;

    @Autowired
    private CategoryService categoryService;



    //跳转到 bike管理页面
    @RequestMapping("/bikeManage")
    public String bikeManage(){
        return "bike";
    }

    //添加或更新bike
    @RequestMapping(value = "/addOrUpdate",method = RequestMethod.POST)
    @ResponseBody
    public JsonResult addOrUpdate(MultipartFile bikeIcon, Bike bike, HttpServletRequest request,Integer bCount){
        if(bCount != null) return bikeService.add(bikeIcon,bike,request,bCount);
            return bikeService.update(bikeIcon,bike,request);
    }

    //showAll bike
    @RequestMapping("/showAll")
    @ResponseBody
    public Page<Bike> show(Integer page, Integer rows){
        return bikeService.findAllToPage(page,rows);
    }

    //删除单车和更新单车的分类
    @RequestMapping(value = "/remove",method = RequestMethod.POST)
    @ResponseBody
    public JsonResult remove(String bids,String cids){
        return bikeService.deleteById(bids,cids);
    }
    //点击修改回显bike弹出表单
    @RequestMapping("/loadForm")
    @ResponseBody
    public Bike loadForm(Integer bid){
        return bikeService.findById(bid);
    }

    //回显bike分类
    @RequestMapping(value = "/loadCategory",method = RequestMethod.POST)
    @ResponseBody
    public List<Category> loadCategory(){
        return categoryService.findAll();
    }



}
