package com.work.swordhome.web;

import com.qunar.business.sword.AopTest.PointImp;
import com.qunar.business.sword.service.more_extends.TestMoreExtends;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;
import java.util.jar.Attributes;

/**
 * Created by weidong.han on 2019/7/16.
 */
@Controller
@RequestMapping("/")
public class Welcome extends BaseController{

    @Resource
    PointImp pointImp;

    @Resource(name = "test1")
    TestMoreExtends testMoreExtends;

    @RequestMapping
    @ResponseBody
    public Map<String, ? extends Object> welcome(){
        return success("welcome!");
    }

    @RequestMapping("/point")
    @ResponseBody
    public String pointt(){

        pointImp.testPoint02("weidong");
        return  pointImp.testPoint("weidong",31);
    }

    @RequestMapping("/more")
    @ResponseBody
    public void more(){
        String name = "TestImp1";
        testMoreExtends.eat(name);
    }



}
