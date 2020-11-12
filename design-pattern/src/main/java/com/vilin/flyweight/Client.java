package com.vilin.flyweight;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 创建一个工厂类
		WebSiteFactory factory = new WebSiteFactory();

		// 客户要以新闻形式发布网站
		WebSite webSite1 = factory.getWebSiteCategory("新闻");

		
		webSite1.use(new User("tom"));

		// 客户要以博客形式发布网站
		WebSite webSite2 = factory.getWebSiteCategory("博客");

		webSite2.use(new User("jack"));

		// 客户要以博客形式发布网站
		WebSite webSite3 = factory.getWebSiteCategory("博客");

		webSite3.use(new User("smith"));

		// 客户要以博客形式发布网站
		WebSite webSite4 = factory.getWebSiteCategory("博客");

		webSite4.use(new User("king"));
		
		System.out.println("网站的分类=" + factory.getWebSiteCount());
	}

}
