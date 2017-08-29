package com.test.modeldesign.templateMethod;

public class StringDisplay extends AbstractDisplay{
	private String s;
	private int width ;
	public StringDisplay(String s) {
		this.s = s;
		width = s.getBytes().length;
	}
	
	@Override
	public void open() {
		displayLine();
	}

	@Override
	public void print() {
		System.out.println("|"+s+"|");
	}

	@Override
	public void close() {
		displayLine();
	}
	
	public void displayLine(){
		System.out.print("+");
		for(int i = 0;i<width;i++){
			System.out.print("-");
		} 
		System.out.println("+");
	}
}
