package com.webike.web;

import com.webike.dto.JsonResult;
import com.webike.enums.ResultEnum;
import com.webike.pojo.Category;
import com.webike.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Ming on 2018/2/11.
 */
@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;


    //跳转到category页面
    @RequestMapping("/categoryManage")
    public String categoryMange(){
        return "category";
    }

    //显示所有分类
    @RequestMapping("/showAll")
    @ResponseBody
    public List<Category> showAll(){
       return categoryService.findAll();
    }

    //添加或更新分类 addOrUpdate
    @RequestMapping(value = "/addOrUpdate",method = RequestMethod.POST)
    @ResponseBody
    public JsonResult addOrUpdate(Category category){
        if(category == null) return new JsonResult(false, ResultEnum.SYSTEM_ERROR);
        if(category.getCid() == null ) return categoryService.add(category);
        return categoryService.update(category);
    }

    //删除分类
    @RequestMapping(value = "/remove",method = RequestMethod.POST)
    @ResponseBody
    public JsonResult remove(Integer cid){
        return categoryService.deleteById(cid);
    }


    //回显分类的表单数据
    @RequestMapping("/loadForm")
    @ResponseBody
    public Category loadForm(Integer cid){
        return categoryService.findById(cid);
    }



}
