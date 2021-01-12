package com.vilin.chapter15.composite.example7;
import java.util.*;

/**
 * 组合对象，可以包含其他组合对象或者叶子对象
 */
public class Composite extends Component{
	public String getName(){
		return this.name;
	}
	public void addChild(Component child) {
		//延迟初始化
		if (childComponents == null) {
			childComponents = new ArrayList<Component>();
		}
		childComponents.add(child);		
		
		//先判断组件路劲是否为空，如果为空，说明本组件是跟组件
		if(this.getComponentPath()==null || this.getComponentPath().trim().length()==0){
			//把本组件的name设置到组件路劲中
			this.setComponentPath(this.name);
		}
		//判断要加入的组件在路径上是否出现过
		//先判断是否是根组件重复添加
		if(this.getComponentPath().startsWith(child.getName()+".")){
			//是根组件重复添加
			throw new IllegalArgumentException("在本通路上，组件'"+child.getName()+"'已经添加过了");
		}else{
			if(this.getComponentPath().indexOf("."+child.getName()) < 0){
				//判断是否是除根路径外的重复添加
				//没有出现过，可以加入，计算组件的路径
				String componentPath = this.getComponentPath()+"."+child.getName();
				//设置子组件的路径
				child.setComponentPath(componentPath);
			}else{
				throw new IllegalArgumentException("在本通路上，组件'"+child.getName()+"'已经添加过了");
			}		
		}
	}
	
	/*---------------������ԭ�е�ʵ�֣�û�б仯------------------*/		
	/**
	 * �����洢��϶����а��������������
	 */
	private List<Component> childComponents = null;
	/**
	 * ��϶��������
	 */
	private String name = "";
	/**
	 * ���췽����������϶��������
	 * @param name ��϶��������
	 */
	public Composite(String name){
		this.name = name;
	}
	/**
	 * �����϶�������Ľṹ
	 * @param preStr ǰ׺����Ҫ�ǰ��ղ㼶ƴ�ӵĿո�ʵ���������
	 */
	public void printStruct(String preStr){
		//�Ȱ��Լ����ȥ
		System.out.println(preStr+"+"+this.name);
		//��������������������ô�������Щ���������
		if(this.childComponents!=null){
			//Ȼ�����һ���ո񣬱�ʾ�������һ���ո�
			preStr+=" ";		
			//�����ǰ������Ӷ�����
			for(Component c : childComponents){
				//�ݹ����ÿ���Ӷ���
				c.printStruct(preStr);
			}
		}
	}
}
