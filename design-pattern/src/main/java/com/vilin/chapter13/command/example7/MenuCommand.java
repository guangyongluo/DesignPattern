package com.vilin.chapter13.command.example7;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 菜单对象，是个宏命令对象
 */
public class MenuCommand implements Command {
	
	/**
	 * 用来记录组合本菜单的多道菜品，也就是多个命令对象
	 */
	private Collection<Command> col = new ArrayList<Command>();
	/**
	 * 点菜，把菜品加入到菜单中
	 * @param cmd 客户点的菜
	 */
	public void addCommand(Command cmd){
		col.add(cmd);
	}
	public void setCookApi(CookApi cookApi){
		//什么都不做
	}
	public int getTableNum(){
		//什么都不做
		return 0;
	}
	/**
	 * 获取菜单中的多个命令对象
	 * @return 菜单中的多个命令对象
	 */
	public Collection<Command> getCommands(){
		return this.col;
	}	
	
	public void execute() {
		//执行菜单其实就是把菜单传递给后厨
		CommandQueue.addMenu(this);
	}
}
