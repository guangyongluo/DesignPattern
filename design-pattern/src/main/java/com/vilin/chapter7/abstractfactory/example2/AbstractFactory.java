package com.vilin.chapter7.abstractfactory.example2;
/**
 * 抽象工厂的接口，声明创建抽象产品对象的操作
 */
public interface AbstractFactory {
	/**
	 * 创建抽象产品A的对象
	 * @return 抽象产品A的对象
	 */
	public AbstractProductA createProductA();
	/**
	 * 创建抽象产品B的对象
	 * @return 抽象产品B的对象
	 */
	public AbstractProductB createProductB();
}