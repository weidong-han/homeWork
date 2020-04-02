package com.work.swordhome.AopTest;

import org.aspectj.lang.annotation.Pointcut;

/**
 * @auther: weidong.han
 * @date: 2020/1/6
 */

public class TestPointCut {

    @Pointcut("execution(public * com.qunar.business.sword.AopTest.PointImp.*(..))")
    public void pointCut01(){}


}