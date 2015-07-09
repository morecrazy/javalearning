package com.mine.javalearning.base;

public class ObjectSizeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj = new Object();
		long size = MyAgent.getObjectSize(obj);
		System.out.println(size);
	}

}
