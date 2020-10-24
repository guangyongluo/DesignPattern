package com.vilin.adapter.objectadapter;

//适配器类
public class VoltageAdapter  implements IVoltage5V {

	private Voltage220V voltage220V; // 持有Voltage220v对象，不再继承了
	
	
	//通过构造器，传入一个Voltage220V实例
	public VoltageAdapter(Voltage220V voltage220v) {
		
		this.voltage220V = voltage220v;
	}

	public int output5V() {
		
		int dst = 0;
		if(null != voltage220V) {
			int src = voltage220V.output220V();//获取220V的电压
			System.out.println("使用对象适配器进行适配~~");
			dst = src / 44;
			System.out.println("适配完成，输出的电压为=" + dst);
		}
		
		return dst;
		
	}

}
