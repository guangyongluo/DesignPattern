package com.vilin.principle.singleresponsibility;

public class SingleResponsibility3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Vehicle3 vehicle3 = new Vehicle3();
        vehicle3.run("汽车");
        vehicle3.runWater("鱼");
        vehicle3.runAir("飞机");
    }

}


//方式3分析
//1. 这种方法没有对原来的类做很大的修改，只是增加了方法而已；
//2. 虽然没有在类这个级别上没有遵守单一职责原则，但是在方法上遵守了单一职责原则。
class Vehicle3 {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上跑...");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + "在天空中飞...");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + "在水里面游...");
    }
}
