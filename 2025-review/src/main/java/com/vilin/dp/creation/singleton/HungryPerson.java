package com.vilin.dp.creation.singleton;

public class HungryPerson {


  private static final HungryPerson person = new HungryPerson();

  private HungryPerson(){
  }

  public static HungryPerson getInstance(){
    return person;
  }

  public static void main(String[] args) {
    HungryPerson p1 = HungryPerson.getInstance();
    HungryPerson p2 = HungryPerson.getInstance();

    System.out.println(p1 == p2);
  }

}
