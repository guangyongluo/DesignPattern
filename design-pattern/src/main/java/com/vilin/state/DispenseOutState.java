package com.vilin.state;

/**
 * 奖品发放完毕的状态
 * 说明，当我们的activity已经变成DispenseOutState，抽奖活动结束
 * @author Administrator
 *
 */
public class DispenseOutState extends State {

	// 初始化时传入活动引用，发放奖品后改变其状态
    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }
    @Override
    public void deduceMoney() {
        System.out.println("奖品发放完成，请下次再参加");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发放完成，请下次再参加");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发放完成，请下次再参加");
    }
}
