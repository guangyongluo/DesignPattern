package com.vilin.chapter13.command.example5;

/**
 * 命令接口，声明执行的操作
 */
public interface Command {
	/**
	 * 执行命令对应的操作
	 */
	public void execute();
}