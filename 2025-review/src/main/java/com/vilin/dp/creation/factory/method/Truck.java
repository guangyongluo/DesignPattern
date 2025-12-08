package com.vilin.dp.creation.factory.method;

public class Truck extends AbstractCar {

  private String name;

  public Truck(String name){
    this.setName(name);
  }

  @Override
  public void run() {
    System.out.println(this.getName() + " truck is running...");
  }
}
