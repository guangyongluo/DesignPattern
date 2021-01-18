package com.vilin.chapter17.strategy.example8;

/**
 * 记录日志策略的接口
 */
public interface LogStrategy {
	/**
	 * 记录日志
	 * @param msg 需记录的日志信息
	 */
	public void log(String msg);
}
