package com.vilin.visitor;

import java.util.LinkedList;
import java.util.List;

//数据解构，管理很多人(Man , Woman)
public class ObjectStructure {

	//维护了一个集合
	private List<Person> persons = new LinkedList<Person>();
	
	//添加到list
	public void attach(Person p) {
		persons.add(p);
	}
	//移除
	public void detach(Person p) {
		persons.remove(p);
	}
	
	//显示测评的情况
	public void display(Action action) {
		for(Person p: persons) {
			p.accept(action);
		}
	}
}
