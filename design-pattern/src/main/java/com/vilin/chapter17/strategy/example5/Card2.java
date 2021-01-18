package com.vilin.chapter17.strategy.example5;
/**
 * 支付到银行卡
 */
public class Card2 implements PaymentStrategy{
	/**
	 * 账户信息
	 */
	private String account = "";
	/**
	 * 构造函数，传入账户信息
	 * @param account 账户信息
	 */
	public Card2(String account){
		this.account = account;
	}
	public void pay(PaymentContext ctx) {
		System.out.println("现在给"+ctx.getUserName()+"的"+this.account+"账户支付了"+ctx.getMoney()+"元");
		//连接银行，进行转账，就不去管了
	}
}
