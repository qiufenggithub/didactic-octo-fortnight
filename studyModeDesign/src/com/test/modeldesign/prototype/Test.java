package com.test.modeldesign.prototype;

import com.test.modeldesign.prototype.framework.Manager;

public class Test {
	public static void main(String[] args) {
		MessageBox b1 = new MessageBox('*');
		
		Manager m = new Manager();
		
		m.create("teststar");m.register("teststar", b1);
		b1.use("Hello world");
	}
}
