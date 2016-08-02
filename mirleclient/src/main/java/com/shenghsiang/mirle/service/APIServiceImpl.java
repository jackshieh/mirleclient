package com.shenghsiang.mirle.service;

import java.util.EnumMap;
import java.util.Objects;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.springframework.stereotype.Component;

import com.shenghsiang.api.common.APIURIBuilder;
import com.shenghsiang.api.common.Parameter;
import com.shenghsiang.api.model.InvDetailRequest;
import com.shenghsiang.api.model.InvDetailResponse;
import com.shenghsiang.api.model.InvHeaderRequest;
import com.shenghsiang.api.model.InvHeaderResponse;
import com.shenghsiang.api.model.InvoiceWinningListRequest;
import com.shenghsiang.api.model.InvoiceWinningListResponse;
import com.shenghsiang.api.model.LoveCodeRequest;
import com.shenghsiang.api.model.LoveCodeResponse;


@Component("apiService")
public class APIServiceImpl implements APIService {
	final static Logger logger = Logger.getLogger(APIServiceImpl.class);	
	
	/*
	 * TODO: consider using Dozer to get parameters
	 */
	private EnumMap<Parameter, String> getQryWinningListParameters(InvoiceWinningListRequest request) {		
		EnumMap<Parameter, String> parameterMap = new EnumMap<>(Parameter.class);		
		parameterMap.put(Parameter.VERSION, request.getVersion());
		parameterMap.put(Parameter.INVTERM, request.getInvTerm());
		parameterMap.put(Parameter.ACTION, request.getAction());
		parameterMap.put(Parameter.UUID, request.getUUID());
		parameterMap.put(Parameter.APPID, request.getAppID());
		return parameterMap;
	}

	private EnumMap<Parameter, String> getQryInvHeaderParameters(InvHeaderRequest request) {
		EnumMap<Parameter, String> parameterMap = new EnumMap<>(Parameter.class);		
		parameterMap.put(Parameter.VERSION, request.getVersion());
		parameterMap.put(Parameter.TYPE, request.getType());
		parameterMap.put(Parameter.INVNUM, request.getInvNum());
		parameterMap.put(Parameter.ACTION, request.getAction());
		parameterMap.put(Parameter.GENERATION, request.getGeneration());
		parameterMap.put(Parameter.INVDATE, request.getInvDate());
		parameterMap.put(Parameter.UUID, request.getUUID());
		parameterMap.put(Parameter.APPID, request.getAppID());
		return parameterMap;
	}

	private EnumMap<Parameter, String> getQryInvDetailParameters(InvDetailRequest request) {
		EnumMap<Parameter, String> parameterMap = new EnumMap<>(Parameter.class);
		parameterMap.put(Parameter.VERSION, request.getVersion());
		parameterMap.put(Parameter.TYPE, request.getType());
		parameterMap.put(Parameter.INVNUM, request.getInvNum());
		parameterMap.put(Parameter.ACTION, request.getAction());
		parameterMap.put(Parameter.GENERATION, request.getGeneration());	
		if (request.getType().equals("Barcode")) {
			parameterMap.put(Parameter.INVTERM, request.getInvTerm());
		} else {
			parameterMap.put(Parameter.ENCRYPT, request.getEncrypt());
			parameterMap.put(Parameter.SELLERID, request.getSellerID());
		}
		parameterMap.put(Parameter.INVDATE, request.getInvDate());
		parameterMap.put(Parameter.UUID, request.getUUID());
		parameterMap.put(Parameter.RANDOMNUMBER, request.getRandomNumber());
		parameterMap.put(Parameter.APPID, request.getAppID());
		return parameterMap;
	}
	
	private EnumMap<Parameter, String> getQryLoveCodeParameters(LoveCodeRequest request) {
		EnumMap<Parameter, String> parameterMap = new EnumMap<>(Parameter.class);
		parameterMap.put(Parameter.VERSION, request.getVersion());
		parameterMap.put(Parameter.QKEY, request.getqKey());
		parameterMap.put(Parameter.ACTION, request.getAction());
		parameterMap.put(Parameter.UUID, request.getUUID());
		parameterMap.put(Parameter.APPID, request.getAppID());
		return parameterMap;
	}
	
	@Override
	public InvoiceWinningListResponse getQryWinningList(
			InvoiceWinningListRequest request) {
		ClientConfig config = new ClientConfig();	
		config.register(JacksonFeature.class);
		Client client = ClientBuilder.newClient(config).register(QryWinningListResponseMessageReader.class);
		String url = APIURIBuilder.getQryWinningList(getQryWinningListParameters(request));
		WebTarget target = client.target(url);		
		InvoiceWinningListResponse response = target.request().accept(MediaType.APPLICATION_JSON).get(InvoiceWinningListResponse.class);		
		return response;
	}

	@Override
	public InvHeaderResponse getQryInvHeader(InvHeaderRequest request) {
		Objects.requireNonNull(request);
		String url = APIURIBuilder.getQryInvHeader(getQryInvHeaderParameters(request));
		logger.debug("getQryInvHeader url:" + url);		
		ClientConfig config = new ClientConfig();	
		config.register(JacksonFeature.class);
		Client client = ClientBuilder.newClient(config).register(QryInvHeaderResponseMessageReader.class);
		WebTarget target = client.target(url);
		InvHeaderResponse response = target.request().accept(MediaType.APPLICATION_JSON).get(InvHeaderResponse.class);
		return response;
	}

	@Override
	public InvDetailResponse getQryInvDetails(InvDetailRequest request) {
		Objects.requireNonNull(request);
		String url = APIURIBuilder.getQryInvDetail(getQryInvDetailParameters(request));
		logger.debug("getQryInvDetails url:" + url);		
		ClientConfig config = new ClientConfig();	
		config.register(JacksonFeature.class);
		Client client = ClientBuilder.newClient(config).register(QryInvDetailResponseMessageReader.class);
		WebTarget target = client.target(url);
		InvDetailResponse response = target.request().accept(MediaType.APPLICATION_JSON).get(InvDetailResponse.class);
		return response;		
	}

	@Override
	public LoveCodeResponse getQryLoveCode(LoveCodeRequest request) {
		Objects.requireNonNull(request);
		String url = APIURIBuilder.getQryLoveCode(getQryLoveCodeParameters(request));
		logger.debug("getQryLoveCode url:" + url);
		ClientConfig config = new ClientConfig();	
		config.register(JacksonFeature.class);
		Client client = ClientBuilder.newClient(config).register(QryLoveCodeResponseMessageReader.class);
		WebTarget target = client.target(url);
		LoveCodeResponse response = target.request().accept(MediaType.APPLICATION_JSON).get(LoveCodeResponse.class);		
		return response;
	}

	 
}
