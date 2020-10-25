package com.vilin.visitor;

//说明
//1. 这里我们使用了双分派，即首先在客户端程序中，将具体状态作为参数传递Woman中(第一次分派)
//2. 然后Woman类调用作为参数的"具体方法"中方法getWomanResult, 同时将自己(this)作为参数
//   传入，完成了第二次的分派
public class Woman extends Person{

	@Override
	public void accept(Action action) {
		// TODO Auto-generated method stub
		action.getWomanResult(this);
	}

}
