package com.vilin.chapter7.abstractfactory.example4;
/**
 * 现代内存类
 */
public class HyMemory implements MemoryApi{
	public void cacheData() {
		System.out.println("现在正在使用现代内存");
	}
}
