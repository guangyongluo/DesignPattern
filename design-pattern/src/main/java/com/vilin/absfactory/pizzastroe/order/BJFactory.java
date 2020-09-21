package com.vilin.absfactory.pizzastroe.order;

import com.vilin.absfactory.pizzastroe.pizza.BJCheesePizza;
import com.vilin.absfactory.pizzastroe.pizza.BJPepperPizza;
import com.vilin.absfactory.pizzastroe.pizza.Pizza;

//这是一个工厂子类
public class BJFactory implements AbsFactory {

	public Pizza createPizza(String orderType) {
		System.out.println("~使用的是抽象工厂模式~");
		// TODO Auto-generated method stub
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("pepper")){
			pizza = new BJPepperPizza();
		}
		return pizza;
	}

}
