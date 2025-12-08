package com.vilin.dp.creation.factory.abstraction;

public class ShangQiFactory implements VehicleFactory {

  @Override
  public AbstractCar createCar(String name) {
    return new VolkswagenCar(name);
  }

  @Override
  public AbstractBicycle createBicycle(String name) {
    return new BavarianBicycle(name);
  }

  @Override
  public AbstractMotorcycle createMotorcycle(String name) {
    return new HondaMotorcycle(name);
  }
}
