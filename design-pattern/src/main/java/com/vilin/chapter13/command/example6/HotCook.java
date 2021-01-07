package com.vilin.chapter13.command.example6;

/**
 * 执行菜单其实就是循环执行菜单里面的每个菜
 */
public class HotCook implements CookApi,Runnable{
	/**
	 * 厨师姓名
	 */
	private String name;
	/**
	 * 构造方法，闯入厨师姓名
	 * @param name 厨师姓名
	 */
	public HotCook(String name){
		this.name = name;
	}
	
	public void cook(int tableNum,String name) {
		//每次做菜的时间是不一定的，用随机数来模拟一下
		int cookTime = (int)(20 * Math.random());
		System.out.println(this.name+"厨师正在为"+tableNum+"号桌做："+name);
		try {
			//让线程休息这么长时间，表示正在做菜
			Thread.sleep(cookTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.name+"厨师为"+tableNum+"号桌做好了："+name+"，共计耗时="+cookTime+"秒");
	}
	
	public void run() {
		while(true){
			//从命令对列里面获取命令对象
			Command cmd = CommandQueue.getOneCommand();
			if(cmd != null){
				//说明取到命令对象了，这个命令对象还没有设置接收者
				//因为前面还不知道到底哪一个厨师来真正执行这个命令
				//现在知道了，就是当前厨师实例，设置到命令对象里面
				cmd.setCookApi(this);
				//然后真正执行这个命令
				cmd.execute();
			}
			//休息1秒
			try {
				Thread.sleep(1000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}