package com.hiberus.pebble.domain;

import java.io.Serializable;

public class OtherObject implements Serializable{
	private static final long serialVersionUID = 4896781587651141609L;
	
	private String other1;
	private int other2;
	public String getOther1() {
		return other1;
	}
	public void setOther1(String other1) {
		this.other1 = other1;
	}
	public int getOther2() {
		return other2;
	}
	public void setOther2(int other2) {
		this.other2 = other2;
	}
	
	
}
