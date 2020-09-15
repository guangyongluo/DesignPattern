package com.vilin.singleton;

//懒汉式单例模式(静态变量)
public class SingletonLazy03 {

    private static SingletonLazy03 singletonLazy03;

    private SingletonLazy03(){}

    //加入同步代码块，有线程安全问题
    public static SingletonLazy03 getInstance(){
        if(null == singletonLazy03){
            synchronized (SingletonLazy03.class) {
                singletonLazy03 = new SingletonLazy03();
            }
        }
        return singletonLazy03;
    }

    public static void main(String[] args) {
        SingletonLazy03 singletonLazy1 = SingletonLazy03.getInstance();
        SingletonLazy03 singletonLazy2 = SingletonLazy03.getInstance();
        System.out.println(singletonLazy1 == singletonLazy2);
        System.out.println("singletonHungry1.hashCode() = " + singletonLazy1.hashCode());
        System.out.println("singletonHungry2.hashCode() = " + singletonLazy2.hashCode());
    }
}
