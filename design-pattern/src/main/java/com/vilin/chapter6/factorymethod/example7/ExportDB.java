package com.vilin.chapter6.factorymethod.example7;
/**
 *  导出成数据库备份文件形式的对象
 */
public class ExportDB implements ExportFileApi{
	public boolean export(String data) {
		//这里需要操作数据库和文件
		System.out.println("导出数据："+data+"到数据库备份文件");
		return true;
	}
}
