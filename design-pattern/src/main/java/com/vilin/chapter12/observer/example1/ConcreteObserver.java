package com.vilin.chapter12.observer.example1;

/**
 * 具体观察者对象，实现更新的方法，使自身的状态和目标的状态保存一致
 */
public class ConcreteObserver implements Observer {
	/**
	 * 观察者的状态
	 */
	private String observerState;
	
	public void update(Subject subject) {
		// 具体的更新实现
		//这里可能需要更新观察者的状态，使其与目标的状态保存一致
		observerState = ((ConcreteSubject)subject).getSubjectState();
	}
}

