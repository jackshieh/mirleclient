package com.shenghsiang.mirle.d0401.response;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Test {

	public static void main(String[] args) throws JAXBException {
		File file = new File("d0401Response.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(INDEX.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		INDEX index = (INDEX) jaxbUnmarshaller.unmarshal(file);
		System.out.println(index.getMESSAGE());
	}

}
