package com.vilin.chapter14.iterator.example7;
import java.util.*;
public class Client {
	public static void main(String[] args) {
		//访问集团的工资列表
		SalaryManager salaryManager = new SalaryManager();
		//先计算再获取
		salaryManager.calcSalary();
		
		//获得双向迭代器
		Iterator it = salaryManager.createIterator();
		//首先设置迭代器到第一个元素
		it.first();
		
		//先next一下
		if(!it.isDone()){
			PayModel pm = (PayModel)it.currentItem();
			System.out.println("next1 == "+pm);
			//向下迭代一个
			it.next();
		}
		//然后previous一下
		if(!it.isFirst()){
			//向前迭代一个
			it.previous();
			PayModel pm = (PayModel)it.currentItem();
			System.out.println("previous1 == "+pm);			
		}
		//再next一下
		if(!it.isDone()){
			PayModel pm = (PayModel)it.currentItem();
			System.out.println("next2 == "+pm);
			//向下迭代一个
			it.next();
		}
		//继续next一下
		if(!it.isDone()){
			PayModel pm = (PayModel)it.currentItem();
			System.out.println("next3 == "+pm);
			//向下迭代一个
			it.next();
		}
		//然后previous一个
		if(!it.isFirst()){
			//向前迭代一个
			it.previous();
			PayModel pm = (PayModel)it.currentItem();
			System.out.println("previous2 == "+pm);			
		}
		
	}
}
