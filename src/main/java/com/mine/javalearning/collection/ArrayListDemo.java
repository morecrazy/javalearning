package com.mine.javalearning.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<String> a1 = new ArrayList<String>();
		a1.add("Program");
		a1.add("hello");
		/*
		Iterator<String> iter = a1.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		 */
		for(String s : a1) {
			System.out.println(s);
		}
	}
}
