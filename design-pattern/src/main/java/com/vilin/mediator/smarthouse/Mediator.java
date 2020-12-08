package com.vilin.mediator.smarthouse;

public abstract class Mediator {
	//将中介者对象加入到集合中
	public abstract void register(String colleagueName, Colleague colleague);

	//接收消息, 具体的同事对象
	public abstract void getMessage(int stateChange, String colleagueName);

	public abstract void sendMessage();
}
