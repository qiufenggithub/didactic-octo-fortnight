package com.test.modeldesign.adapter;

/**
 * ������൱��һ�����������䵱Banner��Print֮ǰ�������������õ�ʱ���ǵ��õ�print,���������ʵ�ַ���
 * ��ʵ��Bannerʵ�ֵģ��൱����һ��������ģʽ
 * @author Thinkpad
 */
public class PrintBanner extends Banner implements Print{
	
	public PrintBanner(String string) {
		super(string);
	}

	@Override
	public String printStrong() {
		this.showWithParten();
		return null;
	}

	@Override
	public String printWeak() {
		this.showWithAster();
		return null;
	}

}
