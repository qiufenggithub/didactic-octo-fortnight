package com.test.modeldesign.adapter.excerise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * ������൱��һ������������������FileIO�ӿں�Properties��,�����ߵ�������Ҫ��FileIO,������ȥ����FileIO
 * �ķ�����ʵ��Properties�ķ���ʵ�ֵ�.
 * @author Thinkpad
 *
 */
public class FileProperties extends Properties implements FileIO{
 
	private static final long serialVersionUID = 1L;

	@Override
	public void readFromFile(String filename) throws IOException {
		this.load(new FileInputStream(new File(filename)));
	}

	@Override
	public void writeToFile(String filename) throws IOException {
		this.store(new FileOutputStream(filename), "writen by properties");;
	}

}
