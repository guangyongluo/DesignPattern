package com.vilin.chapter3.facade.example2;
/**
 * 外观对象
 */
public class Facade {
	/**
	 * 满足客户需求的功能
	 */
	public void test(){
		//在内部实现的时候，可能会调用到内部多个模块
		AModuleApi a = new AModuleImpl();
		a.testA();
		BModuleApi b = new BModuleImpl();
		b.testB();
		CModuleApi c = new CModuleImpl();
		c.testC();
	}
}
