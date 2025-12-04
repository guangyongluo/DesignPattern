package com.vilin.dp.creation.singleton;

public class InnerPerson {


  public static synchronized InnerPerson getInstance(){
    return PersonHolder.person;
  }

  public static class PersonHolder{
    private static final InnerPerson person = new InnerPerson();
  }

  public static void main(String[] args) {
    InnerPerson p1 = InnerPerson.getInstance();
    InnerPerson p2 = InnerPerson.getInstance();

    System.out.println(p1 == p2);
  }

}
