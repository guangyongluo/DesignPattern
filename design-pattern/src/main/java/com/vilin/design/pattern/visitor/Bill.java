package com.vilin.design.pattern.visitor;

public interface Bill {

	void accept(AccountBookViewer viewer);

}