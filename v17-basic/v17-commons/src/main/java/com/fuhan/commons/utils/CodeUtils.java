package com.fuhan.commons.utils;

import java.util.Set;
import java.util.UUID;

/**
 * @author : FuHan
 * @description : ***
 * @date: 2019/11/10
 */
public class CodeUtils {

    public  String getRandom(int min,int max){
        int randNum = min + (int)(Math.random() * ((max - min) + 1));
        return randNum+"";
    }

    public  String getMessageCode(){
        return getRandom(100000,999999);
    }

    public static void main(String[] args) {

    }

}
