package com.vilin.dp.creation.builder;

public abstract class AbstractBuilder {

  protected Phone phone;

  public abstract AbstractBuilder customCpu(String cpu);

  public abstract AbstractBuilder customScreen(String screen);

  public abstract AbstractBuilder customBattery(String battery);

  public Phone getPhone(){
    return this.phone;
  }

}
