package com.shenghsiang.mirle.c0401;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.ProcessingException;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

@Produces("application/xml")
public class InvoiceMessageWriter implements MessageBodyWriter<Invoice> {

	@Override
	public boolean isWriteable(Class<?> type, Type genericType,
			Annotation[] annotations, MediaType mediaType) {

		return type == Invoice.class;
	}

	@Override
	public long getSize(Invoice t, Class<?> type, Type genericType,
			Annotation[] annotations, MediaType mediaType) {
		// deprecated by JAX-RS 2.0 and ignored by Jersey runtime
		return 0;
	}

	@Override
	public void writeTo(Invoice invoice, Class<?> type, Type genericType,
			Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, Object> httpHeaders,
			OutputStream entityStream) throws IOException,
			WebApplicationException {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Invoice.class);
			// serialize the entity invoice to the entity output stream
			jaxbContext.createMarshaller().marshal(invoice, entityStream);
		} catch (JAXBException jaxbException) {
			throw new ProcessingException("Error serializing a Invoice to the output stream", jaxbException);
		}
	}

}
