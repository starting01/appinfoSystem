package com.yqf.utils;

import org.springframework.util.DigestUtils;

/**
 * @author peak
 * @Version 1.0
 */
public class MD5Util {

    public static String getMD5Plus(String password){
        String md1 = DigestUtils.md5DigestAsHex(password.getBytes());

        //取md1 前6位再次加密
        String subString6 = md1.substring(0,6);

        return DigestUtils.md5DigestAsHex((md1+subString6).getBytes());

    }

}
