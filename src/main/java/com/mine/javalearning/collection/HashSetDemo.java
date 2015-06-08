package com.mine.javalearning.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hset = new HashSet<String>();
		hset.add("v1");
		hset.add("v2");
		hset.add("v3");
		
		Iterator<String> iter = hset.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
