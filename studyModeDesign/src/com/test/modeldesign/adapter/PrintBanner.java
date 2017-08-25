package com.test.modeldesign.adapter;

/**
 * 该类就相当于一个适配器，充当Banner和Print之前的适配器，调用的时候是调用的print,但它具体的实现方法
 * 其实是Banner实现的，相当于是一个适配器模式
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
