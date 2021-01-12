package com.vilin.chapter15.composite.example7;

import java.util.Iterator;
/**
 * 组合对象，包含检查环状引用
 */
public abstract class Component {
	/**
	 * 记录每个组件的路劲
	 */
	private String componentPath = "";
	/**
	 * 获取组件的路劲
	 * @return 组件的路劲
	 */
	public String getComponentPath() {
		return componentPath;
	}
	/**
	 * 设置组件的路劲
	 * @param componentPath 组件的路劲
	 */
	public void setComponentPath(String componentPath) {
		this.componentPath = componentPath;
	}
	/**
	 * 获取组件的名称
	 * @return 组件的名称
	 */
	public abstract String getName();
	
	/*-------------------以下是原有的定义----------------------*/
	
	/**
	 * 输出组件自身的名称
	 */
	public abstract void printStruct(String preStr);

	/**
	 * 向组件对象中加入组件对象
	 * @param child 被加入组件对象中的组件对象
	 */
	public void addChild(Component child) {
		// 缺省的实现，抛出例外，因为叶子对象没有这个功能或者子组件没有实现这个功能
		throw new UnsupportedOperationException("对象不支持这个功能");

	}

	/**
	 * 从组合对象中移出某个组件对象
	 * @param child 被移出某个组件对象
	 */
	public void removeChild(Component child) {
		// 缺省的实现，抛出例外，因为叶子对象没有这个功能或者子组件没有实现这个功能
		throw new UnsupportedOperationException("对象不支持这个功能");
	}

	/**
	 * 返回某个索引对应的组件对象
	 * @param index 需要获取的组件对象的索引，索引从0开始
	 * @return 索引对应的组件对象
	 */
	public Component getChildren(int index) {
		throw new UnsupportedOperationException("对象不支持这个功能");
	}
}

