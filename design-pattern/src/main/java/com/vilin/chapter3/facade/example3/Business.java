package com.vilin.chapter3.facade.example3;
/**
 * 生成逻辑层代码的模块
 */
public class Business {
	public void generate(){
		//1：从配置管理里面获取相应的配置信息
		ConfigModel cm = ConfigManager.getInstance().getConfigData();
		if(cm.isNeedGenBusiness()){
			//2：按照要求去生成相应的代码，并保存成文件
			System.out.println("正在生成逻辑层代码文件");
		}
	}
}