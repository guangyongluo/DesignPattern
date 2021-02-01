package com.vilin.chapter21.interpreter.example1;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.*;
/**
 * 读取配置文件
 */
public class ReadAppXml {
	/**
	 * 读取配置文件内容
	 * @param filePathName 配置文件的路劲和文件名
	 * @throws Exception
	 */
	public void read(String filePathName)throws Exception{
		Document doc = null;
		//建立一个解析器工厂
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		//获得一个DocumentBuilder对象，这个对象代表了具体的DOM解析器
		DocumentBuilder builder=factory.newDocumentBuilder();
		//得到一个表示XML文档的Document对象
		doc=builder.parse(filePathName);
		//去掉XML中多为格式化内容的空白而映射在DOM树中的Text Node对象
		doc.normalize();

//		//获取jdbc
//		NodeList jdbc = doc.getElementsByTagName("jdbc");
//		//只有一个jdbc,获取jdbc中的驱动类的名称
//		NodeList driverClassNode = ((Element)jdbc.item(0)).getElementsByTagName("driver-class");
//		String driverClass = driverClassNode.item(0).getFirstChild().getNodeValue();
//		System.out.println("driverClass=="+driverClass);
//		//同理获取url、user、password等的值
//		NodeList urlNode = ((Element)jdbc.item(0)).getElementsByTagName("url");
//		String url = urlNode.item(0).getFirstChild().getNodeValue();
//		System.out.println("url=="+url);
//
//		NodeList userNode = ((Element)jdbc.item(0)).getElementsByTagName("user");
//		String user = userNode.item(0).getFirstChild().getNodeValue();
//		System.out.println("user=="+user);
//
//		NodeList passwordNode = ((Element)jdbc.item(0)).getElementsByTagName("password");
//		String password = passwordNode.item(0).getFirstChild().getNodeValue();
//		System.out.println("password=="+password);
//		//获取application-xml
//		NodeList applicationXmlNode = doc.getElementsByTagName("application-xml");
//		String applicationXml = applicationXmlNode.item(0).getFirstChild().getNodeValue();
//		System.out.println("applicationXml=="+applicationXml);

		//先要获取spring-default，再获取application-xmls
		//然后才能获取application-xml
		NodeList springDefaultNode = doc.getElementsByTagName("spring-default");
		NodeList appXmlsNode = ((Element)springDefaultNode.item(0)).getElementsByTagName("application-xmls");
		NodeList appXmlNode = ((Element)appXmlsNode.item(0)).getElementsByTagName("application-xml");
		//循环获取每个application-xml元素的值
		for(int i=0;i<appXmlNode.getLength();i++){
			String applicationXml = appXmlNode.item(i).getFirstChild().getNodeValue();
			System.out.println("applicationXml=="+applicationXml);
		}
	}
	
	public static void main(String[] args) throws Exception {
		ReadAppXml t = new ReadAppXml();
		t.read("design-pattern/target/classes/com/vilin/chapter21/interpreter/example1/App2.xml");
	}
}
