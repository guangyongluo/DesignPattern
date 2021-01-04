package com.vilin.chapter12.observer.example5;
/**
 * 水质观察者接口定义
 */
public interface WatcherObserver {
	/**
	 * 被通知的方法
	 * @param subject 传入被观察的目标对象
	 */
	public void update(WaterQualitySubject subject);
	/**
	 * 设置观察人员的职责
	 * @param job 观察人员的职责
	 */
	public void setJob(String job);
	/**
	 * 获取观察者人员的职务
	 * @return 观察者人员的职务
	 */
	public String getJob();
}