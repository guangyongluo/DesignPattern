package com.vilin.observer.improve;

//观察者接口，由观察者来实现
public interface Observer {

	public void update(float temperature, float pressure, float humidity);
}
