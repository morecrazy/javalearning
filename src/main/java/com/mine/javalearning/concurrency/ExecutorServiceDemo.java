package com.mine.javalearning.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newFixedThreadPool(12);
		executorService.execute(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				 System.out.println("Asynchronous task");	
			}
		});
		
		executorService.shutdown();
	}

}
