package com.vilin.dp.creation.factory.method;

public class TruckFactory extends AbstractFactory{

  @Override
  public AbstractCar createCar() {
    return new Truck("Truck");
  }
}
