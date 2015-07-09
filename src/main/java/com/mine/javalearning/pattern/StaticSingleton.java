package com.mine.javalearning.pattern;

public class StaticSingleton {
	private StaticSingleton(){
		System.out.println("StaticSingleton is create");
	}
	public static class SingletonHolder {
		public static StaticSingleton singleton = new StaticSingleton();
	}
	
	public static StaticSingleton getInstance() {
		return SingletonHolder.singleton;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticSingleton.getInstance();
	}

}
