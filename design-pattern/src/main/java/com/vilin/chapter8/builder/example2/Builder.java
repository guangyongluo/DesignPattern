package com.vilin.chapter8.builder.example2;

/**
 * 生成器接口，定义创建一个产品对象所需的各个部件的操作
 */
public interface Builder {
	/**
	 * 构建某个部件
	 */
	public void buildPart();
}