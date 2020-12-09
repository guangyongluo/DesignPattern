package com.vilin.memento.theory;

import java.util.ArrayList;
import java.util.HashMap;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker();
		
		originator.setState("状态#1 攻击力100");
		
		//保存当前状态
		caretaker.add(originator.saveStateMemento());
		
		originator.setState("状态#2 攻击力80");
		
		caretaker.add(originator.saveStateMemento());
		
		originator.setState("状态#3 攻击力50");
		caretaker.add(originator.saveStateMemento());
		
		
		
		System.out.println("当前的状态是 =" + originator.getState());
		
		//希望得到状态1, 将originator恢复到#1
		
		originator.getStateFromMemento(caretaker.get(0));
		System.out.println("恢复到状态1，当前的状态是");
		System.out.println("当前的状态是 =" + originator.getState());
		
		
		
	}

}
