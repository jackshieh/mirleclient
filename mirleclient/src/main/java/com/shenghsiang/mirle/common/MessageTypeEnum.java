package com.shenghsiang.mirle.common;
/*
 * Message Type defined for Mirle which are different from MIG
 * A03: upload the current term of Invoice data 上傳當期發票字軌資料
 * C03: upload the next term of Invoice data 上傳下一期發票字軌資料
 * C0401: create a new invoice (B2C) 
 * C0501: void a created invoice (B2C)
 * D0401: create an Allowance (B2C) 開立折讓證明單/傳送折讓證明單
 * D0501: void a created Allowance (B2C) 平台存證作廢折讓明
 */
public enum MessageTypeEnum {
	A03, C03, C0401, D0401, D0501;
}
