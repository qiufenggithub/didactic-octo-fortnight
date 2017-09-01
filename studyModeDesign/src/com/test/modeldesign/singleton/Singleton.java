package com.test.modeldesign.singleton;

/**
 * ����ģʽ���ڳ���ֻ��Ҫ����һ��ʵ����ʱ��ʹ�á����ֵ���ģʽ��д���Ƕ���ģʽ������classloader���Ʊ����˶��̵߳�ͬ������.
 * �����һ�Σ��������ظ����أ�����singletonֻ��һ�������캯��Ҳֻ��ֻ��һ��
 * instance����װ��ʱ��ʵ����
 * @author Thinkpad
 *
 */
public class Singleton {
	private static Singleton singleton = new Singleton();
	private Singleton() {
		System.out.println("������һ��ʵ��");
	}
	public static Singleton getInstance(){
		return singleton;
	}
}
