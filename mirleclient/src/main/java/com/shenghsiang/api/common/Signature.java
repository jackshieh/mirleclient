package com.shenghsiang.api.common;

import java.security.SignatureException;
import java.util.Arrays;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

public class Signature {
	private static final String HMAC_SHA1_ALGORITHM = "HmacSHA1";

	/**
	 * Computes RFC 2104-compliant HMAC signature. * @param data The data to be
	 * signed. The standard algorithm names can be found at http://docs.oracle.com/javase/7/docs/technotes/guides/security/StandardNames.html 
	 * 
	 * @param key   The signing key.
	 * @return      The Base64-encoded RFC 2104-compliant HMAC signature.
	 * @throws      java.security.SignatureException when signature generation fails
	 *             
	 */
	public static String getHMACSHA1(String data, String key)
			throws java.security.SignatureException {
		String result;
		try {

			// get an hmac_sha1 key from the raw key bytes
			SecretKeySpec signingKey = new SecretKeySpec(key.getBytes(), HMAC_SHA1_ALGORITHM);

			// get an hmac_sha1 Mac instance and initialize with the signing key
			Mac mac = Mac.getInstance(HMAC_SHA1_ALGORITHM);
			mac.init(signingKey);
			// Base64.encodeBase64String uses UTF-8 as the String encoding
		    result = Base64.encodeBase64String(mac.doFinal(data.getBytes()));	        
		} catch (Exception e) {
			throw new SignatureException("Failed to generate HMAC : " + e.getMessage());
		}
		return result;
	}
	
	public static void main(String[] params) throws Exception {
		/*
		System.out.println(getHMACSHA1("version=0.2&action=QryWinningList&invTerm=10402&UUID=9ea1a26a-aef4-4637-a514-50ee03316d1d&appID=EINV0201503081394", APIConstant.API_KEY));
		System.out.println(getHMACSHA1("version=0.2&action=qryWinningList&invTerm=10402&UUID=9ea1a26a-aef4-4637-a514-50ee03316d1d&appID=EINV0201503081394", APIConstant.API_KEY));
		*/		
		//System.out.println(getHMACSHA1("version=0.2&type=QRCode&invNum=VA12602254&action=qryInvHeader&generation=V2&invDate=2015/03/02&UUID=9ea1a26a-aef4-4637-a514-50ee03316d1d&appID=EINV0201503081394", APIConstant.API_KEY));
		String text = "eyJzX2RhdGUiOiIyMDE1LTA0LTIxIiwiZV9kYXRlIjoiMjAxNS0wNC0yMiIsInNlYXJjaF9jb25kIjoiIiwic2VhcmNoZmllbGQiOiIwIiwiQ09NUF9TTiI6IjM0MDUiLCJTVE9SRV9JRCI6IjM0MDUiLCJFTVAiOiIzNDA1LTM0MDUiLCJJRCI6IjEzMTk1ODgzIiwiSF9JRCI6IjI4NTMxMzM5IiwicFByaW50IjoiMCIsInBsb2dvX25hbWUiOiJcdThjNTBcdTc2YzhcdTgwYTFcdTRlZmRcdTY3MDlcdTk2NTBcdTUxNmNcdTUzZjgiLCJwQ29tUG9ydCI6IkNPTTMiLCJwcG9zVHlwZSI6IjUyMDAiLCJwYnBzVHlwZSI6IjM4NDAwIiwic0RhdGEiOiIiLCJmcERhdGEiOiIifQ==";
		byte[] byteArray = Base64.decodeBase64(text);
		System.out.println(Arrays.toString(byteArray));
		System.out.println(new String(byteArray));
	}
}