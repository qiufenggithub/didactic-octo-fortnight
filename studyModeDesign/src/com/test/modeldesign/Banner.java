package com.test.modeldesign;

public class Banner {
	private String string;
	
	public Banner(String string){
		this.string = string;
	}
	
	public void showWithParten(String string){
		System.out.println("*"+string+"*");
	}
	public void showWithAster(String string){
		System.out.println("("+string+")");
	}
}
