package com.webike.web;

import com.webike.dto.JsonResult;
import com.webike.enums.ResultEnum;
import com.webike.pojo.Place;
import com.webike.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Ming on 2018/2/12.
 */
@Controller
@RequestMapping("/place")
public class PlaceController {

    @Autowired
    private PlaceService placeService;


    //跳转到  place 页面
    @RequestMapping("/placeManage")
    public String placeMange(){
        return "place";
    }

    //显示所有服务点
    @RequestMapping("/showAll")
    @ResponseBody
    public List<Place> showAll(){
        return placeService.findAll();
    }

    //添加或更新服务点 addOrUpdate
    @RequestMapping(value = "/addOrUpdate",method = RequestMethod.POST)
    @ResponseBody
    public JsonResult addOrUpdate(Place place){
        if(place == null) return new JsonResult(false, ResultEnum.SYSTEM_ERROR);
        if(place.getPid() == null ) return placeService.add(place);
        return placeService.update(place);
    }

    //删除服务点
    @RequestMapping(value = "/remove",method = RequestMethod.POST)
    @ResponseBody
    public JsonResult remove(Integer pid){
        return placeService.deleteById(pid);
    }


    //回显服务点的表单数据
    @RequestMapping("/loadForm")
    @ResponseBody
    public Place loadForm(Integer pid){
        return placeService.findById(pid);
    }

}
