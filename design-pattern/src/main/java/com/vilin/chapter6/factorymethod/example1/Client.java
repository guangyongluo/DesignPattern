package com.vilin.chapter6.factorymethod.example1;

public class Client {
	public static void main(String[] args) {
		ExportOperate operate = new ExportOperate();
		operate.export(1, "测试数据");
	}
}
