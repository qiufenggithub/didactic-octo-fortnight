package com.test.modeldesign.adapter.excerise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 该类就相当于一个适配器，用来适配FileIO接口和Properties类,调用者调用它需要的FileIO,而不用去关心FileIO
 * 的方法其实是Properties的方法实现的.
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
