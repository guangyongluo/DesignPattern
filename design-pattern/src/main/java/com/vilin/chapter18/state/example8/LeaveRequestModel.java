package com.vilin.chapter18.state.example8;
/**
 * 请假请求模型类
 */
public class LeaveRequestModel {
	/**
	 * 请假人
	 */
	private String user;
	/**
	 * 请假开始时间
	 */
	private String beginDate;
	/**
	 * 请假天数
	 */
	private int leaveDays;
	/**
	 * ��˽��
	 */
	private String result;
	
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getUser() {
		return user;
	}

	public String getBeginDate() {
		return beginDate;
	}

	public int getLeaveDays() {
		return leaveDays;
	}
	public void setUser(String user) {
		this.user = user;
	}

	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	public void setLeaveDays(int leaveDays) {
		this.leaveDays = leaveDays;
	}	
}
