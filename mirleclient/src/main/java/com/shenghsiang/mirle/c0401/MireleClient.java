package com.shenghsiang.mirle.c0401;

import java.math.BigDecimal;
import java.math.MathContext;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


import org.glassfish.jersey.client.ClientConfig;

import com.shenghsiang.common.Utils;
import com.shenghsiang.mirle.c0401.response.INDEX;

public class MireleClient {

	public static void main(String[] args) {			
//		try {
			/*
			JAXBContext jaxbContext = JAXBContext.newInstance(Invoice.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,
					Boolean.TRUE);
			*/
			Invoice invoice = createC0401Request();
			// marshaller.marshal(invoice, System.out);
			
			ClientConfig config = new ClientConfig();	
			config.register(IndexMessageReader.class);
			Client client = ClientBuilder.newClient(config);
			WebTarget target = client.target("http://xmltest.551.com.tw");		
			Response response = target.request(MediaType.APPLICATION_XML).post(Entity.entity(invoice, MediaType.APPLICATION_XML));
			INDEX index = response.readEntity(INDEX.class);
			//String output = response.readEntity(String.class);
			System.out.println(index.getMESSAGE());
			//System.out.println(output);
		// } catch (JAXBException e) {
		//	e.printStackTrace();
		// }

	}

	private static Invoice createC0401Request() {
		Invoice invoice = new ObjectFactory().createInvoice();

		// from Main
		invoice.setA1(MessageTypeEnum.C_0401);
		// TODO: read einvoice prefix from a table and determine which number
		// will be retrieved
		invoice.setA2("BB00000202");
		/*
		XMLGregorianCalendar xmlDateTime = Utils
				.strDateTimeToXml("2015-01-07 15:31:00");
		xmlDateTime.setYear(DatatypeConstants.FIELD_UNDEFINED);
		xmlDateTime.setMonth(DatatypeConstants.FIELD_UNDEFINED);
		xmlDateTime.setDay(DatatypeConstants.FIELD_UNDEFINED);
		xmlDateTime.setMillisecond(DatatypeConstants.FIELD_UNDEFINED);
		xmlDateTime.setTimezone( DatatypeConstants.FIELD_UNDEFINED );
		*/
		invoice.setA3("2015-02-24");
		invoice.setA4("15:31:34");
		invoice.setA5("16314864");
		invoice.setA6("久保泰有限公");
		invoice.setA15("1");
		invoice.setA17("1");
		invoice.setA19(Utils.getXMLGregorianCalendarDate(Utils.strDateTimeToXml("2013-02-27 00:00:00")));
		invoice.setA20("資國");
		invoice.setA21("1020001054");
		invoice.setA22("07");
		invoice.setA24("0");
		invoice.setA28("Y");
		invoice.setA30(3394);
		// from Details - coming from a List
		Invoice.B detail = new Invoice.B();
		detail.setB1(1);
		detail.setB2("軟質特級巧克力");
		detail.setB3(new BigDecimal(180.000000));
		detail.setB4("kg");
		detail.setB5(new BigDecimal(11400000.283000, MathContext.DECIMAL32));
		detail.setB6(new BigDecimal(20571.000000, MathContext.DECIMAL32));
		// product item sequence
		detail.setB7(1);
		detail.setB10(20571);
		detail.setB11("BF000A");

		invoice.getB().add(detail);

		invoice.setC1(20571);
		invoice.setC2(0);
		invoice.setC3(0);
		// 1：應稅 2：零稅率 3：免稅 4：應稅(特種稅率) 9：混合應稅與免稅或零稅率(限收銀機發票無法分辨時使用)
		invoice.setC4("1");
		invoice.setC5(0.05);
		invoice.setC6(1029);
		invoice.setC7(21600);
		invoice.setC8(0);
		invoice.setC9(0);
		invoice.setC10(0);
		invoice.setC11("TWD");

		invoice.setD1("89953466");
		invoice.setD2("22002748f9527b158758");
		invoice.setD3(1);
		invoice.setD4(Utils.getCurrentDateTime());
		return invoice;
	}

}
