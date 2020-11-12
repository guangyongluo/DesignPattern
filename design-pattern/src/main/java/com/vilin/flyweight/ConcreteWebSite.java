package com.vilin.flyweight;

//具体网站
public class ConcreteWebSite extends WebSite {

	//共享的部分(内部状态)
	private String type = ""; //网站发布的形式(类型)

	
	//构造器
	public ConcreteWebSite(String type) {
		
		this.type = type;
	}


	@Override
	public void use(User user) {
		// TODO Auto-generated method stub
		System.out.println("网站发布的形式为:" + type + " 在使用中 .. 谁在使用：" + user.getName());
	}
	
	
}
