package com.test.modeldesign.factoryMethod.framework;

/**
 * ��factoryMehtodģʽ�а��ݴ����ߵĽ�ɫ;
 * ����new�ؼ���������ʵ�������ǵ���ר�õķ���������ʵ�������⸸�������������
 * ���ѷ���factory methodģʽһ�����õ�template method ģʽ
 * factory���product�����һ����
 * @author Thinkpad
 */
public abstract class Factory {
	
	/**
	 * ����ʵ����ר�÷���,�����������������󷽷������������󷽷��ɾ���Ĵ�����ȥʵ��
	 * @return
	 */
	public final Product create(String owner){
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}
	
	public abstract Product createProduct(String owner);
	public abstract void registerProduct(Product p);
}

