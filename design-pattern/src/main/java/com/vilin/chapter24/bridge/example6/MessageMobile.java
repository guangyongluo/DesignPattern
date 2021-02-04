package com.vilin.chapter24.bridge.example6;
/**
 * 以手机的方式发送普通消息
 */
public  class MessageMobile implements MessageImplementor{

	public void send(String message, String toUser) {
		System.out.println("使用手机的方式，发送消息'"+message+"'给"+toUser);
	}
}
