package com.webike.utils;

import org.junit.Test;

import java.text.ParseException;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by Ming on 2018/2/14.
 */
public class DateUtilTest {
    @Test
    public void differHour() throws Exception {
    }


    @Test
    public void test1() throws ParseException {
        Date date = DateUtil.yMdHmsToDate("2018-02-13 21:47:03");
        System.out.println(date);
    }

}