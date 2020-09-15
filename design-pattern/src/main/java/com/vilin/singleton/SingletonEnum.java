package com.vilin.singleton;

public class SingletonEnum {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance1 == instance2);

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

        instance1.sayOK();
    }
}

// 使用枚举可以实现单例，推荐使用
enum Singleton {
    INSTANCE; //属性
    public void sayOK(){
        System.out.println("ok~");
    }

}
