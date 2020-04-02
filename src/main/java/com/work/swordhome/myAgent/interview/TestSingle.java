package com.work.swordhome.myAgent.interview;

/**
 * @auther: weidong.han
 * @date: 2019/12/27
 */
public class TestSingle {
    private static TestSingle single;
    private TestSingle(){
        System.out.println("this is single object");
    }

    //非线程安全
    public static TestSingle getInstance(){
        if (single == null){
            single = new TestSingle();
        }
        return single;
    }
    //线程安全，双重检查
    public static TestSingle getSingle(){
        if (single == null){
            synchronized(TestSingle.class){
                if (single == null){
                    single = new TestSingle();
                }
            }
        }
        return single;
    }
//根据内部类来创建，在调用方法时给出，此种方法能保证百分百单例，推荐使用但需根据项目情况而定
    public static TestSingle getSingles(){
        return GetClass.singleByClazz;
    }

    public static class GetClass{
        private static TestSingle singleByClazz = new TestSingle();
    }
}

