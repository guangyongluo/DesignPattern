package com.vilin.chapter13.command.example6;
import java.util.*;
/**
 * 命令对列类
 */
public class CommandQueue {
	/**
	 * 用来储存命令对象的对象
	 */
	private static List<Command> cmds = new ArrayList<Command>();
	/**
	 * 服务员传过来一个新的菜单，需要同步
	 * 因为同事会有很多的服务员传入菜单，而同时又有很多厨师在从对列里取值
	 * @param menu 传入的菜单
	 */
	public synchronized static void addMenu(MenuCommand menu){
		//一个菜单对象包含很多命令对象
		for(Command cmd : menu.getCommands()){
			cmds.add(cmd);
		}
	}
	/**
	 * 厨师从命令对列里面获取命令对象进行处理，也是需要同步的
	 */
	public synchronized static Command getOneCommand(){
		Command cmd = null;
		if(cmds.size() > 0 ){
			//取出对列的第一个，因为是约定的按照加入的先后来处理
			cmd = cmds.get(0);
			//同时从对列里面取掉这个命令对象
			cmds.remove(0);
		}
		return cmd;
	}
}
