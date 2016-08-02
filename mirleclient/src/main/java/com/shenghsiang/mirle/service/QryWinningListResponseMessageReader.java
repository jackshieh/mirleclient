package com.shenghsiang.mirle.service;

import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shenghsiang.api.model.InvoiceWinningListResponse;

public class QryWinningListResponseMessageReader implements
		MessageBodyReader<InvoiceWinningListResponse> {
	final static Logger logger = Logger.getLogger(QryWinningListResponseMessageReader.class);
	
	@Override
	public boolean isReadable(Class<?> type, Type genericType,
			Annotation[] annotations, MediaType mediaType) {		
		return type == InvoiceWinningListResponse.class;
	}

	@Override
	public InvoiceWinningListResponse readFrom(
			Class<InvoiceWinningListResponse> type, Type genericType,
			Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, String> httpHeaders, InputStream entityStream)
			throws IOException, WebApplicationException {
            ObjectMapper mapper = new ObjectMapper();
            logger.debug("ObjectMapper de-serilizes the response...");
            return mapper.readValue(entityStream, InvoiceWinningListResponse.class);
	}

}
