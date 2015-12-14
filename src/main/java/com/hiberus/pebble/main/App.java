package com.hiberus.pebble.main;

import com.hiberus.pebble.context.PebbleContext;
import com.hiberus.pebble.domain.OtherObject;
import com.hiberus.pebble.domain.PebbleData;
import com.hiberus.pebble.service.ProcessPebble;

public class App {
	public static void main(String[] args) {
		PebbleContext.getInstance();
		ProcessPebble process = new ProcessPebble();
		PebbleData data = new PebbleData();
		
		data.setName("Antonio");
		data.setOther(new OtherObject());
		data.getOther().setOther1("other 1");
		data.getOther().setOther2(10);
		
		String result = process.processPebble("test.html", data);
		
		System.out.println(result);
	}
}
