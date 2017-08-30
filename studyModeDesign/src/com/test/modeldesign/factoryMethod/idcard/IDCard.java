package com.test.modeldesign.factoryMethod.idcard;

import com.test.modeldesign.factoryMethod.framework.Product;

/**
 * 在factory method 方法中扮演具体的产品角色 
 * @author Thinkpad
 *
 */
public class IDCard extends Product{
	private String owner;
	
	public IDCard(String owner) {
		this.owner = owner;
	}
	
	@Override
	public void use() {
		System.out.println("使用"+owner+"的卡");
	}
	
	public String getOwner(){
		return owner;
	}

}
