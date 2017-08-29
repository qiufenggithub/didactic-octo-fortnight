package com.test.modeldesign.templateMethod;

public class Test {
	public static void main(String[] args) {
		AbstractDisplay ad1 = new CharsetDisplay("H");
		ad1.display();		
		AbstractDisplay ad2 = new StringDisplay("Hello,world!");
		ad2.display();
		AbstractDisplay ad3 = new StringDisplay("hello,lucy!");
		ad3.display();
	}
}
