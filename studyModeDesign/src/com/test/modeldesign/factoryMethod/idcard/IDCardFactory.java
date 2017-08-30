package com.test.modeldesign.factoryMethod.idcard;

import java.util.ArrayList;
import java.util.List;

import com.test.modeldesign.factoryMethod.framework.Factory;
import com.test.modeldesign.factoryMethod.framework.Product;

/**
 * 在factory method模式中扮演具体的创建者角色 
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
		owners.add(((IDCard)p).getOwner()); //将p强制转换为子类的实例
	}
	
	public List getOwners(){
		return owners;
	}

}
