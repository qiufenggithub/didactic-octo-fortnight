package com.test.modeldesign.builder.exercise;

public interface Builder {
	public abstract void makeTitile(String title);
	public abstract void makeString(String str);
	public abstract void makeItems(String [] items);
	public abstract void close();
}
