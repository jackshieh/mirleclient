package com.shenghsiang.api.common;

import java.security.SignatureException;
import java.util.EnumMap;
import org.apache.log4j.Logger;

public class APIURIBuilder {
	final private static Logger logger = Logger.getLogger(APIURIBuilder.class);
	final private static String API_URL = "https://www.einvoice.nat.gov.tw";

	private static String getUrlByApi(URI uri,
			EnumMap<Parameter, String> queryStrings) {
		StringBuffer qryStrBuffer = null;
		String signature = null;
		String url = null;

		if (queryStrings != null) {
			qryStrBuffer = new StringBuffer();
			Parameter[] apiParameters = uri.getParameterArray();
			
			for (Parameter p: apiParameters) {
				String value = queryStrings.get(p);
				if (value != null)
					qryStrBuffer.append(p.getApi() + "=" + value + "&");	
			}
			/*
			Set<Map.Entry<Parameter, String>> parameterEntry = queryStrings.entrySet();
			Iterator<Map.Entry<Parameter, String>> it = parameterEntry
					.iterator();
			while (it.hasNext()) {
				Map.Entry<Parameter, String> entry = it.next();
				Parameter key = entry.getKey();
				//TODO: validate the parameter before assigning the value				
				qryStrBuffer.append(key.getApi() + "=" + entry.getValue() + "&");				
			}
			*/
			qryStrBuffer.deleteCharAt(qryStrBuffer.lastIndexOf("&"));
			// check signature requirement
			if (uri.hasSignature()) {								
				try {
					signature = Signature.getHMACSHA1(qryStrBuffer.toString(), APIConstant.API_KEY);					
				} catch (SignatureException e) {
					logger.error(e.getMessage());
				}
				qryStrBuffer.append("&signature=").append(signature);
			} 
			StringBuffer urlBuffer = new StringBuffer(API_URL)
					.append(uri.getUri()).append("?")
					.append(qryStrBuffer.toString());
			url = urlBuffer.toString();
		}
		logger.debug(url);
		return url;
	}

	public static String getQryInvHeader(EnumMap<Parameter, String> queryStrings) {
		return getUrlByApi(URI.API_QRY_INVHEADER, queryStrings);
	}

	/*
	 * TODO: special cases for different types: Barcode and QRCode
	 */
	public static String getQryInvDetail(EnumMap<Parameter, String> queryStrings) {
		return getUrlByApi(URI.API_QRY_INVDETAIL, queryStrings);
	}

	public static String getQryWinningList(
			EnumMap<Parameter, String> queryStrings) {
		return getUrlByApi(URI.API_QRY_WINNINGLIST, queryStrings);
	}

	public static String getQryLoveCode(EnumMap<Parameter, String> queryStrings) {
		return getUrlByApi(URI.API_QRY_LOVECODE, queryStrings);
	}

	public static String getCarrierInvChk(
			EnumMap<Parameter, String> queryStrings) {
		return getUrlByApi(URI.API_CARRIERINVCHK, queryStrings);
	}

	public static String getCarrierInvDetail(
			EnumMap<Parameter, String> queryStrings) {
		return getUrlByApi(URI.API_CARRIERINVDETAIL, queryStrings);
	}

	public static String getCarrierInvDnt(
			EnumMap<Parameter, String> queryStrings) {
		return getUrlByApi(URI.API_CARRIERINVDNT, queryStrings);
	}

}
