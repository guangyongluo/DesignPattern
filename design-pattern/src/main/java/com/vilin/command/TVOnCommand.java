package com.vilin.command;

public class TVOnCommand implements Command {

	// 聚合TVReceiver

	TVReceiver tv;

	// 构造器
	public TVOnCommand(TVReceiver tv) {
		super();
		this.tv = tv;
	}

	public void execute() {
		// TODO Auto-generated method stub
		// 调用接受者的方法
		tv.on();
	}

	public void undo() {
		// TODO Auto-generated method stub
		// 调用接受者的方法
		tv.off();
	}
}
