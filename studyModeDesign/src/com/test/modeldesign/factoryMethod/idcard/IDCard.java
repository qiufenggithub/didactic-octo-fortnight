package com.test.modeldesign.factoryMethod.idcard;

import com.test.modeldesign.factoryMethod.framework.Product;

/**
 * ��factory method �����а��ݾ���Ĳ�Ʒ��ɫ 
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
		System.out.println("ʹ��"+owner+"�Ŀ�");
	}
	
	public String getOwner(){
		return owner;
	}

}
