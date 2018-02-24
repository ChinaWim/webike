package com.webike.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**日期工具
 * Created by Ming on 2018/2/13.
 */
public class DateUtil {

    public static String yMdToStr(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }

    public static String yMdHmsToStr(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }
    public static Date yMdToDate(String str) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.parse(str);

    }
    public static Date yMdHmsToDate(String str) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.parse(str);
    }

    //计算两个日期的时间差（单位小时）
    public static double differHour(Date before, Date after){
        long l = after.getTime() - before.getTime();
        return (l*1.0)/1000/60/60;
    }
}
