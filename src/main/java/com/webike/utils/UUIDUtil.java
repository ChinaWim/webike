package com.webike.utils;

import java.util.UUID;

/**
 * Created by 542585138 on 2018/2/9.
 */
public class UUIDUtil {


    public static String getUUIDByAPI(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    public static String getUUIDByTime(){
        String str = "";
        for (int i = 0; i < 4; i++) {
            str += (int)(Math.random()*10);
        }
        return System.currentTimeMillis()+str;
    }

}
