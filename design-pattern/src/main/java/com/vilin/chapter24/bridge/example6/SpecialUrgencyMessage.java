package com.vilin.chapter24.bridge.example6;
/**
 * 特急消息
 */
public class SpecialUrgencyMessage extends AbstractMessage{

	public SpecialUrgencyMessage(MessageImplementor impl) {
		super(impl);
	}

	public void hurry(String messageId) {
		//执行催促的业务，发出催促的消息
	}

	public void sendMessage(String message, String toUser) {
		message = "特急："+message;
		super.sendMessage(message, toUser);
		//还需要添加一条特急的消息
	}
}
