package com.vilin.dp.creation.prototype;

public class User implements Cloneable{

  private String name;
  private int age;

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public User clone() {
    try {
      // TODO: copy mutable state here, so the clone can't change the internals of the original
      return (User) super.clone();
    } catch (CloneNotSupportedException e) {
      throw new AssertionError();
    }
  }

  public static void main(String[] args) {
    User u1 = new User();
    u1.setName("luowei");
    u1.setAge(30);

    User u2 = (User) u1.clone();

    System.out.println(u1 == u2);
    System.out.println(u2.getName());
    System.out.println(u2.getAge());
  }
}
