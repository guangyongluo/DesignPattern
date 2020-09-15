package com.vilin.singleton;


//饿汉式单例模式(静态变量)
public class SingletonHungry01 {

    //内部创建单例对象实例
    private final static SingletonHungry01 singletonHungry = new SingletonHungry01();

    //私有化构造函数，外部不能创建new
    private SingletonHungry01(){}

    //提供静态的类方法，返回单例实例
    public static SingletonHungry01 getInstance(){
        return singletonHungry;
    }

    public static void main(String[] args) {
        SingletonHungry01 singletonHungry1 = SingletonHungry01.getInstance();
        SingletonHungry01 singletonHungry2 = SingletonHungry01.getInstance();
        System.out.println(singletonHungry1 == singletonHungry2);
        System.out.println("singletonHungry1.hashCode() = " + singletonHungry1.hashCode());
        System.out.println("singletonHungry2.hashCode() = " + singletonHungry2.hashCode());
    }

}
