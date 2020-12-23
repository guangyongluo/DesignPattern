package com.vilin.chapter6.factorymethod.example2;
/**
 * 具体的创建器实例对象
 */
public class ConcreteCreator extends Creator {
	public Product factoryMethod() {
		//重定义工厂方法，返回一个具体的Product对象
		return new ConcreteProduct();
	}
}

