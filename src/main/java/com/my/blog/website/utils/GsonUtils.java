package com.my.blog.website.utils;


import cn.hutool.json.JSONUtil;

/**
 * json转换工具
 * Created by Administrator on 2017/3/13 013.
 */
public class GsonUtils {


    public static String toJsonString(Object object){
      return JSONUtil.toJsonStr(object);
    }
}
