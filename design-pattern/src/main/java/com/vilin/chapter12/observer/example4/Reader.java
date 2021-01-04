package com.vilin.chapter12.observer.example4;

import java.util.Observable;

/**
 * 真正的读者，为了简单就描述一下姓名
 */
public class Reader implements java.util.Observer{
	/**
	 * 读者的姓名
	 */
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void update(Observable o, Object obj) {
		//这了采用推的方式
		System.out.println(name+"收到报纸了，阅读先。目标推过来的内容是==="+obj);
		//这里是拉的方式
		System.out.println(name+"收到报纸了，阅读先。主动到目标对象去拉的内容是==="
		+((NewsPaper)o).getContent());
	}
	
}
