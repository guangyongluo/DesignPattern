package com.vilin.adapter.classadapater;

//适配器类
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

	public int output5V() {
		// TODO Auto-generated method stub
		//获取220V的电压
		int srcV = output220V();
		int dstV = srcV / 44 ; //5伏
		return dstV;
	}

}
