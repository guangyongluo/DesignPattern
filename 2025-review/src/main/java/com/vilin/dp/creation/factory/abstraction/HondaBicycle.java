package com.vilin.dp.creation.factory.abstraction;

public class HondaBicycle extends AbstractBicycle{

  public HondaBicycle(String name) {
    this.setName(name);
  }

  @Override
  public void run() {
    System.out.println(this.getName() + " is running...");
  }
}
