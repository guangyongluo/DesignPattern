package com.vilin.dp.creation.factory.method;

public class BusFactory extends AbstractFactory{

  @Override
  public AbstractCar createCar() {
    return new Bus("Bus");
  }
}
