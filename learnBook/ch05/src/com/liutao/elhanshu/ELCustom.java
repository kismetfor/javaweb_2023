package com.liutao.elhanshu;

public class ELCustom {
    public static String reverse(String str) {
        if (null == str || "".equals(str)) {
            return "";
        }
        return new StringBuffer(str).reverse().toString();
    }

    public static String toUpperCase(String str) {
        if (null == str || "".equals(str)) {
            return "";
        }
        return str.toUpperCase();
    }
}

