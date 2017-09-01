package com.test.modeldesign.singleton;

public class TripleTest {
	public static void main(String[] args) {
		for(int i = 0;i<9;i++){
			Triple t = Triple.getInstance(i%3);
			System.out.println(i + ":"+t);
		}
	}
}
