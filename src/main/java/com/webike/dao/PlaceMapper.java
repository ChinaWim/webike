package com.webike.dao;

import com.webike.pojo.Place;
import com.webike.pojo.PlaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlaceMapper {
    int countByExample(PlaceExample example);

    int deleteByExample(PlaceExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Place record);

    int insertSelective(Place record);

    List<Place> selectByExample(PlaceExample example);

    Place selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") Place record, @Param("example") PlaceExample example);

    int updateByExample(@Param("record") Place record, @Param("example") PlaceExample example);

    int updateByPrimaryKeySelective(Place record);

    int updateByPrimaryKey(Place record);
}