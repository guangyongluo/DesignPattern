package com.vilin.dp.creation.factory.abstraction;

public class BavarianMotorcycle extends AbstractMotorcycle{

  public BavarianMotorcycle() {
    this.setName("Bavarian Motorcycle");
  }

  @Override
  public void run() {
    System.out.println(this.getName() + " is running...");
  }
}
