package com.vilin.chapter22.decorator.example1;

public class Client {
	public static void main(String[] args) {
		//先创建计算奖金的对象
		Prize p = new Prize();
		
		//日期对象都没有用上，所有传null就可以了
		double zs = p.calcPrize("张三",null,null);
		System.out.println("==========张三应得奖金"+zs);
		double ls = p.calcPrize("李四",null,null);
		System.out.println("==========李四应得的奖金"+ls);
		double ww = p.calcPrize("王五",null,null);
		System.out.println("==========王五应得的奖金"+ww);
	}
}
