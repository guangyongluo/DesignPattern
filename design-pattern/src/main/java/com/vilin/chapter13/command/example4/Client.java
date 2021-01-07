package com.vilin.chapter13.command.example4;

public class Client {
	public static void main(String[] args) {
		//1：组装命令和接收者
		//创建接收者
		OperationApi operation = new Operation();
		//创建命令对象，并组装命令和接收者
		AddCommand addCmd = new AddCommand(operation,5);
		SubstractCommand substractCmd = new SubstractCommand(operation,3);
		
		//2：把命令设置到持有者，也就是计算器里面
		Calculator calculator = new Calculator();
		calculator.setAddCmd(addCmd);
		calculator.setSubstractCmd(substractCmd);
		
		//3：模拟按下按钮，测试一个
		calculator.addPressed();
		System.out.println("一次加法运算后的结果为："+operation.getResult());
		calculator.substractPressed();
		System.out.println("一次减法运算后的结果为："+operation.getResult());
		
		//测试撤销
		calculator.undoPressed();
		System.out.println("撤销一次后的结果为："+operation.getResult());
		calculator.undoPressed();
		System.out.println("撤销一次后的结果为："+operation.getResult());
		
		//测试重做
		calculator.redoPressed();
		System.out.println("重做一次后的结果为："+operation.getResult());
		calculator.redoPressed();
		System.out.println("重做一次后的结果为："+operation.getResult());
	}
}
