package com.springex.entity;

import java.util.Iterator;
import java.util.List;

public class Product {
	private int pId;
	private String pName;
	private String desc;
	private List<String> orderPurcheserName;
	
	public Product(int pId, String pName, String desc, List<String> orderPurcheserName) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.desc = desc;
		this.orderPurcheserName = orderPurcheserName;
	}
	
	public void show() {
		System.out.println("			-------- Product Details ---------");
		System.out.println(pId + " : " + pName + " : "+ desc);
		System.out.println("			------List OF Purcheser --------");
		Iterator<String> itr = orderPurcheserName.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", desc=" + desc + ", orderPurcheserName="
				+ orderPurcheserName + "]";
	}
	
	
	

}
