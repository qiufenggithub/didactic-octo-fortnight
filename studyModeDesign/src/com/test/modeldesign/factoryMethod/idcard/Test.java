package com.test.modeldesign.factoryMethod.idcard;

import com.test.modeldesign.factoryMethod.framework.Factory;
import com.test.modeldesign.factoryMethod.framework.Product;

public class Test {
	/**
	 * 使用product method模式，避免了父类和子类之间的耦合,
	 * 在创建另外一个具体的创建者和具体的产品的时候，不需要再去修改factory类和product类中的任何内容.
	 * @param args
	 */
	public static void main(String[] args) {
		Factory f = new IDCardFactory();
		Product card1 = f.create("小明");
		Product card2 = f.create("小红");
		Product card3 = f.create("小刚");
		card1.use();
		card2.use();
		card3.use();
	}
}
