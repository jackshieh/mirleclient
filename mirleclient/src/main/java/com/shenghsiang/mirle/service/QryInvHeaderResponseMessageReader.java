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
import com.shenghsiang.api.model.InvHeaderResponse;

public class QryInvHeaderResponseMessageReader implements
		MessageBodyReader<InvHeaderResponse> {
	final static Logger logger = Logger.getLogger(QryInvHeaderResponseMessageReader.class);
	
	@Override
	public boolean isReadable(Class<?> type, Type genericType,
			Annotation[] annotations, MediaType mediaType) {
		return type == InvHeaderResponse.class;
	}

	@Override
	public InvHeaderResponse readFrom(Class<InvHeaderResponse> type,
			Type genericType, Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, String> httpHeaders, InputStream entityStream)
			throws IOException, WebApplicationException {
        ObjectMapper mapper = new ObjectMapper();
        logger.debug("ObjectMapper de-serilizes QryInvHeaderResponse");
        return mapper.readValue(entityStream, InvHeaderResponse.class);
	}

}
