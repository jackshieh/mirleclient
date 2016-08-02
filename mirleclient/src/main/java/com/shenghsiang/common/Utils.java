package com.shenghsiang.common;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/*
 * Format a date to a String
 */
public class Utils {
	public static String formatDate(Date date) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(date);
	}

	public static Date parse(String strDateTime) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.parse(strDateTime);
	}
	/*
	 * Convert date string from yyyyMMdd to yyyy/MM/dd
	 */
	public static String convertDateString(String strDate) {
		Objects.requireNonNull(strDate);
		if (strDate.length() == 8) {
			return strDate.substring(0, 4) + "/" + strDate.substring(4, 6) + "/" + strDate.substring(6);
		}
		return strDate;
	}
	/*
	 * Convert a date string to xml
	 */
	public static XMLGregorianCalendar strDateTimeToXml(String strDateTime) {
		XMLGregorianCalendar xmlDate = null;
		try {
			Date date = parse(strDateTime);
			GregorianCalendar gc = new GregorianCalendar();
			gc.setTime(date);
			xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
		} catch (ParseException parseException) {
			// TODO: add log here
		} catch (DatatypeConfigurationException dataTypeConfigurationException) {
			//
		}
		return xmlDate;
	}

	static public XMLGregorianCalendar getXMLGregorianCalendarNow() {
		XMLGregorianCalendar now = null;

		try {
			GregorianCalendar gregorianCalendar = new GregorianCalendar();
			now = DatatypeFactory.newInstance().newXMLGregorianCalendar(
					gregorianCalendar);		
			now.setMillisecond(DatatypeConstants.FIELD_UNDEFINED);
			now.setTimezone(DatatypeConstants.FIELD_UNDEFINED);	
		} catch (DatatypeConfigurationException dataTypeConfigurationException) {
			//
		}
		return now;
	}

	static public String getCurrentDateTime() {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String today = df.format(new Date());
		return today;
	}

	static public String getCurrentDate() {		
		return getDateFormat(new Timestamp(new Date().getTime()));
	}
	
	static public String getCurrentTime() {
		DateFormat df = new SimpleDateFormat("hh:mm:ss");
		return df.format(new Date());
	}
	
	static public XMLGregorianCalendar getXMLGregorianCalendarDate(XMLGregorianCalendar cal) {		
		cal.setHour(DatatypeConstants.FIELD_UNDEFINED);
		cal.setMinute(DatatypeConstants.FIELD_UNDEFINED);
		cal.setSecond(DatatypeConstants.FIELD_UNDEFINED);
		cal.setMillisecond(DatatypeConstants.FIELD_UNDEFINED);
		cal.setTimezone( DatatypeConstants.FIELD_UNDEFINED );
		return cal;
	}

	static public void addMessage(String clientId, String msg) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, msg, null);
		FacesContext.getCurrentInstance().addMessage(clientId, message);
	}

	public static String getCurrentInvTerm() {
		final int ROC_YEAR_DIFF = 1911;
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		year = year - ROC_YEAR_DIFF;
		month = (month + 1) % 2 == 0? month + 1 : month + 2;		
		return year + String.format("%2d",  month).replace(" ", "0");		
	}

	public static String getNextInvTerm() {
		final int ROC_YEAR_DIFF = 1911;
		Calendar cal = Calendar.getInstance();
		// add 2 months to current date
		cal.add(Calendar.MONTH, 2);
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);		
		year = year - ROC_YEAR_DIFF;		
		month = (month + 1) % 2 == 0? month + 1 : month + 2;		
		return year + String.format("%2d",  month).replace(" ", "0");		
	}

	public static String getDateFormat(Timestamp timestamp) {
		return new SimpleDateFormat("yyyy-MM-dd").format(timestamp);				
	}

	public static void main(String[] args) {
		// System.out.println(convertDateString("20150711"));
		// System.out.println(getCurrentInvTerm());
		Timestamp a = new Timestamp(new Date().getTime());
		System.out.println(a.toString());
		Calendar cal = Calendar.getInstance();
		// cal.set(2016, 0, 13);
		cal.set(Calendar.YEAR, 2016);
		cal.set(Calendar.MONTH, 0);
		cal.set(Calendar.DAY_OF_MONTH, 13);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(cal.getTime()));
	}
}
