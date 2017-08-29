package com.test.modeldesign.adapter.excerise;

import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		FileProperties f = new FileProperties();
		try {
			f.readFromFile("d:/file.txt");
			System.out.println(f.getProperty("year"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
