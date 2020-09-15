package com.vilin.singleton;


//静态内部类完成
public class SingletonStaticInnerClass {

//    private static volatile SingletonStaticInnerClass instance;

    //私有化构造函数，外部不能创建new
    private SingletonStaticInnerClass(){}

    private static class StaticInnerClassInstance{
        private static final SingletonStaticInnerClass INSTANCE = new SingletonStaticInnerClass();
    }

    public static synchronized SingletonStaticInnerClass getInstance() {

        return StaticInnerClassInstance.INSTANCE;
    }
}
