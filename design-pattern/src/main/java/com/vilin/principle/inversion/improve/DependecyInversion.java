package com.vilin.principle.inversion.improve;

public class DependecyInversion {

    public static void main(String[] args) {
        //客户端无需改变
        Person person = new Person();
        person.receive(new Email());

        person.receive(new WeiXin());
    }

}

//定义接口
interface IReceiver {
    public String getInfo();
}

//消息类1
class Email implements IReceiver {
    public String getInfo() {
        return "电子邮件信息: hello,world";
    }
}

//消息类2
class WeiXin implements IReceiver {
    public String getInfo() {
        return "微信消息: hello,ok";
    }
}

//方法2
class Person {
    //这里我们对接口的依赖
    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}
