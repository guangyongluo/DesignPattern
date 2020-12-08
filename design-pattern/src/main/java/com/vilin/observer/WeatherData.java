package com.vilin.observer;

/**
 * 类是核心类
 * 1. 包含最新的天气情况
 * 2. 包含CurrentConditions对象
 * 3. 当数据有更新时，就主动的调用CurrentConditions对象update方法(含display),这样接入方就看到了最新的信息
 * @author Administrator
 *
 */
public class WeatherData {
	private float temperatrue;
	private float pressure;
	private float humidity;
	private CurrentConditions currentConditions;
	//加入新的第三方

	public WeatherData(CurrentConditions currentConditions) {
		this.currentConditions = currentConditions;
	}

	public float getTemperature() {
		return temperatrue;
	}

	public float getPressure() {
		return pressure;
	}

	public float getHumidity() {
		return humidity;
	}

	public void dataChange() {
		//调用接入方的update
		currentConditions.update(getTemperature(), getPressure(), getHumidity());
	}

	//当数据有更新时就调用setData
	public void setData(float temperature, float pressure, float humidity) {
		this.temperatrue = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		//调用dataChange将最新的信息推送给接入方currentConditions
		dataChange();
	}
}
