package com.vilin.dp.creation.factory.abstraction;

public class HondaCar extends AbstractCar{

  public HondaCar(String name) {
    this.setName(name);
  }

  @Override
  public void run() {
    System.out.println(this.getName() + " Honda car is running...");
  }
}
