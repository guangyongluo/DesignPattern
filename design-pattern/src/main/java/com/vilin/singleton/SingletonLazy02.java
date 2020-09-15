package com.vilin.singleton;

//懒汉式单例模式(静态变量)
public class SingletonLazy02 {

    private static SingletonLazy02 singletonLazy03;

    private SingletonLazy02(){}

    //加入同步代码同步创建方法，解决线程安全问题
    public static synchronized SingletonLazy02 getInstance(){
        if(null == singletonLazy03){
            singletonLazy03 = new SingletonLazy02();
        }
        return singletonLazy03;
    }

    public static void main(String[] args) {
        SingletonLazy02 singletonLazy1 = SingletonLazy02.getInstance();
        SingletonLazy02 singletonLazy2 = SingletonLazy02.getInstance();
        System.out.println(singletonLazy1 == singletonLazy2);
        System.out.println("singletonHungry1.hashCode() = " + singletonLazy1.hashCode());
        System.out.println("singletonHungry2.hashCode() = " + singletonLazy2.hashCode());
    }
}
