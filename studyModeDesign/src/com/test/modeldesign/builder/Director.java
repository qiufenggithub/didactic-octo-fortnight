package com.test.modeldesign.builder;

public class Director {
	Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public void construct() {
		builder.makeTitile("greeting");
		builder.makeString("从早上至下午");
		builder.makeItems(new String[] { "早上好", "下午好" });
		builder.makeString("晚上");
		builder.makeItems(new String[] { "晚上好", "晚安", "再见" });
		builder.close();
	}
}
