package com.vilin.command;

public class TVOffCommand implements Command {

	//聚合TVReceiver

	TVReceiver tv;

	// 构造器
	public TVOffCommand(TVReceiver tv) {
		super();
		this.tv = tv;
	}

	public void execute() {
		// TODO Auto-generated method stub
		// 调用接受者的方法
		tv.off();
	}

	public void undo() {
		// TODO Auto-generated method stub
		// 调用接受者的方法
		tv.on();
	}
}
