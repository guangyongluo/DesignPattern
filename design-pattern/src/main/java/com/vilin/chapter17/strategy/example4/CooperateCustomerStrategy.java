package com.vilin.chapter17.strategy.example4;
/**
 * 具体算法实现，为战略合作客户计算应报的价格
 */
public class CooperateCustomerStrategy implements Strategy{
	public double calcPrice(double goodsPrice) {
		System.out.println("为战略合作客户，统一8折");
		return goodsPrice*0.8;
	}
}
