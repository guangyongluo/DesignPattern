package com.vilin.principle.inversion;

public class DependecyInversion {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }

}


class Email {
    public String getInfo() {
        return "电子邮件信息: hello,world";
    }
}

//完成Person接受消息的功能
//方法1分析
//1. 比较容易想到直接依赖类来发送消息；
//2. 如果我们获得对象是微信、短信等等，则我们必须新增类和新增接受消息的方法；
//3. 解决思路我们引入抽象接口IReceiver, 表示接受者, 同时Person类与接口IReceiver发生依赖
//   因此Email, WeiXin 等可接受的消息类它们各自实现IReceiver接口就ok,这样我们就符合依赖倒转原则
class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}
