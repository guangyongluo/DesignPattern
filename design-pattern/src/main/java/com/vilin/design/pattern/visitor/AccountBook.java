package com.vilin.design.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

public class AccountBook {
	private List<Bill> billList = new ArrayList<Bill>();

	public void addBill(Bill bill) {
		billList.add(bill);
	}

	public void show(AccountBookViewer viewer) {
		for (Bill bill : billList) {
			bill.accept(viewer);
		}
	}
}
