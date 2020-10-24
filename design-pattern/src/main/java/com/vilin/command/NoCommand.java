package com.vilin.command;

/**
 * 没有任何命令，即空执行: 用于初始化每个按钮，当调用空命令时，对象什么都不做
 * 其实这是一种设计模式，可以省掉对空的判断
 * @author Administrator
 *
 */
public class NoCommand implements Command {

	public void execute() {
		// TODO Auto-generated method stub
		
	}

	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
