package com.vilin.chapter22.decorator.example6;

public class GoodsSaleEbo implements GoodsSaleEbi{
	
	public boolean sale(String user,String customer, SaleModel saleModel) {
		System.out.println(user+"保存了"+customer+"购买 "+saleModel+" 的销售数据");
		return true;
	}
}
