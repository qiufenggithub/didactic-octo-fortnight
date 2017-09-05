package com.test.modeldesign.prototype.framework;

import java.util.HashMap;

public class Manager {
	private HashMap showcase = new HashMap();
	
	//注册方法，将name和product的关联关系保存到showcase中,proto肯定是实现了Product接口的类的实例.
	public void register(String name,Product proto){
		showcase.put(name, proto);
	}
	
	//create 方法，根据名称拿出对应的product
	public Product create(String protoname){
		Product p = (Product)showcase.get(protoname);
		return p;
	}
}
