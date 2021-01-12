package com.vilin.chapter10.mediator.example3;

/**
 * 人员名称
 */
public class User{
	/**
	 * 描述人员编号
	 */
	private String userId;
	/**
	 * 描述人员名称
	 */
	private String userName;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * 人员离职
	 * @return 是否处理成功
	 */
	public boolean dimission(){
		//1：要先通过中介者去除掉所有与这个人相关的部门和人员的关系
		DepUserMediatorImpl mediator = DepUserMediatorImpl.getInstance();
		mediator.deleteUser(userId);
		//2：然后才能真正地清除掉这个人员
		//请注意，实际开发中，人员离职，是不会真的删除掉人员记录的
		//通常是把人员记录的状态或者是删除标记设置成已删除
		//只是不再参加新的业务，但是已经发生的业务记录是不会被清除掉的
		
		return true;
	}
}