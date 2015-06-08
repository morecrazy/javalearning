package com.mine.javalearning.io;

import java.io.UnsupportedEncodingException;

public class EncodeDemo {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "慕课ABC";
		byte[] bytes1 = s.getBytes();
		//UTF-8编码，中文占用3个字节
		for (byte b: bytes1) {
			System.out.print(Integer.toHexString(b & 0xff)+ " ");
		}
		System.out.println();
		byte[] bytes2 = s.getBytes("gbk");
		//gbk编码，中文占两个字节
		for (byte b: bytes2) {
			System.out.print(Integer.toHexString(b & 0xff)+ " ");
		}
		System.out.println();
		byte[] bytes3 = s.getBytes("utf-16be");
		//java 是双字节编码utf-16be
		for (byte b: bytes3) {
			System.out.print(Integer.toHexString(b & 0xff)+ " ");
		}
	}
}
