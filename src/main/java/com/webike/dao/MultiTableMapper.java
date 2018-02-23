package com.webike.dao;

import com.webike.pojo.BikeCategory;

import java.util.List;

/**多表View
 * Created by 542585138 on 2018/2/14.
 */
public interface MultiTableMapper {

   List<BikeCategory> getBikeAndCategory();
   //...
}
