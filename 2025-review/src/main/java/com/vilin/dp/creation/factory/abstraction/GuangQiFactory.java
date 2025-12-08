package com.vilin.dp.creation.factory.abstraction;

public class GuangQiFactory implements VehicleFactory {

  @Override
  public AbstractCar createCar(String name) {
    return new HondaCar(name);
  }

  @Override
  public AbstractBicycle createBicycle(String name) {
    return new HondaBicycle(name);
  }

  @Override
  public AbstractMotorcycle createMotorcycle(String name) {
    return new HondaMotorcycle(name);
  }
}
