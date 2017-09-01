package com.test.modeldesign.singleton;

public class Test {
	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		Singleton obj3 = Singleton.getInstance();
		Singleton obj4 = Singleton.getInstance();
		if(obj1 == obj2){
			System.out.println("obj1 和 obj2是相同的实例.");
		} else {
			System.out.println("obj1 和 obj2是不同的实例");
		}
	}
}
