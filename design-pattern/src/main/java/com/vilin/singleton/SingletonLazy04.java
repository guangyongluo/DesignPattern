package com.vilin.singleton;

//懒汉式单例模式(静态变量)
public class SingletonLazy04 {

    private static volatile SingletonLazy04 singletonLazy04;

    private SingletonLazy04(){}

    //加入双重检查代码，解决线程安全问题，同时解决懒加载问题
    //同时保证了效率，推荐使用
    public static SingletonLazy04 getInstance(){
        if(null == singletonLazy04){
            synchronized (SingletonLazy04.class) {
                if(null == singletonLazy04) {
                    singletonLazy04 = new SingletonLazy04();
                }
            }
        }
        return singletonLazy04;
    }

    public static void main(String[] args) {
        SingletonLazy04 singletonLazy1 = SingletonLazy04.getInstance();
        SingletonLazy04 singletonLazy2 = SingletonLazy04.getInstance();
        System.out.println(singletonLazy1 == singletonLazy2);
        System.out.println("singletonHungry1.hashCode() = " + singletonLazy1.hashCode());
        System.out.println("singletonHungry2.hashCode() = " + singletonLazy2.hashCode());
    }
}
