package com.work.swordhome.web;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

/**
 * @auther: weidong.han
 * @date: 2019/11/18
 */
public class BaseController {
    protected Map<String, ? extends Object> success(){
        return ImmutableMap.of("ret",true);
    }

    protected Map<String,? extends Object> success(Object result){
        return ImmutableMap.of("ret",true,"data",result);
    }

    protected Map<String,? extends Object> failed(String message){
        return ImmutableMap.of("ret",false,"msg",message);
    }
}