package com.mine.javalearning.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {

	/**
	 * 
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(
				new FileInputStream("demo/dos.dat"));
		//
		int c;
		while((c=isr.read())!=-1){
			System.out.print((char)c);
		}
		char[] buf = new char[8*1024];
		//int c;
		//批量读取，放入buf字符数组。返回读到字符的个数
		while((c = isr.read(buf, 0, buf.length)) != -1) {
			String s = new String(buf, 0, c);
			System.out.print(s);
		}
	}

}
