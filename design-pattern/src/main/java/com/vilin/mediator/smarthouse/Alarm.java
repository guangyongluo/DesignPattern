package com.vilin.mediator.smarthouse;

//具体的同事类
public class Alarm extends Colleague {

	//构造器
	public Alarm(Mediator mediator, String name) {
		super(mediator, name);
		// TODO Auto-generated constructor stub
		//在创建Alarm同事对象时，将自己放入到ConcreteMediator对象中[集合]
		mediator.register(name, this);
	}

	public void sendAlarm(int stateChange) {
		sendMessage(stateChange);
	}

	@Override
	public void sendMessage(int stateChange) {
		// TODO Auto-generated method stub
		//调用的中介者对象的getMessage
		this.getMediator().getMessage(stateChange, this.name);
	}

}
