package com.mine.javalearning.thread;


public class ThreadDemo {

 
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		final StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 10; i++) {
			new Thread("" + i) {
				public void run() {
					System.out.println("Thread: " + getName() + " running");
				}
			}.start();
			/*
			new Thread(new Runnable() {
				public void run() {
					//System.out.println(Thread.currentThread().getName());
					sb.append("s ");
					System.out.println(sb.toString());
				}
			}, "Thread " + i).start();
			*/
		}
	}

}


