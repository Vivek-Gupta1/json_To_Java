package com.vivek;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class JasonToJava {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		File f = new File("Customer.json");

		ObjectMapper mapper = new ObjectMapper();
		JactionDataChange value = mapper.readValue(f, JactionDataChange.class);
		System.out.println(value);
		
		
		
		
	}

}
