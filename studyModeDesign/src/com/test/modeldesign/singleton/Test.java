package com.test.modeldesign.singleton;

public class Test {
	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		Singleton obj3 = Singleton.getInstance();
		Singleton obj4 = Singleton.getInstance();
		if(obj1 == obj2){
			System.out.println("obj1 �� obj2����ͬ��ʵ��.");
		} else {
			System.out.println("obj1 �� obj2�ǲ�ͬ��ʵ��");
		}
	}
}
