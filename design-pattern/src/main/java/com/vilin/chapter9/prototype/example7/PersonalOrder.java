package com.vilin.chapter9.prototype.example7;

import java.io.*;

/**
 * 个人订单对象
 */
public class PersonalOrder implements Cloneable , OrderApi, Serializable {
	/**
	 * 订购人员姓名
	 */
	private String customerName;
	/**
	 * 产品对象
	 */
	private Product product = null;
	/**
	 * 订单产品数量
	 */
	private int orderProductNum = 0;
	
	public int getOrderProductNum() {
		return this.orderProductNum;
	}	
	public void setOrderProductNum(int num) {
		this.orderProductNum = num;
	}	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public String toString(){
		//简单输出
		return "订单产品是="+this.product.getName()+"，订购数量为="+this.orderProductNum;
	}
	
	public Object clone(){
		PersonalOrder obj=null;
		try {
			obj =(PersonalOrder)super.clone();
			//下一行代码不能少
			obj.setProduct((Product)this.product.clone());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}		
		return obj;
	}

	public PersonalOrder deepClone(){
		try(ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(bos)){
			oos.writeObject(this);

			ByteArrayInputStream ios = new ByteArrayInputStream(bos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(ios);
			PersonalOrder o = (PersonalOrder)ois.readObject();
			return o;
		} catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
