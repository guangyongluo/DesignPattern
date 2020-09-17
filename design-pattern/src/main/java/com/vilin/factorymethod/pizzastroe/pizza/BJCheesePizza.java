package com.vilin.factorymethod.pizzastroe.pizza;

public class BJCheesePizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("北京的奶酪pizza");
		System.out.println("北京的奶酪pizza准备原材料");
	}

}
