package com.mine.javalearning.thread;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQ<T> {
	private int limit = 1;
	private Queue<T> linkedList = new LinkedList<T>();
	
	public synchronized T take() throws InterruptedException {
			while(linkedList.size() == 0) {
				wait();//被唤醒的线程必须重新获得监视器对象的锁，才可以退出wait()的方法调用
			}
			if(linkedList.size() == limit) notifyAll();
			return linkedList.poll();
	}
	
	public synchronized void put(T t) throws InterruptedException {
			while(linkedList.size() == limit) {
				wait();
			}
			if(linkedList.size() == 0) notifyAll();
			linkedList.add(t);
	}
	
	public static void main(String[] args) throws InterruptedException {
	    final BlockingQ<String> bb = new BlockingQ<String>();
	    System.out.println(Thread.currentThread()+","+bb);

	    new Thread(new Runnable() {
	        @Override
	        public void run() {
	            try {
	                Thread.sleep(1000);
	                System.out.println(Thread.currentThread()+","+bb);
	                bb.put("xx");
	                bb.put("yy");
	                bb.put("zz");
	                bb.put("zz");
	                bb.put("zz");
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }).start();
	    System.out.println(bb.take());
	    System.out.println(bb.take());
	}
}
