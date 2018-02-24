package com.webike.service;

import com.webike.dto.JsonResult;
import com.webike.pojo.Category;

import java.util.List;

/**
 * Created by Ming on 2018/2/11.
 */
public interface CategoryService {

    List<Category> findAll();

    //更新单车的剩余数量数量
    boolean updateRemainById(Integer cid,Integer count);

    JsonResult add(Category category);

    JsonResult update(Category category);

    JsonResult deleteById(Integer cid);

    Category findById(Integer cid);
}
