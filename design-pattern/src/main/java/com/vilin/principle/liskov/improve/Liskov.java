package com.vilin.principle.liskov.improve;

public class Liskov {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		System.out.println("11-3=" + a.func1(11, 3));
		System.out.println("1-8=" + a.func1(1, 8));

		System.out.println("-----------------------");
		B b = new B();
		//因为B类不再继承A类，因此调用者不再使用func1来求减法了
		System.out.println("11+3=" + b.func1(11, 3));//这里的本意就是11+3
		System.out.println("1+8=" + b.func1(1, 8));// 1+8
		System.out.println("11+3+9=" + b.func2(11, 3));
		
		
		//使用组合仍然可以使用A类的相关方法
		System.out.println("11-3=" + b.func3(11, 3));// 这里的本意就是求11-3
		

	}

}

//创建一个更加基础的基类
class Base {
	//把更加基础的方法和成员写到Base类里面
}

// A类
class A extends Base {
	// 返回两个数的差
	public int func1(int num1, int num2) {
		return num1 - num2;
	}
}

// B类继承了A类
// 添加一个新更能: 完成两个数相加然后和9就和
class B extends Base {
	//如果类B需要使用A类的方法,可以使用组合关系
	private A a = new A();
	
	//这里重写了A类的方法有可能是无意的
	public int func1(int a, int b) {
		return a + b;
	}

	public int func2(int a, int b) {
		return func1(a, b) + 9;
	}
	
	//我们想使用A类的方法
	public int func3(int a, int b) {
		return this.a.func1(a, b);
	}
}
