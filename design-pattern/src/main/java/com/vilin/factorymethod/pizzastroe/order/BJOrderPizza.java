package com.vilin.factorymethod.pizzastroe.order;


import com.vilin.factorymethod.pizzastroe.pizza.BJCheesePizza;
import com.vilin.factorymethod.pizzastroe.pizza.BJPepperPizza;
import com.vilin.factorymethod.pizzastroe.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {


    @Override
    public Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        // TODO Auto-generated method stub
        return pizza;
    }

}
