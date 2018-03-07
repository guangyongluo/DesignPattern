package com.vilin.design.pattern.visitor;

public class ConsumeBill implements Bill{
	private double amount;

	private String item;

	public ConsumeBill(double amount, String item) {
		super();
		this.amount = amount;
		this.item = item;
	}

	public void accept(AccountBookViewer viewer) {
		viewer.view(this);
	}

	public double getAmount() {
		return amount;
	}

	public String getItem() {
		return item;
	}
}
