package com.vilin.chapter13.command.example1;

public class Client {
	/**
	 * 负责创建命令对象，并设置它的接收者
	 */
	public void assemble(){
		//创建接收者
		Receiver receiver = new Receiver();
		//创建命令对象，设定它的接收者
		Command command = new ConcreteCommand(receiver);
		//创建Invoker，把命令对象设置进去
		Invoker invoker = new Invoker();
		invoker.setCommand(command);
	}
}
