package com.vilin.proxy.dynamic;

public class TeacherDao implements ITeacherDao {

	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("老师正在授课中.... ");
	}

	public void sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println("hello " + name);
	}
	
}
