package com.vilin.dp.creation.factory.abstraction;

public abstract class AbstractCar {

  private String name;

  public abstract void run();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
