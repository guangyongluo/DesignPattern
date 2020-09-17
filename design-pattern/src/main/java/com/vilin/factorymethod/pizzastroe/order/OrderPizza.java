package com.vilin.factorymethod.pizzastroe.order;

import com.vilin.factorymethod.pizzastroe.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {

    //定义一个抽象方法createPizza,让各个工厂子类自己实现
    public abstract Pizza createPizza(String orderType);

    //构造器
    public OrderPizza() {
        Pizza pizza = null;
        String orderType; //订购披萨的类型
        do {
            orderType = getType();
            pizza = createPizza(orderType); //抽象的方法，由工厂子类完成
            //输出pizza的制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

        } while (true);
    }


    //写一个方法，可以获取用户希望订购的披萨种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
