package com.test.modeldesign.builder.exercise;

public class TextBuilder implements Builder {
	private StringBuffer buffer = new StringBuffer();

	@Override
	public void makeTitile(String title) {
		buffer.append("=========================\n");
		buffer.append("[" + title + "]");
		buffer.append("\n");
	}

	@Override
	public void makeString(String str) {
		buffer.append("." + str + "\n");
	}

	@Override
	public void makeItems(String[] items) {
		for (int i = 0; i < items.length; i++) {
			buffer.append("______" + items[i] + "\n");
		}
		buffer.append("\n");
	}

	@Override
	public void close() {
		buffer.append("===========================\n");
	}

	// 获取结果
	public String getResult() {
		return buffer.toString();
	}
}
