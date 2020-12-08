package com.vilin.mediator.smarthouse;

public class CoffeeMachine extends Colleague {

	public CoffeeMachine(Mediator mediator, String name) {
		super(mediator, name);
		// TODO Auto-generated constructor stub
		mediator.register(name, this);
	}

	@Override
	public void sendMessage(int stateChange) {
		// TODO Auto-generated method stub
		this.getMediator().getMessage(stateChange, this.name);
	}

	public void startCoffee() {
		System.out.println("It's time to start coffee!");
	}

	public void finishCoffee() {

		System.out.println("After 5 minutes!");
		System.out.println("Coffee is ok!");
		sendMessage(0);
	}
}
