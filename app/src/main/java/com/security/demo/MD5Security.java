package com.security.demo;

import com.security.demo.utils.MD5Utils;

/**
 * Created by ziv on 2017/9/7.
 */

public class MD5Security {

    public static void main(String[] args){
        String password = "123456";
        System.out.println("md5加密前的密码为： "+password);
        String enCodePwd = MD5Utils.encode(password);
        System.out.println("md5加密后的密码为： "+enCodePwd);
    }
}
