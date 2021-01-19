package com.vilin.chapter18.state.example6;

public class Client2 {
	public static void main(String[] args) {
		TestDB.map.put("b","22");
		System.out.println("bb=="+TestDB.map.size());
	}
}
