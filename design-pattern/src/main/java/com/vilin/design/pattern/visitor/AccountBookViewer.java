package com.vilin.design.pattern.visitor;

public interface AccountBookViewer {
	void view(ConsumeBill bill);

	void view(IncomeBill bill);

}
