package com.vilin.dp.creation.factory.method;

public class TaxiFactory extends AbstractFactory{

  @Override
  public AbstractCar createCar() {
    return new Taxi("Taxi");
  }
}
