package com.webike.utils;

import java.util.HashMap;
import java.util.HashSet;

/**常用算法操作Util
 * Created by Ming on 2018/2/11.
 */
public class ArithmeticUtil {


    /**
     *返回一个组数中每个元素分别对应的次数
     * @param elements
     * @return 第一个参数Cid 第二个该cid出现的次数
     */
    public static <T> HashMap<T,Integer> getElementForTimes(T[]  elements){
        HashSet<T> set = new HashSet();
        for (int i = 0; i < elements.length; i++) {
            set.add(elements[i]);
        }
        HashMap<T,Integer> hashMap = new HashMap<>();
        for (T s : set) {
            int time = 0;
            for (int i = 0; i < elements.length; i++) {
                if(elements[i].equals(s)) time ++;
            }
            hashMap.put(s,time);
        }
        return hashMap;
    }

}
