package com.vilin.chapter14.iterator.example4;


/**
 * 被客户方收购的那个公司的工资管理类
 */
public class SalaryManager{
	/**
	 * 用数组管理
	 */
	private PayModel[] pms = null;
	/**
	 * 获取工资列表
	 * @return 工资列表
	 */
	public PayModel[] getPays(){
		return pms;
	}
	/**
	 * 计算工资，其实应该有很多参数，为了演示从简
	 */
	public void calcSalary(){
		//计算工资，并把工资信息填充到工资列表中
		//为了测试，输入些数据进去
		PayModel pm1 = new PayModel();
		pm1.setPay(2200);
		pm1.setUserName("张三");
		
		PayModel pm2 = new PayModel();
		pm2.setPay(3600);
		pm2.setUserName("李四");
		
		pms = new PayModel[2];
		pms[0] = pm1;
		pms[1] = pm2;
	}
}
