package com.vilin.iterator;

import java.util.Iterator;

public interface College {
	
	public String getName();
	
	//增加系的方法
	public void addDepartment(String name, String desc);
	
	//返回迭代器的方法
	public Iterator  createIterator();
}
