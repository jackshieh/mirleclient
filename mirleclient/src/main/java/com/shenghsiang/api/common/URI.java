package com.shenghsiang.api.common;

public enum URI {
	API_QRY_INVHEADER("qryInvHeader", "/PB2CAPIVAN/invapp/InvApp", 	new Parameter[] {
		Parameter.VERSION, Parameter.TYPE, Parameter.INVNUM, Parameter.ACTION, Parameter.GENERATION, Parameter.INVDATE, Parameter.UUID, Parameter.APPID, Parameter.SIGNATURE}), 
	API_QRY_INVDETAIL(
			"qryInvDetail", "/PB2CAPIVAN/invapp/InvApp", new Parameter[] {
					Parameter.VERSION, 
					Parameter.TYPE, 
					Parameter.INVNUM,
					Parameter.ACTION, 
					Parameter.GENERATION,
					Parameter.INVTERM, 
					Parameter.INVDATE,
					Parameter.ENCRYPT, 
					Parameter.SELLERID, 
					Parameter.UUID,
					Parameter.RANDOMNUMBER, 
					Parameter.APPID,
					Parameter.SIGNATURE
			}), 
	API_QRY_WINNINGLIST(
			"QryWinningList", "/PB2CAPIVAN/invapp/InvApp", new Parameter[] {
					Parameter.VERSION, 
					Parameter.ACTION, 
					Parameter.INVTERM,
					Parameter.UUID, 
					Parameter.APPID, 
					Parameter.SIGNATURE
			}), 
	API_QRY_LOVECODE(
			"qryLoveCode", "/PB2CAPIVAN/loveCodeapp/qryLoveCode", new Parameter[] {
				Parameter.VERSION, 
				Parameter.QKEY, 
				Parameter.ACTION, 
				Parameter.UUID,
				Parameter.APPID, 
				Parameter.SIGNATURE
			}), 
	API_CARRIERINVCHK(
			"carrierInvChk", "/PB2CAPIVAN/invServ/InvServ", new Parameter[] {
					Parameter.VERSION, 
					Parameter.CARDTYPE,
					Parameter.CARDNO, 
					Parameter.EXPTIMESTAMP,
					Parameter.ACTION, 
					Parameter.STARTDATE,
					Parameter.ENDDATE, 
					Parameter.ONLYWINNINGINV,
					Parameter.UUID, 
					Parameter.APPID, 
					Parameter.CARDENCRYPT,
					Parameter.SIGNATURE
			}), 
	API_CARRIERINVDETAIL(
			"carrierInvDetail", "/PB2CAPIVAN/invServ/InvServ", new Parameter[] {
					Parameter.VERSION, 
					Parameter.CARDTYPE,
					Parameter.CARDNO, 
					Parameter.EXPTIMESTAMP,
					Parameter.ACTION, 
					Parameter.TIMESTAMP,
					Parameter.INVNUM, 
					Parameter.INVDATE, 
					Parameter.UUID,
					Parameter.SELLERNAME, 
					Parameter.AMOUNT,
					Parameter.APPID, 
					Parameter.CARDENCRYPT,
					Parameter.SIGNATURE
			}), 
	API_CARRIERINVDNT(
			"carrierInvDnt", "/PB2CAPIVAN/CarInv/Donate", new Parameter[] {
					Parameter.VERSION, 
					Parameter.SERIAL,
					Parameter.CARDTYPE, 
					Parameter.CARDNO,
					Parameter.EXPTIMESTAMP, 
					Parameter.ACTION,
					Parameter.TIMESTAMP, 
					Parameter.INVDATE,
					Parameter.INVNUM, 
					Parameter.NPOBAN, 
					Parameter.UUID,
					Parameter.APPID, 
					Parameter.CARDENCRYPT,
					Parameter.SIGNATURE
			});

	private final String uri;
	private final String apiName;
	// private final EnumSet<Parameter> parameters;
	private  Parameter[] parameterArray;

	URI(String apiName, String uri, Parameter[] parameters) {
		this.apiName = apiName;
		this.uri = uri;
		this.parameterArray = parameters;
	}

	public String getUri() {
		return uri;
	}

	public String getApiName() {
		return apiName;
	}

	public String getParamterNames() {
		StringBuffer buffer = new StringBuffer();
		for (Parameter p : parameterArray) { 				
			buffer.append(p.getApi() + " ");
		}
		return buffer.toString();
	}

	boolean hasSignature() {
		boolean found = false;
		for (Parameter p : parameterArray) {
			if (p == Parameter.SIGNATURE) {
				found = true;
				break;
			}
		}
		return found;
	}

	public Parameter[] getParameterArray() {
		return parameterArray;
	}

}
