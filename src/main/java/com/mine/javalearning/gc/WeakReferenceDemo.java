package com.mine.javalearning.gc;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class WeakReferenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("hello");
		ReferenceQueue<String> rq= new ReferenceQueue<String>();
		WeakReference<String> wf = new WeakReference<String>(str, rq);
		str = null;
	//	System.gc();
	//	System.gc();
		Reference<String> ref = (Reference<String>) rq.poll();
		System.out.println(wf.get());
	}

}
