package com.mine.javalearning.pool;

public class BaseObject {
	private int num;
	private boolean active;
	
	public BaseObject() {
		setActive(true);
		System.out.println("new BaseObject!!!!");
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
}
