package com.test.modeldesign.factoryMethod.idcard;

import com.test.modeldesign.factoryMethod.framework.Factory;
import com.test.modeldesign.factoryMethod.framework.Product;

public class Test {
	/**
	 * ʹ��product methodģʽ�������˸��������֮������,
	 * �ڴ�������һ������Ĵ����ߺ;���Ĳ�Ʒ��ʱ�򣬲���Ҫ��ȥ�޸�factory���product���е��κ�����.
	 * @param args
	 */
	public static void main(String[] args) {
		Factory f = new IDCardFactory();
		Product card1 = f.create("С��");
		Product card2 = f.create("С��");
		Product card3 = f.create("С��");
		card1.use();
		card2.use();
		card3.use();
	}
}
