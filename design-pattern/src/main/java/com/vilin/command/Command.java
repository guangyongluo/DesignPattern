package com.vilin.command;


//创建命令接口
public interface Command {

	//ִ执行某个命令(操作)
	public void execute();
	//撤销某个命令(操作)
	public void undo();
}
