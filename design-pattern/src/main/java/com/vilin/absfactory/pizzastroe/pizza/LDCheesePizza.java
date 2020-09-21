package com.vilin.absfactory.pizzastroe.pizza;

public class LDCheesePizza extends Pizza{

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("伦敦的奶酪pizza");
		System.out.println("伦敦的奶酪pizza准备原材料");
	}
}
