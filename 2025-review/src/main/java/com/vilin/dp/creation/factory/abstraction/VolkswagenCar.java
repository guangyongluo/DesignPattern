package com.vilin.dp.creation.factory.abstraction;

public class VolkswagenCar extends AbstractCar{

  public VolkswagenCar(String name) {
    this.setName(name);
  }

  @Override
  public void run() {
    System.out.println(this.getName() + " Volkswagen car is running...");
  }
}
