package com.vilin.facade;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//使用外观类调用各个系统开始工作
		HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
		homeTheaterFacade.ready();
		homeTheaterFacade.play();
		
		
		homeTheaterFacade.end();
	}

}
