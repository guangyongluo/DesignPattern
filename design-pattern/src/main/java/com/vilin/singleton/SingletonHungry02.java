package com.vilin.singleton;


//饿汉式单例模式(静态变量)
public class SingletonHungry02 {

    //单例属性
    private static SingletonHungry02 singletonHungry;

    //静态代码块实例化单例实例
    static {
        singletonHungry = new SingletonHungry02();
    }

    //私有化构造函数，外部不能创建new
    private SingletonHungry02(){}

    //提供静态的类方法，返回单例实例
    public static SingletonHungry02 getInstance(){
        return singletonHungry;
    }

    public static void main(String[] args) {
        SingletonHungry02 singletonHungry1 = SingletonHungry02.getInstance();
        SingletonHungry02 singletonHungry2 = SingletonHungry02.getInstance();
        System.out.println(singletonHungry1 == singletonHungry2);
        System.out.println("singletonHungry1.hashCode() = " + singletonHungry1.hashCode());
        System.out.println("singletonHungry2.hashCode() = " + singletonHungry2.hashCode());
    }

}
