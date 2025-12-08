package com.vilin.dp.creation.factory.abstraction;

public class HondaMotorcycle extends AbstractMotorcycle{

  public HondaMotorcycle(String name) {
    this.setName(name);
  }

  @Override
  public void run() {
    System.out.println(this.getName() + " is running...");
  }
}
