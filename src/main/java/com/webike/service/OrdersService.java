package com.webike.service;

import com.webike.dto.JsonResult;
import com.webike.dto.Page;
import com.webike.pojo.Orders;

/**
 * Created by Ming on 2018/2/9.
 */
public interface OrdersService {

    JsonResult add(Orders orders);

    Page<Orders> findAllToPage(Integer page, Integer rows);

    Orders findById(Integer oid);

    //归还单车
    JsonResult update(Orders orders);

    JsonResult deleteById(Integer oid,Integer oBid,String oState);
}
