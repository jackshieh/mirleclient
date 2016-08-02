package com.shenghsiang.mirleclient.jpa.test;

import java.io.File;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shenghsiang.api.model.InvoiceWinningListResponse;

public class TestJson {

	@Before
	public void setup() {
		
	}
	
	@Test
	public void testJsonToObject() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
	    InvoiceWinningListResponse response = mapper.readValue(new File("WinningListResponse.json"), InvoiceWinningListResponse.class);	
	    assertEquals(response.getMsg(), "查詢成功");
	    assertEquals(response.getTimeStamp().getTimezoneOffset(), -480);
	}
	
}
