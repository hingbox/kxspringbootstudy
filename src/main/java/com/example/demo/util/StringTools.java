package com.example.demo.util;

/**
 * Created by Admin on 2018/10/19.
 */
public class StringTools {
    public static boolean isNullOrEmpty(String str) {
        return null == str || "".equals(str) || "null".equals(str);
    }

    public static boolean isNullOrEmpty(Object obj) {
        return null == obj || "".equals(obj);
    }
}