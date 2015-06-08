package com.mine.javalearning.base;

class Data extends Object implements Cloneable {
	int x;
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
public class CloneDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Data data = new Data();
		data.x = 5;
		System.out.printf("data.x = %d%n", data.x);
		Data data2 = (Data) data.clone();
		System.out.printf("data2.x = %d%n", data2.x);
	}
}
