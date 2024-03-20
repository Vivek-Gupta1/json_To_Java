package com.vivek;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CheckJakson {
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
		Address ad = new Address();
		ad.setName("Vivek");
		ad.setPinCode(34530);
		ad.setSocity("Nsp");
		
		JactionDataChange t = new JactionDataChange();
		t.setId(1);
		t.setName("Vivek");
		t.setRollNo(10);
		t.setAdd(ad);
		
	
		ObjectMapper mapper = new ObjectMapper();
		 mapper.writeValue(new File("Customer.json"), t);
	}
	
}
