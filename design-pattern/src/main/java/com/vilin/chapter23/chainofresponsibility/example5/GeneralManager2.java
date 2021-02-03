package com.vilin.chapter23.chainofresponsibility.example5;
/**
 * 现在的总经理既可以处理聚餐费用申请，又可以处理预支差旅费用申请
 */
public class GeneralManager2 extends GeneralManager{
	public Object handleRequest(RequestModel rm){
		if(PreFeeRequestModel.FEE_TYPE.equals(rm.getType())){
			//表示预支差旅费用申请
			return myHandler(rm);
		}else{
			//其他的让父类去处理
			return super.handleRequest(rm);
		}
	}
	private Object myHandler(RequestModel rm) {
		//先把通用的对象转型成预支差旅费用模型
		PreFeeRequestModel frm = (PreFeeRequestModel)rm;
		if(frm.getFee() >= 5000){
			//总经理的权限很大
			System.out.println("总经理同意"+frm.getUser()+"预支差旅费用"+frm.getFee()+"元的要求");
			return true;
		}else{
			//总经理之后没有审批人
			if(this.successor!=null){
				return this.successor.handleRequest(rm);
			}
		}
		return false;
	}
}
