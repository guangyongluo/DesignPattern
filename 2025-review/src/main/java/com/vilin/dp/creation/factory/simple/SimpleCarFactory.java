package com.vilin.dp.creation.factory.simple;

public class SimpleCarFactory {

  public static final String BUS_TYPE = "bus";
  public static final String TAXI_TYPE = "taxi";
  public static final String TRUCK_TYPE = "truck";

  public AbstractCar createCar(String type, String name) {
    AbstractCar car = null;
    if (BUS_TYPE.equalsIgnoreCase(type)) {
      car = new Bus(name);
    } else if (TAXI_TYPE.equalsIgnoreCase(type)) {
      car = new Taxi(name);
    } else if (TRUCK_TYPE.equalsIgnoreCase(type)) {
      car = new Truck(name);
    }
    return car;
  }

  public static void main(String[] args) {
    SimpleCarFactory factory = new SimpleCarFactory();

    AbstractCar bus = factory.createCar(SimpleCarFactory.BUS_TYPE, "City");
    bus.run();

    AbstractCar taxi = factory.createCar(SimpleCarFactory.TAXI_TYPE, "Yellow");
    taxi.run();

    AbstractCar truck = factory.createCar(SimpleCarFactory.TRUCK_TYPE, "Big");
    truck.run();
  }

}
