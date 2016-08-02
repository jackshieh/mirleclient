package com.shenghsiang.mirle.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shenghsiang.api.model.InvDetailResponse;
import com.shenghsiang.api.model.Item;

public class QryInvDetailResponseMessageReader implements
		MessageBodyReader<InvDetailResponse> {

	@Override
	public boolean isReadable(Class<?> type, Type genericType,
			Annotation[] annotations, MediaType mediaType) {
		return type == InvDetailResponse.class;
	}

	@Override
	public InvDetailResponse readFrom(Class<InvDetailResponse> type,
			Type genericType, Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, String> httpHeaders, InputStream entityStream)
			throws IOException, WebApplicationException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY,
				true);
		return mapper.readValue(entityStream, InvDetailResponse.class);
	}

	public static void main(String[] args) {
		BufferedReader reader = null;
		StringBuffer sb = new StringBuffer();
		try {
			reader = new BufferedReader(new FileReader("invDetail.json"));
			String line = reader.readLine();
			while (line != null) {
				// System.out.println(line);
				sb.append(line);
				line = reader.readLine();
			}

			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(
					DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
					InvDetailResponse response = mapper.readValue(sb.toString(), InvDetailResponse.class);

			System.out.println(response.getDetails().size());
			for (Item item: response.getDetails())
				System.out.println(item.getDescription());

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (Exception inEx) {
				inEx.printStackTrace();
			}
		}
	}
}
