package com.test.modeldesign.factoryMethod.idcard;

import java.util.ArrayList;
import java.util.List;

import com.test.modeldesign.factoryMethod.framework.Factory;
import com.test.modeldesign.factoryMethod.framework.Product;

/**
 * ��factory methodģʽ�а��ݾ���Ĵ����߽�ɫ 
 * @author Thinkpad
 *
 */
public class IDCardFactory extends Factory{
	
	private List owners = new ArrayList();
	
	@Override
	public Product createProduct(String owner) {
		return new IDCard(owner);
	}

	@Override
	public void registerProduct(Product p) {
		owners.add(((IDCard)p).getOwner()); //��pǿ��ת��Ϊ�����ʵ��
	}
	
	public List getOwners(){
		return owners;
	}

}
