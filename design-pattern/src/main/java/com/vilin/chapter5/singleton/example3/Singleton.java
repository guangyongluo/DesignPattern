package com.vilin.chapter5.singleton.example3;
/**
 * 饿汉式单例实现的示例
 */
public class Singleton {
	/**
	 * 定义一个变量来存储创建好的类实例，直接在这里创建类实例，只能创建一次
	 */
	private static Singleton uniqueInstance = new Singleton();
	/**
	 * 私有化构造方法，可以在内部控制创建实例的数目
	 */
	private Singleton(){
		//
	}
	/**
	 * 定义一个方法来为客户端提供类实例
	 * @return 一个Singleton的实例
	 */
	public static Singleton getInstance(){
		//直接使用已经创建好的实例
		return uniqueInstance;
	}
	
	/**
	 * 单例可以有自己的操作
	 */
	public void singletonOperation(){
		//功能处理
	}
	/**
	 * 单例可以有自己的属性
	 */
	private String singletonData;
	/**
	 * 让外部通过这些方法类访问属性的值
	 * @return 属性的值
	 */
	public String getSingletonData(){
		return singletonData;
	}
}
