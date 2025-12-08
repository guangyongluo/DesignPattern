package com.vilin.dp.creation.factory.simple;

public class Bus extends AbstractCar{

  public Bus(String name){
    this.setName(name);
  }

  @Override
  public void run() {
    System.out.println(this.getName() + " bus is running...");
  }
}
