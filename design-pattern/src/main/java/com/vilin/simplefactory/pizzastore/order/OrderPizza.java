package com.vilin.simplefactory.pizzastore.order;

import com.vilin.simplefactory.pizzastore.pizza.CheesePizza;
import com.vilin.simplefactory.pizzastore.pizza.GreekPizza;
import com.vilin.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    //构造器
//    public OrderPizza() {
//        Pizza pizza = null;
//        String orderType;
//        do {
//            orderType = getType();
//            if (orderType.equals("greek")) {
//                pizza = new GreekPizza();
//                pizza.setName("希腊披萨");
//            } else if (orderType.equals("cheese")) {
//                pizza = new CheesePizza();
//                pizza.setName("奶酪披萨");
//            } else if(orderType.equals("pepper")){
//                pizza = new CheesePizza();
//                pizza.setName("胡椒披萨");
//            }else{
//                break;
//            }
//
//            //输出披萨制作过程
//
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        } while (true);
//    }

    public OrderPizza(SimpleFactory simpleFactory) {
        setFactory(simpleFactory);
    }

    //定义一个简单工厂对象
    private SimpleFactory simpleFactory;
    private Pizza pizza;


    public void setFactory(SimpleFactory simpleFactory) {

        String orderType; //用户输入

        this.simpleFactory = simpleFactory; //设置简单工厂对象

        do {
            orderType = getType();
            pizza = simpleFactory.createPizza(orderType);

            //输出pizza
            if (null != pizza) { //订购成功
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购pizza失败");
                break;
            }


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
