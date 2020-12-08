package com.vilin.mediator.smarthouse;

import java.util.HashMap;

//具体的中介者类
public class ConcreteMediator extends Mediator {
	//  集合，放入所有的同事对象
	private HashMap<String, Colleague> colleagueMap;
	private HashMap<String, String> interMap;

	public ConcreteMediator() {
		colleagueMap = new HashMap<String, Colleague>();
		interMap = new HashMap<String, String>();
	}

	@Override
	public void register(String colleagueName, Colleague colleague) {
		// TODO Auto-generated method stub
		colleagueMap.put(colleagueName, colleague);

		// TODO Auto-generated method stub

		if (colleague instanceof Alarm) {
			interMap.put("Alarm", colleagueName);
		} else if (colleague instanceof CoffeeMachine) {
			interMap.put("CoffeeMachine", colleagueName);
		} else if (colleague instanceof TV) {
			interMap.put("TV", colleagueName);
		} else if (colleague instanceof Curtains) {
			interMap.put("Curtains", colleagueName);
		}

	}

	//具体的中介者核心方法
	//1. 根据得到的消息，完成对应任务
	//2. 中介者在这个方法，协调各个具体的同事对象，完成任务
	@Override
	public void getMessage(int stateChange, String colleagueName) {
		// TODO Auto-generated method stub

		//处理闹钟发出的消息
		if (colleagueMap.get(colleagueName) instanceof Alarm) {
			if (stateChange == 0) {
				((CoffeeMachine) (colleagueMap.get(interMap.get("CoffeeMachine")))).startCoffee();
				((TV) (colleagueMap.get(interMap.get("TV")))).startTv();
			} else if (stateChange == 1) {
				((TV) (colleagueMap.get(interMap.get("TV")))).stopTv();
			}

		} else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine) {
			((Curtains) (colleagueMap.get(interMap.get("Curtains")))).upCurtains();
		} else if (colleagueMap.get(colleagueName) instanceof TV) {//如果TV这里处理

		} else if (colleagueMap.get(colleagueName) instanceof Curtains) {
			//如果是窗帘发出的消息在这里处理...
		}

	}

	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub

	}

}
