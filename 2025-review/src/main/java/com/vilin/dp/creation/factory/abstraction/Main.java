package com.vilin.dp.creation.factory.abstraction;

public class Main {

  public static void main(String[] args) {
    VehicleFactory factory = new ShangQiFactory();

    AbstractCar car = factory.createCar("Volkswagen Car");
    car.run();

    AbstractMotorcycle motorcycle = factory.createMotorcycle("BMW Motorcycle");
    motorcycle.run();

    AbstractBicycle bicycle = factory.createBicycle("Bavarian Bicycle");
    bicycle.run();


  }

}
