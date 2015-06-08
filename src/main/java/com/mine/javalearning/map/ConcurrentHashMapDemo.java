package com.mine.javalearning.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import com.mine.javalearning.util.Utils;

public class ConcurrentHashMapDemo {

	public static Map<String, String> coMap = new ConcurrentHashMap<String, String>();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		coMap.put("k1","v1");
		coMap.put("k2","v2");
		coMap.put("k3","v3");
		coMap.put("k4","v4");
		coMap.put("k5","v5");
		coMap.put("k6","v6");
		Set<String> keySet = coMap.keySet();
		**/
		final HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("k1","hv1");
		hashMap.put("k2","hv2");
		hashMap.put("k3","hv3");
		hashMap.put("k4","hv4");
		hashMap.put("k5","hv5");
		hashMap.put("k6","hv6");
		byte[] b = Utils.convertObject2Byte(hashMap);
	//	coMap = (ConcurrentHashMap<String, String>) Utils.convertByte2Object(b);
	//	coMap = hashMap;
		
		/**
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String key = (String) it.next();
			
			System.out.println(key);
			System.out.println(coMap.get(key));
		}
		**/
		
		final Map<String, String> synMap = Collections.synchronizedMap(coMap);

		

		Thread t1 = new Thread(new Runnable() {
			
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (hashMap) {
					System.out.println("ok");
					for (int i = 0; i < 10; i++) {
						hashMap.put("k"+i,"v"+i);
					}
					System.out.println("end");
				}
			}
		});
		t1.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Long startTime = System.nanoTime();
	
		for (String s : coMap.values()) {
			System.out.println(s);
		}
	
		Long endTime = System.nanoTime();
		
		System.out.println("耗时：" + (endTime - startTime));

	}

}
