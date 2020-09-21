package com.vilin.absfactory.pizzastroe.order;


import com.vilin.absfactory.pizzastroe.pizza.LDCheesePizza;
import com.vilin.absfactory.pizzastroe.pizza.LDPepperPizza;
import com.vilin.absfactory.pizzastroe.pizza.Pizza;

public class LDFactory implements AbsFactory {

	public Pizza createPizza(String orderType) {
		System.out.println("~使用的是抽象工厂模式~");
		Pizza pizza = null;
		if (orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;
	}

}
