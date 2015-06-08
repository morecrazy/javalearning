package com.mine.javalearning.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<String, String> linkMap = new LinkedHashMap<String, String>();
		linkMap.put("k1", "v1");
		linkMap.put("k2", "v2");
		linkMap.put("k3", "v3");
		linkMap.put("k4", "v1");
		linkMap.put("k5", "v2");
		linkMap.put("k6", "v3");
		linkMap.put("k7", "v1");
		linkMap.put("k8", "v2");
		linkMap.put("k9", "v3");
		linkMap.put("k10", "v1");
		linkMap.put("k11", "v2");
		linkMap.put("k12", "v3");
		
		System.out.println("遍历LinkedHashMap");
		System.out.println("\t" + linkMap);
		Set<String> kSet = linkMap.keySet();
		Iterator<String> iter = kSet.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			System.out.println(linkMap.get(key));
		}
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("k1", "v1");
		map.put("k2", "v2");
		map.put("k3", "v3");
		map.put("k4", "v4");
		map.put("k5", "v5");
		map.put("k6", "v6");
		map.put("k7", "v7");
		map.put("k8", "v8");
		map.put("k9", "v1");
		map.put("k10", "v2");
		map.put("k11", "v3");
		map.put("k12", "v4");
		map.put("k13", "v5");
		map.put("k14", "v6");
		map.put("k15", "v7");
		map.put("k16", "v8");
		System.out.println("遍历HashMap");
		System.out.println(map);
		kSet = map.keySet();
		iter = kSet.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			System.out.println(map.get(key));
		}
	}
}
