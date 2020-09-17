package com.vilin.factorymethod.pizzastroe.order;


import com.vilin.factorymethod.pizzastroe.pizza.LDCheesePizza;
import com.vilin.factorymethod.pizzastroe.pizza.LDPepperPizza;
import com.vilin.factorymethod.pizzastroe.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {


    @Override
    public Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        // TODO Auto-generated method stub
        return pizza;
    }

}
