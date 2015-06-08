package com.mine.javalearning.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BufferedReaderDemo {
	/**
	 * 
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//解码（解码一定要正确，解码错误后，再编码是不能编回来了）
		BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream("demo/dos.dat"),"utf-8"));
		//编码
		BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream("demo/out.dat"),"utf-8"));
		String line;
		while((line = br.readLine()) != null) {
			
			System.out.print(line);//不识别换行
			bw.write(line);
			//单独写出换行操作
			bw.newLine();
			bw.flush();
		}
		br.close();
		bw.close();
		System.out.println();
		IOUtil.printHex("demo/dos.dat");
		System.out.println();
		IOUtil.printHex("demo/out.dat");
	}
}
