package com.vilin.chapter2.simplefactory.example5;
/**
 * 某个接口(通用的、抽象的、非具体的功能)
 */
public interface Api {
	/**
	 * 某个具体的功能方法定义，用test1来演示一下。
	 * 这里的功能很简单，把传入的s打印出来即可。
	 * @param s 任意想要打印输出的字符串
	 */
	void test1(String s);
}
