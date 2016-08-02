package com.shenghsiang.api.model;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TestJson {

	public static void main(String[] args) {
		try {
		ObjectMapper mapper = new ObjectMapper();
		InvoiceWinningListResponse response = mapper.readValue(new File(
				"InvoiceWinningListResponse.json"),
				InvoiceWinningListResponse.class);
		} catch (Exception e) {
			
		}

	}

}
