package com.test.modeldesign.builder.exercise;

public class Test {
	public static void main(String[] args) {
		TextBuilder tb = new TextBuilder();
		Director d = new Director(tb);
		d.construct();
		String result = tb.getResult();
		System.out.println(result);
	}
}
