package com.test.modeldesign;

public class PrintBanner extends Banner implements Print{
String string;
	public PrintBanner(String string) {
		super(string);
		this.string = string;
	}

	@Override
	public String printStrong() {
		this.showWithParten(string);
		return null;
	}

	@Override
	public String printWeak() {
		this.showWithAster(string);
		return null;
	}

}
