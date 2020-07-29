package com.itzhang.utils;

import java.util.Random;

/**
 * 自定义盐工具类
 */
public class SaltUtils {
    public static String getSalt(int length){
        StringBuilder salt = new StringBuilder();
        char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789!@#$%^&*()_+~".toCharArray();
        for (int i = 0; i < length; ++i){
            salt.append(chars[new Random().nextInt(chars.length)]);
        }
        return salt.toString();
    }
}
