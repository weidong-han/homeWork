//package com.work.swordhome.AopTest;
//
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.*;
//import org.springframework.stereotype.Component;
//
//
///**
// * @auther: weidong.han
// * @date: 2020/1/6
// */
//@Aspect
//@Component
//public class TestPoxyPoint {
//
//    @Before("com.business.sword.AopTest.TestPointCut.pointCut01()")
//    public void testB(){
//        System.out.println("this is point before!");
//    }
//
//    @After("com.business.sword.AopTest.TestPointCut.pointCut01()")
//    public void testA(){
//        System.out.println("this is point after!");
//    }
//
//    @Around("com.business.sword.AopTest.TestPointCut.pointCut01()")
//    public Object testAround(ProceedingJoinPoint po)throws Throwable{
//        Object[] arges = po.getArgs();
//        String s = (String)arges[0];
//        if (s.equals("weidong")){
//            System.out.println("符合访问权限！");
//        }
//        return po.proceed();
//    }
//
//    @AfterReturning("com.business.sword.AopTest.TestPointCut.pointCut01() && args(name)")
//    public void testAR(String name){
//        if (name.equals("weidong")){
//            System.out.println("hello,afterReturning!");
//        }
//    }
//
//}