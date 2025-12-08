package com.vilin.dp.creation.factory.simple;

public class Taxi extends AbstractCar{

  public Taxi(String name){
    this.setName(name);
  }

  @Override
  public void run() {
    System.out.println(this.getName() + " taxi is running...");
  }
}
