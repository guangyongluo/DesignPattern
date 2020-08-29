package com.vilin.principle.singleresponsibility;

public class SingleResponsibility1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Vehicle1 vehicle = new Vehicle1();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }

}

// 交通工具类
// 方式1
// 1. 方式1的run方法中，违反了单一职责原则；
// 2. 解决方案非常简单，根据交通工具运行方法的不同，分解成不同类即可。
class Vehicle1 {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行......");
    }
}
