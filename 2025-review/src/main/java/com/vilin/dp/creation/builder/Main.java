package com.vilin.dp.creation.builder;

public class Main {

  public static void main(String[] args) {
    AbstractBuilder builder = new XiaomiBuilder();
    builder.customCpu("骁龙888").customScreen("AMOLED").customBattery("5000mAh");
    Phone phone = builder.getPhone();
    System.out.println("手机CPU型号："+phone.getCpu());
    System.out.println("手机屏幕型号："+phone.getScreen());
    System.out.println("手机电池型号："+phone.getBattery());
  }

}
