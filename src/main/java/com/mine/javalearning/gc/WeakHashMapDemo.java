package com.mine.javalearning.gc;

import java.util.WeakHashMap;

class Key {
	String id;
	
	public Key(String id) {
		this.id = id;
	}
	
	public String toString() {
		return id;
	}
	
	public int hashCode() {
		return id.hashCode();
	}
	
	public boolean equals(Object r) {
		return (r instanceof Key) && id.equals(((Key)r).id);
	}
	public void finalize() {
		System.out.println("Finalizing Key" + id);
	}
}

class Value {
	String id;
	public Value(String id) {
		this.id = id;
	}
	
	public String toString() {
		return id;
	}
	public void finalize() {
		System.out.println("Finalizing Value" + id);
	}
}
public class WeakHashMapDemo {
	public static void main(String[] args) throws Exception {
		int size = 1000;
		Key[] keys = new Key[size];
		WeakHashMap whm = new WeakHashMap();
		for (int i = 0; i < size; i++) {
			Key k = new Key(Integer.toString(i));
			//Value v = new Value(Integer.toString(i));
			if (i % 3 == 0)
				keys[i] = k;
			whm.put(k, new Value(Integer.toString(i)));
		}
		//垃圾回收
		System.gc();
		Thread.sleep(8000);
		System.out.println(whm.get(new Key(Integer.toString(1))));
	}
}
