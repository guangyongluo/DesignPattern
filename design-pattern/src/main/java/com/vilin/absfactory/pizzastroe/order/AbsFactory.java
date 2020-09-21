package com.vilin.absfactory.pizzastroe.order;

import com.vilin.absfactory.pizzastroe.pizza.Pizza;

//抽象工厂模式的抽象层(接口)
public interface AbsFactory {
	//让下面的工厂子类来具体实现
	public Pizza createPizza(String orderType);
}
