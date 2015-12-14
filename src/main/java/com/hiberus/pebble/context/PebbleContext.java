package com.hiberus.pebble.context;

import com.mitchellbosecke.pebble.PebbleEngine;

public class PebbleContext {
	
	private static PebbleContext instance;
	private PebbleEngine engine;
	
	public PebbleContext() {
		this.engine = new PebbleEngine.Builder().build();
	}
	
	public static PebbleContext getInstance(){
		if (instance == null){
			instance = new PebbleContext();
		}
		return instance;
	}

	public PebbleEngine getEngine() {
		return engine;
	}

	public void setEngine(PebbleEngine engine) {
		this.engine = engine;
	}
	
	
}
