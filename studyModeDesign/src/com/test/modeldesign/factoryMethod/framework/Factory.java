package com.test.modeldesign.factoryMethod.framework;

/**
 * 在factoryMehtod模式中扮演创建者的角色;
 * 不用new关键字来生成实例，而是调用专用的方法来生成实例，避免父类与具体类的耦合
 * 不难发现factory method模式一定会用到template method 模式
 * factory类和product类组成一组框架
 * @author Thinkpad
 */
public abstract class Factory {
	
	/**
	 * 生成实例的专用方法,调用了其它两个抽象方法，这两个抽象方法由具体的创建者去实现
	 * @return
	 */
	public final Product create(String owner){
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}
	
	public abstract Product createProduct(String owner);
	public abstract void registerProduct(Product p);
}

