package com.hiberus.pebble.service;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hiberus.pebble.context.PebbleContext;
import com.mitchellbosecke.pebble.PebbleEngine;
import com.mitchellbosecke.pebble.error.PebbleException;
import com.mitchellbosecke.pebble.template.PebbleTemplate;

public class ProcessPebble {
	
	private final Logger logger = LoggerFactory.getLogger(ProcessPebble.class);
	
	public <T> String processPebble(String resource, T data){
		String result = null;
		PebbleEngine engine = PebbleContext.getInstance().getEngine();
		try{
			PebbleTemplate template = engine.getTemplate(resource);
			Map<String, Object> context = new HashMap<String, Object>();
			context.put("obj", data);
			
			Writer writer = new StringWriter();
			template.evaluate(writer, context);

			result = writer.toString();
			
			
		}catch (PebbleException e){
			System.out.println("Error: "+ e.getMessage());
		}catch (IOException e){
			System.out.println("Error: "+ e.getMessage());
		}
		return result;
	}
}
