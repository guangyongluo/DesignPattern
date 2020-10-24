package com.vilin.command;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//使用命令设计模式，完成通过遥控器对电灯的操作
		
		//创建电灯接受者
		LightReceiver lightReceiver = new LightReceiver();
		
		//创建电灯的开关的命令
		LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
		LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
		
		//创建遥控器
		RemoteController remoteController = new RemoteController();
		
		//给遥控器设置命令，例如no = 0中电灯的开关操作
		remoteController.setCommand(0, lightOnCommand, lightOffCommand);
		
		System.out.println("--------按下电灯开的按钮-----------");
		remoteController.onButtonWasPushed(0);
		System.out.println("--------按下电灯关的按钮-----------");
		remoteController.offButtonWasPushed(0);
		System.out.println("--------按下撤销按钮-----------");
		remoteController.undoButtonWasPushed();
		
		
		System.out.println("=========使用遥控器操作电视机==========");
		
		TVReceiver tvReceiver = new TVReceiver();
		
		TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
		TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
		
		//给遥控器设置命令，例如no = 1中电视机的开关操作
		remoteController.setCommand(1, tvOnCommand, tvOffCommand);
		
		System.out.println("--------按下电视机开的按钮-----------");
		remoteController.onButtonWasPushed(1);
		System.out.println("--------按下电视机关的按钮-----------");
		remoteController.offButtonWasPushed(1);
		System.out.println("--------按下撤销按钮-----------");
		remoteController.undoButtonWasPushed();

	}

}
