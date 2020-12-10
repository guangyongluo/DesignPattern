package com.vilin.state;

/**
 * 状态模式测试类
 * @author Administrator
 *
 */
public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建活动对象，奖品有1个
        RaffleActivity activity = new RaffleActivity(1);

        // 连续抽300次奖
        for (int i = 0; i < 30; i++) {
            System.out.println("--------第" + (i + 1) + "次抽奖----------");
            // 参加抽奖，第一步点击扣除积分
            activity.deduceMoney();

            // 第二步抽奖
            activity.raffle();
        }
	}

}
