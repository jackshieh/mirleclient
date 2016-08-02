package com.shenghsiang.api.common;

import java.security.SignatureException;
import java.util.UUID;

/*
 * 簽名(Signature)必頇採用 Base64編碼之 HMAC-SHA1 演算法，
 * 以APIKey作為秘密鑰匙， 針對UTF-8字串所有參數(下面以手機條碼註冊為例)
 * “action=generalCarrierReg&appID=...&email=...&phoneNo=...&serial=...&timeStamp=...&uuid=...& version=...”
 * 產生簽名結果 (請注意參數需按升冪排序排列後進行簽名， 
 * 並注意參數名稱大小寫及特殊符號是以編碼前做為參數，否則簽名可能會出錯)
 */
public class APIUtil {
	
	public static String getSignature(String data) {
		String result = null;
		try {
			result = Signature.getHMACSHA1(data, APIConstant.API_KEY);
		} catch (SignatureException e) {
			e.printStackTrace();
		}
		return result;
	} 

	public static String getUUID() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString();
	}
	
	public static String getFixedUUID() {
		return APIConstant.API_UUID;
	}
	
	public static void main(String[] args) {
		//System.out.println(getUUID());
		System.out.println(getSignature("version=0.2&action=QryWinningList&invTerm=10310&appID=EINV0201503081394&UUID=9ea1a26a-aef4-4637-a514-50ee03316d1d"));
	}
}
