package com.vilin.dp.creation.factory.abstraction;

public class BavarianBicycle extends AbstractBicycle{

  public BavarianBicycle(String name) {
    this.setName(name);
  }

  @Override
  public void run() {
    System.out.println(this.getName() + " is running...");
  }
}
