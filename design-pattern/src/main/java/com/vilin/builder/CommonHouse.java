package com.vilin.builder;

public class CommonHouse extends AbstractHouse {

	@Override
	public void buildBasic() {
		// TODO Auto-generated method stub
		System.out.println("给普通房子打地基");
	}

	@Override
	public void buildWall() {
		// TODO Auto-generated method stub
		System.out.println("给普通房子砌墙");
	}

	@Override
	public void roofed() {
		// TODO Auto-generated method stub
		System.out.println("给普通房子封顶");
	}

}
