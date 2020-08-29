package com.vilin.principle.singleresponsibility;

public class SingleResponsibility2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("汽车");
        roadVehicle.run("摩托车");

        AirVehicle airVehicle = new AirVehicle();

        airVehicle.run("飞机");
    }

}

//方式2分析
//1. 遵守单一职责原则；
//2. 改动比较大，即类分解；
//3. 改进：直接修改Vehicle类，改动比较小。

class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路运行");
    }
}

class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在天空飞行");
    }
}

class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在水中运行");
    }
}