package com.vilin.factorymethod.pizzastroe.pizza;

public class BJPepperPizza extends Pizza {
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("北京的胡椒pizza");
		System.out.println("北京的胡椒pizza准备原材料");
	}
}
