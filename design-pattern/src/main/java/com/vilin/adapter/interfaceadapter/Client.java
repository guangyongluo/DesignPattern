package com.vilin.adapter.interfaceadapter;

public class Client {
	public static void main(String[] args) {

		AbsAdapter absAdapter = new AbsAdapter() {
			@Override
			public void m1() {
				System.out.println("使用了m1方法");
			}
		};
		
//		AbsAdapter absAdapter = new AbsAdapter() {
//			//只需要去覆盖我们需要使用接口的方法
//			@Override
//			public void m1() {
//				// TODO Auto-generated method stub
//				System.out.println("使用了m1方法");
//			}
//		};
		
		absAdapter.m1();
	}
}
