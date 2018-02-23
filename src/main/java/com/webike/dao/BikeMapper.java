package com.webike.dao;

import com.webike.pojo.Bike;
import com.webike.pojo.BikeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BikeMapper {
    int countByExample(BikeExample example);

    int deleteByExample(BikeExample example);

    int deleteByPrimaryKey(Integer bid);

    int insert(Bike record);

    int insertSelective(Bike record);

    List<Bike> selectByExample(BikeExample example);

    Bike selectByPrimaryKey(Integer bid);

    int updateByExampleSelective(@Param("record") Bike record, @Param("example") BikeExample example);

    int updateByExample(@Param("record") Bike record, @Param("example") BikeExample example);

    int updateByPrimaryKeySelective(Bike record);

    int updateByPrimaryKey(Bike record);

    List<Bike> findToPage(@Param("page") int page, @Param("rows") Integer rows);

}