package com.vilin.chapter2.simplefactory.example3;
/**
 * 工厂类用来创建Api对象
 */
public class Factory {
	/**
	 * 具体创建Api对象的方法
	 * @return 创建好的Api对象
	 */
	public static Api createApi(){
		//由于只有一个条件，就不用条件来判断了
		return new Impl();
	}
}
