package com.vilin.chapter13.command.example6;

public class Client {
	public static void main(String[] args) {
		//先要启动后台，让整个程序运行起来
		CookManager.runCookManager();
		
		//为了简单，直接用循环模拟多个桌号点菜
		for(int i = 0;i<5;i++){
			//创建服务员
			Waiter waiter = new Waiter();
			//创建命令对象，就是要点的菜
			Command chop = new ChopCommand(i);
			Command duck = new DuckCommand(i);
			//点菜，就是把这些菜让服务员记录下来
			waiter.orderDish(chop);
			waiter.orderDish(duck);
			//点菜完毕
			waiter.orderOver();
		}		
	}
}

/*
������ʦ����Ϊ0���������̶��Ź���
������ʦΪ0���������ˣ��̶��Ź���,���ƺ�ʱ=13��
�����ʦ����Ϊ0��������������Ѽ
���ĳ�ʦ����Ϊ1���������̶��Ź���
���ĳ�ʦΪ1���������ˣ��̶��Ź���,���ƺ�ʱ=5��
�����ʦΪ0���������ˣ�������Ѽ,���ƺ�ʱ=18��
������ʦ����Ϊ1��������������Ѽ
������ʦΪ1���������ˣ�������Ѽ,���ƺ�ʱ=1��
���ĳ�ʦ����Ϊ2���������̶��Ź���
���ĳ�ʦΪ2���������ˣ��̶��Ź���,���ƺ�ʱ=12��
�����ʦ����Ϊ2��������������Ѽ
�����ʦΪ2���������ˣ�������Ѽ,���ƺ�ʱ=7��
������ʦ����Ϊ3���������̶��Ź���
������ʦΪ3���������ˣ��̶��Ź���,���ƺ�ʱ=15��
���ĳ�ʦ����Ϊ3��������������Ѽ
�����ʦ����Ϊ4���������̶��Ź���
���ĳ�ʦΪ3���������ˣ�������Ѽ,���ƺ�ʱ=17��
�����ʦΪ4���������ˣ��̶��Ź���,���ƺ�ʱ=16��
������ʦ����Ϊ4��������������Ѽ
������ʦΪ4���������ˣ�������Ѽ,���ƺ�ʱ=0��
*/