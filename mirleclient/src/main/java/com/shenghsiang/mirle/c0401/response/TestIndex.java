package com.shenghsiang.mirle.c0401.response;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class TestIndex {

	public static void main(String[] args) {
		try {
		  JAXBContext jc = JAXBContext.newInstance(INDEX.class);
	       Unmarshaller u = jc.createUnmarshaller();
	       INDEX o = (INDEX)u.unmarshal(new File("INDEX.xml"));
	       System.out.println(o.getMESSAGE());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
