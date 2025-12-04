package com.vilin.dp.creation.singleton;

/**
 * double check lazy singleton
 */
public class LazyPerson {
  private String name;
  private int age;

  private static volatile LazyPerson person;

  private LazyPerson(){

  }

  public static LazyPerson getInstance(){
    // double check
    if(person == null){
      synchronized (LazyPerson.class){
        if(person == null){
          person = new LazyPerson();
        }
      }
    }
    return person;
  }

  public static void main(String[] args) {
    LazyPerson p1 = LazyPerson.getInstance();
    LazyPerson p2 = LazyPerson.getInstance();

    System.out.println(p1 == p2);
  }

}
