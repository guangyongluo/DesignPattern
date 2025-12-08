package com.vilin.dp.creation.factory.method;

public class Main {

  public static void main(String[] args) {
    AbstractFactory busFactory = new BusFactory();
    AbstractCar bus = busFactory.createCar();
    bus.run();
    AbstractFactory taxiFactory = new TaxiFactory();
    AbstractCar taxi = taxiFactory.createCar();
    taxi.run();
    AbstractFactory truckFactory = new TruckFactory();
    AbstractCar truck = truckFactory.createCar();
    truck.run();
  }
}
