package com.hiberus.pebble.domain;

import java.io.Serializable;

public class PebbleData implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 296889417357286030L;
	private String name;
	private OtherObject other;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public OtherObject getOther() {
		return other;
	}
	public void setOther(OtherObject other) {
		this.other = other;
	}
	public String funcionString(){
		return "Prueba funcion";
	}
	
	public String funcionStringParametro(String value){
		return value+ " - Con parametro";
	}
	
	public ReturnObject funcionObject(String value){
		ReturnObject obj = new ReturnObject();
		obj.setrValue1(value);
		obj.setrValue2("valor2");
		obj.setrValue3("valor3");
		return obj;
	}
	
}
