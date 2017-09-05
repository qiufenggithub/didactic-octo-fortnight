package com.test.modeldesign.prototype;

import com.test.modeldesign.prototype.framework.Product;

public class MessageBox implements Product{
	private char decochar;
	public MessageBox(char decochar) {
		this.decochar = decochar;
	}
	
	//具体的use方法逻辑实现
	@Override
	public void use(String s) {
		int length = s.getBytes().length;
		for(int i = 0;i< length +4;i ++){
			System.out.print(decochar);
		}
		System.out.println("");
		System.out.println(decochar + " "+s + " "+decochar);
		
		for(int i =0;i<length+4;i++){
			System.out.print(decochar);
		}
		System.out.println("");
	}
	
	

	@Override
	public Product createClone() {
		Product p = null;
		try {
			p = (Product) clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}

}
