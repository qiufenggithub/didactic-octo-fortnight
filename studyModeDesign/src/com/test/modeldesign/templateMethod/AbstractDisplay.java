package com.test.modeldesign.templateMethod;
/**
 * ����һ�������࣬������open,print,close�������󷽷������������󷽷���Ҫ����ȥ����ʵ�ֵġ�
 * ��display�����У����������������󷽷������಻�����ʵ�����������󷽷���display������Ҫ���ó������ж�����߼�ִ�С�
 * display��������һ��ģ�巽��.display�����������final�ģ���ʾ���ܱ�����ʵ�֣�Ҳ���ǲ��ܱ������޸ġ�
 * @author Thinkpad
 *
 */
public abstract class AbstractDisplay {
	public abstract void open();
	public abstract void print();
	public abstract void close();
	public final void display(){
		open();
		for(int i =0;i<5;i++){
			print();
		}
		close();
	}
}
