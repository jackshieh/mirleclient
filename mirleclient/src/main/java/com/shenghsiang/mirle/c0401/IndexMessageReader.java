package com.shenghsiang.mirle.c0401;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.ProcessingException;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import com.shenghsiang.mirle.c0401.response.INDEX;

public class IndexMessageReader implements MessageBodyReader<INDEX> {

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
					new InputStreamReader(entityStream));
			String line = bufferedReader.readLine();
			while (line != null) {				
				if (line.trim().length() != 0) {
					xml = xml.append(line);
				}
				line = bufferedReader.readLine();
			}
	        JAXBContext jaxbContext = JAXBContext.newInstance(INDEX.class);	        
	        index = (INDEX) jaxbContext.createUnmarshaller().unmarshal(new ByteArrayInputStream(xml.toString().getBytes()));	       
	    } catch (JAXBException jaxbException) {
	        throw new ProcessingException("Error deserializing a INDEX.", jaxbException);
	    }		
		return index;
	}

}
