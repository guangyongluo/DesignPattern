package com.vilin.chapter2.simplefactory.example4;
/**
 * 对接口的实现
 */
public class Impl implements Api{
	
	public void test1(String s) {
		System.out.println("Now In Impl. The input s=="+s);
	}
}
