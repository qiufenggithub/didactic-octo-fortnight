package com.test.modeldesign.adapter.excerise;

import java.io.IOException;

public interface FileIO {
	public void readFromFile(String filename) throws IOException;
	public void writeToFile(String filename) throws IOException;
}
