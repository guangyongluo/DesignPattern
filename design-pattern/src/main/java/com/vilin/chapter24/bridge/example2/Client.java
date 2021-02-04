package com.vilin.chapter24.bridge.example2;

public class Client {
	public static void main(String[] args) {
		Message m = new UrgencyMessageSMS();
		m.send("aa", "au");
		
		m = new UrgencyMessageEmail();
		m.send("aa", "au");
	}
}
