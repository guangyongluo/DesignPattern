package com.vilin.dp.creation.builder;

public class XiaomiBuilder extends AbstractBuilder{

  public XiaomiBuilder() {
    System.out.println("XiaomiBuilder 构造器被调用...");
    this.phone = new Phone();
  }

  @Override
  public AbstractBuilder customCpu(String cpu) {
    phone.cpu = cpu;
    return this;
  }

  @Override
  public AbstractBuilder customScreen(String screen) {
    phone.screen = screen;
    return this;
  }

  @Override
  public AbstractBuilder customBattery(String battery) {
    phone.battery = battery;
    return this;
  }


}
