package com.vilin.memento.theory;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
	
	//在List集合中有很多的备忘录对象
	private List<Memento> mementoList = new ArrayList<Memento>();
	
	public void add(Memento memento) {
		mementoList.add(memento);
	}
	
	//获取到第index个Originator的备忘录对象()
	public Memento get(int index) {
		return mementoList.get(index);
	}
}
