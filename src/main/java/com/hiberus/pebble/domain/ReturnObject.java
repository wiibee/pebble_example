package com.hiberus.pebble.domain;

import java.io.Serializable;

public class ReturnObject implements Serializable{
	private static final long serialVersionUID = -8733867356518178661L;
	private String rValue1;
	private String rValue2;
	private String rValue3;
	public String getrValue1() {
		return rValue1;
	}
	public void setrValue1(String rValue1) {
		this.rValue1 = rValue1;
	}
	public String getrValue2() {
		return rValue2;
	}
	public void setrValue2(String rValue2) {
		this.rValue2 = rValue2;
	}
	public String getrValue3() {
		return rValue3;
	}
	public void setrValue3(String rValue3) {
		this.rValue3 = rValue3;
	}
	
	
}
