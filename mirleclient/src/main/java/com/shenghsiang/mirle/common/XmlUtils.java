package com.shenghsiang.mirle.common;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XmlUtils {
	final static Logger logger = LoggerFactory.getLogger(XmlUtils.class);
		
	public static <T> String marshal(T object, String schemaLocation) {
		StringWriter writer = new StringWriter();

		try {
			JAXBContext context = JAXBContext.newInstance(object.getClass());
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
			if (schemaLocation != null) {
				marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, schemaLocation);
			}
			writer = new StringWriter();
			marshaller.marshal(object, writer);
		} catch (JAXBException ex) {
			logger.error(ex.getMessage());
		}
		return writer.toString();		
	}
	

}
