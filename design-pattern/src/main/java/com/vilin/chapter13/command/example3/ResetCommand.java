package com.vilin.chapter13.command.example3;
/**
 * 重启机器命令的实现，实现Command接口
 * 持有重启机器命令的真正实现，通过调用接受者的方法来实现命令
 */
public class ResetCommand implements Command{
	/**
	 * 持有真正实现命令的接受者——主板对象
	 */
	private MainBoardApi mainBoard = null;
	/**
	 * 构造方法，传入主板对象
	 * @param mainBoard 主板对象
	 */
	public ResetCommand(MainBoardApi mainBoard) {
		this.mainBoard = mainBoard;
	}
	
	public void execute() {
		//对于命令对象，根本不知道如何开机，会转调主板对象
		//让主板去完成开机的功能
		this.mainBoard.reset();
	}
}
