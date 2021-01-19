package com.vilin.chapter18.state.example7;

import java.util.Scanner;
/**
 * 处理审核结束的类
 */
public class AuditOverState implements LeaveRequestState{
	public void doWork(StateMachine request) {
		//先把业务对象转型回来
		LeaveRequestModel lrm = (LeaveRequestModel)request.getBusinessVO();

		//业务处理，在数据中记录整个流程结束
	}
}
