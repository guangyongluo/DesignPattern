package com.vilin.command;

public class LightOnCommand implements Command {

	//聚合LightReceiver
	
	LightReceiver light;
	
	//构造器
	public LightOnCommand(LightReceiver light) {
		super();
		this.light = light;
	}

	public void execute() {
		// TODO Auto-generated method stub
		//调用接受者的方法
		light.on();
	}

	public void undo() {
		// TODO Auto-generated method stub
		//调用接受者的方法
		light.off();
	}

}
