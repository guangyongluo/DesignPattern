package com.vilin.chapter20.flyweight.example2;

/**
 * 不需要共享的flyweight对象
 * 通常是将被共享的享元对象作为子节点组合出来的对象
 */
public class UnsharedConcreteFlyweight implements Flyweight{
	/**
	 * 描述对象的状态
	 */
	private String allState;
	
	public void operation(String extrinsicState) {
		// 具体的功能处理
	}
}
