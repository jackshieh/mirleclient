package com.shenghsiang.mirle.d0501.response;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.ProcessingException;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.transform.stream.StreamSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class D0501ResponseMessageReader implements MessageBodyReader<INDEX> {
	final static Logger logger = LoggerFactory.getLogger(D0501ResponseMessageReader.class);

	@Override
	public boolean isReadable(Class<?> type, Type genericType,
			Annotation[] annotations, MediaType mediaType) {
		return type == INDEX.class;
	}

	@Override
	public INDEX readFrom(Class<INDEX> type, Type genericType,
			Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, String> httpHeaders, InputStream entityStream)
			throws IOException, WebApplicationException {
		INDEX index = null;
		try {
			StringBuffer xml = new StringBuffer();			
			BufferedReader bufferedReader = new BufferedReader(
					new InputStreamReader(entityStream, "UTF-8"));
			String line = bufferedReader.readLine();
			while (line != null) {				
				if (line.trim().length() != 0) {
					/*
					 * This is bug from Mirle where the returned response is in Big5 format not in UTF-8
					 */
					if (line.contains("utf-8")) {
						line = "<?xml version=\"1.0\" encoding=\"big5\"?>";
					}
					logger.info(line);
					xml = xml.append(line);
				}
				line = bufferedReader.readLine();
			}
			
	        JAXBContext jaxbContext = JAXBContext.newInstance(INDEX.class);
	        // index = (INDEX) jaxbContext.createUnmarshaller().unmarshal(new ByteArrayInputStream(xml.toString().getBytes()));
	        index = (INDEX) jaxbContext.createUnmarshaller().unmarshal(new StreamSource(new StringReader(xml.toString())));
	    } catch (JAXBException ex) {
	    	logger.error(ex.getErrorCode());
	        throw new ProcessingException("Error deserializing INDEX.", ex);
	    }		
		return index;
	}

}
