package com.test.modeldesign.prototype.framework;

public interface Product extends Cloneable{
	public abstract void use(String s);//用于使用的方法
	public abstract Product createClone(); //用于复制实例的方法
	
}
