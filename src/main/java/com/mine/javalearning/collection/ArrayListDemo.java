package com.mine.javalearning.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		final List<String> a1 = new ArrayList<String>();

		a1.add("Program");
		a1.add("hello");
		final Object o = new Object();
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ListIterator<String> iter = a1.listIterator();
				synchronized (o) {
					int i;
					for (i = 0; i < 100; i++) {
						iter.add("Program");
						iter.add("hello");
					}
				}
			
			}

		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// TODO Auto-generated method stub
				ListIterator<String> iter = a1.listIterator();
				synchronized (o) {					
					while (iter.hasNext()) {
						System.out.println(iter.next());
					}
				}
			}

		});
		
		t1.start();
		t2.start();
	}
}
