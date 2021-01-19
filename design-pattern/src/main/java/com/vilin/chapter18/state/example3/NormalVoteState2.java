package com.vilin.chapter18.state.example3;

public class NormalVoteState2 extends NormalVoteState{
	public void vote(String user, String voteItem, VoteManager voteManager) {
		//先调用已有的功能
		super.vote(user, voteItem, voteManager);
		//给与积分奖励，示意一下
		System.out.println("奖励积分10分");
	}
}
