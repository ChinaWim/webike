package com.webike.utils;

import java.util.UUID;

/**
 * Created by Ming on 2018/2/9.
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
