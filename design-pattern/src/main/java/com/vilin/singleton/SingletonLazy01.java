package com.vilin.singleton;

//懒汉式单例模式(静态变量)
public class SingletonLazy01 {

    private static SingletonLazy01 singletonLazy01;

    private SingletonLazy01(){}

    //提供公有方法，当使用到单例实例时才创建一个 new
    //线程不安全
    public static SingletonLazy01 getInstance(){
        if(null == singletonLazy01){
            singletonLazy01 = new SingletonLazy01();
        }
        return singletonLazy01;
    }

    public static void main(String[] args) {
        SingletonLazy01 singletonLazy1 = SingletonLazy01.getInstance();
        SingletonLazy01 singletonLazy2 = SingletonLazy01.getInstance();
        System.out.println(singletonLazy1 == singletonLazy2);
        System.out.println("singletonHungry1.hashCode() = " + singletonLazy1.hashCode());
        System.out.println("singletonHungry2.hashCode() = " + singletonLazy2.hashCode());
    }
}
