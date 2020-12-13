package com.vilin.chapter2.simplefactory.example5;
import java.util.*;
import java.io.*;
/**
 * 工厂类用来创建Api对象
 */
public class Factory {
	/**
	 * 具体创建Api对象的方法，根据配置文件的参数来创建接口
	 * @return 创建好的Api对象
	 */
	public static Api createApi(){
		//直接读取配置文件类获取需要创建的参数来创建接口
		Properties p = new Properties(); 
		InputStream in = null;
		try {
			in = Factory.class.getResourceAsStream("FactoryTest.properties");
			p.load(in);
		} catch (IOException e) {
			System.out.println("装载工厂配置文件出错了，具体的堆栈信息如下：");
			e.printStackTrace();
		}finally{
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//用反射区创建
		Api api = null;
		try {
			api = (Api)Class.forName(p.getProperty("ImplClass")).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return api;
	}
}