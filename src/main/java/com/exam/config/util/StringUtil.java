package com.exam.config.util;

public class StringUtil {

    public static String nvl(Object obj){
        if(obj == null){
            return "";
        }else{
            return obj.toString();
        }
    }

}
