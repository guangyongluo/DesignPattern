package com.vilin.dp.creation.builder;

public class Mobile {

  private String cpu;
  private String screen;
  private String battery;

  public static class MobileBuilder{
    private final Mobile mobile;

    public MobileBuilder() {
      mobile = new Mobile();
    }

    public MobileBuilder buildCpu(String cpu){
      mobile.cpu = cpu;
      return this;
    }

    public MobileBuilder buildScreen(String screen){
      mobile.screen = screen;
      return this;
    }

    public MobileBuilder buildBattery(String battery){
      mobile.battery = battery;
      return this;
    }

    public Mobile build(){
      return mobile;
    }
  }

  public MobileBuilder builder(){
    return new MobileBuilder();
  }

  public static void main(String[] args) {
    Mobile mobile = new Mobile.MobileBuilder()
            .buildCpu("Snapdragon 8 Gen 2")
            .buildScreen("6.78 inch AMOLED")
            .buildBattery("5000mAh")
            .build();

    System.out.println("Mobile CPU: " + mobile.cpu);
    System.out.println("Mobile Screen: " + mobile.screen);
    System.out.println("Mobile Battery: " + mobile.battery);
  }
}

