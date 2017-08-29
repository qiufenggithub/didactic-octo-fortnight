package com.test.modeldesign.templateMethod;

public class CharsetDisplay extends AbstractDisplay {
	private String s;

	public CharsetDisplay(String s) {
		this.s = s;
	}

	@Override
	public void open() {
		System.out.print("<<<");
	}

	@Override
	public void print() {
		System.out.print(s);
	}

	@Override
	public void close() {
		System.out.println(">>>");
	}

}
