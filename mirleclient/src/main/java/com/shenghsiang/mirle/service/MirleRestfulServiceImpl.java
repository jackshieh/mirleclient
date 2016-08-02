package com.shenghsiang.mirle.service;

import java.math.RoundingMode;
import java.util.List;
import java.util.Objects;

import javax.annotation.Resource;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.shenghsiang.common.Utils;
import com.shenghsiang.mirle.MirleConfig;
import com.shenghsiang.mirle.a03.InvHeaderUploadRequest;
import com.shenghsiang.mirle.a03.response.A03INDEXMessageReader;
import com.shenghsiang.mirle.c03.response.C03INDEXMessageReader;
import com.shenghsiang.mirle.common.AllowanceTypeEnum;
import com.shenghsiang.mirle.common.Environment;
import com.shenghsiang.mirle.common.InvoiceTypeEnum;
import com.shenghsiang.mirle.common.MessageTypeEnum;
import com.shenghsiang.mirle.common.TaxTypeEnum;
import com.shenghsiang.mirle.common.XmlUtils;
import com.shenghsiang.mirle.d0401.Allowance;
import com.shenghsiang.mirle.d0401.response.D0401ResponseMessageReader;
import com.shenghsiang.mirle.d0501.response.D0501ResponseMessageReader;
import com.shenghsiang.mirle.entity.InvNo;
import com.shenghsiang.mirle.entity.InvNoPK;
import com.shenghsiang.mirle.entity.MfPss;
import com.shenghsiang.mirle.entity.TfPss;
import com.shenghsiang.mirle.repo.InvoiceRepository;

@Service(value="mirleRestfulService")
// @Component("mirleRestfulService")
public class MirleRestfulServiceImpl implements MirleRestfulService {
	@Resource
	private InvoiceRepository invoiceRepository;

	final static Logger logger = LoggerFactory.getLogger(MirleRestfulServiceImpl.class);

	@Override
	public com.shenghsiang.mirle.a03.response.INDEX postA03(InvHeaderUploadRequest request) {
		Objects.requireNonNull(request);
		com.shenghsiang.mirle.a03.INDEX index = new com.shenghsiang.mirle.a03.ObjectFactory().createINDEX();
		index.setINVOICECODE(MessageTypeEnum.A03.name());
		index.setSELLERID(DEFAULT_SELLER_TAX_ID);		
		index.setPOSID(MirleConfig.ENVIRONMENT.getPosId());
		index.setPOSSN(MirleConfig.ENVIRONMENT.getKey());
		index.setSYSTIME(Utils.getCurrentDateTime());	
		
		// INVOICE_DATA
		com.shenghsiang.mirle.a03.INDEX.INVOICEDATA invoiceData = new com.shenghsiang.mirle.a03.ObjectFactory().createINDEXINVOICEDATA();
		invoiceData.setSELLERID(DEFAULT_SELLER_TAX_ID);
		invoiceData.setTYPE(InvoiceTypeEnum.EINVOICE.getId());
		invoiceData.setTYPENAME(InvoiceTypeEnum.EINVOICE.getName());
		invoiceData.setTAXMONTH(request.getTaxMonth());
		invoiceData.setINVOICEHEADER(request.getInvHeader());
		invoiceData.setINVOICESTART(request.getInvStartNum());
		invoiceData.setINVOICEEND(request.getInvEndNumber());
		index.setINVOICEDATA(invoiceData);
		
		// marchal to xml and upload it to Mirle
		String xml = XmlUtils.marshal(index, null);
		ClientConfig clientConfig = new ClientConfig();
		Client client = ClientBuilder.newClient(clientConfig).register(A03INDEXMessageReader.class);
		WebTarget target = client.target(MirleConfig.ENVIRONMENT.getUrl());
		Response response = target.request(MediaType.APPLICATION_XML).post(Entity.entity(xml, MediaType.APPLICATION_XML));
		return response.readEntity(com.shenghsiang.mirle.a03.response.INDEX.class);		
	}

	@Override
	public com.shenghsiang.mirle.c03.response.INDEX postC03(InvHeaderUploadRequest request) {
		Objects.requireNonNull(request);
		com.shenghsiang.mirle.c03.INDEX index = new com.shenghsiang.mirle.c03.ObjectFactory().createINDEX();
		index.setINVOICECODE(MessageTypeEnum.C03.name());
		index.setSELLERID(DEFAULT_SELLER_TAX_ID);
		index.setPOSID(MirleConfig.ENVIRONMENT.getPosId());
		index.setPOSSN(MirleConfig.ENVIRONMENT.getKey());		
		index.setSYSTIME(Utils.getCurrentDateTime());	
		
		// INVOICE_DATA
		com.shenghsiang.mirle.c03.INDEX.INVOICEDATA invoiceData = new com.shenghsiang.mirle.c03.ObjectFactory().createINDEXINVOICEDATA();
		invoiceData.setSELLERID(DEFAULT_SELLER_TAX_ID);
		invoiceData.setTYPE(InvoiceTypeEnum.EINVOICE.getId());
		invoiceData.setTYPENAME(InvoiceTypeEnum.EINVOICE.getName());
		invoiceData.setTAXMONTH(request.getTaxMonth());
		invoiceData.setINVOICEHEADER(request.getInvHeader());
		invoiceData.setINVOICESTART(request.getInvStartNum().trim());
		invoiceData.setINVOICEEND(request.getInvEndNumber().trim());
		index.setINVOICEDATA(invoiceData);
		
		String xml = XmlUtils.marshal(index, null);
		logger.debug(xml);		
		ClientConfig clientConfig = new ClientConfig();
		Client client = ClientBuilder.newClient(clientConfig).register(C03INDEXMessageReader.class);
		WebTarget target = client.target(MirleConfig.ENVIRONMENT.getUrl());
		Response response = target.request(MediaType.APPLICATION_XML).post(Entity.entity(xml, MediaType.APPLICATION_XML));		
		return response.readEntity(com.shenghsiang.mirle.c03.response.INDEX.class);
	}

	/*
	 * Use MfPss to post D0401 to Mirle, which is for the Sale Allowance
	 * @return INDEX the response object from Mirle
	 */
	public com.shenghsiang.mirle.d0401.response.INDEX postD0401(MfPss mfPss) {
		com.shenghsiang.mirle.d0401.response.INDEX index = null;
		if (mfPss != null) {
			com.shenghsiang.mirle.d0401.ObjectFactory objectFactory = new com.shenghsiang.mirle.d0401.ObjectFactory();
			Allowance allowance = objectFactory.createAllowance();
			int count = 0;
			allowance.getContent().add(count++, objectFactory.createAllowanceINVOICECODE(MessageTypeEnum.D0401.name()));
			allowance.getContent().add(count++, objectFactory.createAllowanceSELLERID(DEFAULT_SELLER_TAX_ID));
			allowance.getContent().add(count++, objectFactory.createAllowancePOSSN(MirleConfig.ENVIRONMENT.getKey()));
			allowance.getContent().add(count++, objectFactory.createAllowancePOSID(MirleConfig.ENVIRONMENT.getPosId()));
			allowance.getContent().add(count++, objectFactory.createAllowanceSYSTIME(Utils.getCurrentDateTime()));	
			allowance.getContent().add(count++, objectFactory.createAllowanceALLOWANCENUMBER(mfPss.getId().getPsNo()));
			// if allowance date is not found, use the default 
			String allowanceDate = mfPss.getPsDd() == null? DEFAULT_ALLOWANCE_DATE : Utils.getDateFormat(mfPss.getPsDd());
			allowance.getContent().add(count++, objectFactory.createAllowanceALLOWANCEDATE(allowanceDate));
			String buyerTaxId = (mfPss.getCust() != null && mfPss.getCust().getUniNo() != null)? mfPss.getCust().getUniNo() : DEFAULT_BUYER_TAX_ID;
			logger.debug("Buer ID: " + buyerTaxId);
			allowance.getContent().add(count++, objectFactory.createAllowanceIDENTIFIER(buyerTaxId));
			allowance.getContent().add(count++, objectFactory.createAllowanceNAME(mfPss.getCust().getName()));
			String address = mfPss.getCust().getAdr1() == null ? "" : mfPss.getCust().getAdr1();
			allowance.getContent().add(count++, objectFactory.createAllowanceADDRESS(address));
			allowance.getContent().add(count++, objectFactory.createAllowancePERSONINCHARGE(""));
			allowance.getContent().add(count++, objectFactory.createAllowanceTELEPHONENUMBER(""));
			allowance.getContent().add(count++, objectFactory.createAllowanceFACSIMILENUMBER(""));
			allowance.getContent().add(count++, objectFactory.createAllowanceEMAILADDRESS(""));
			allowance.getContent().add(count++, objectFactory.createAllowanceROLEREMARK(""));
			allowance.getContent().add(count++, objectFactory.createAllowanceALLOWANCETYPE(AllowanceTypeEnum.SELLER.getValue()));

			// create PRODUCTITEM
			int totalTaxAmount = 0;
			float totalNetSalesAmount = 0.0f;
			for (TfPss tfPss : mfPss.getTfPsses()) {
				Allowance.PRODUCTITEM productItem = objectFactory.createAllowancePRODUCTITEM();
				productItem.setORIGINALINVOICEDATE(Utils.getDateFormat(mfPss.getInvNo().getInvDd()));
				productItem.setORIGINALINVOICENUMBER(mfPss.getInvNo().getId().getInvNo());
				// this sequence should be the one from the Sales
				productItem.setORIGINALSEQUENCENUMBER(tfPss.getId().getItm());
				productItem.setORIGINALDESCRIPTION(tfPss.getPrdName());
				// if qty is null deault to 1
				float qty = tfPss.getQty() == null? 1f : tfPss.getQty().setScale(2, RoundingMode.HALF_UP).floatValue();
				productItem.setQUANTITY(qty);
				// logger.info("UNIT: " + tfPss.getPrdt().getUt());
				productItem.setUNIT(tfPss.getPrdt().getUt());
				float unitPrice = tfPss.getUp() == null? (tfPss.getAmtnNet() == null? 0f :tfPss.getAmtnNet().setScale(2, RoundingMode.HALF_UP).floatValue()) : tfPss.getUp().setScale(2, RoundingMode.HALF_UP).floatValue();
				productItem.setUNITPRICE(unitPrice);
				float amt = tfPss.getAmt() == null ? 0.0f :  tfPss.getAmt().setScale(2, RoundingMode.HALF_UP).floatValue();
				productItem.setAMOUNT(amt);
				totalNetSalesAmount = totalNetSalesAmount + amt;
				productItem.setTAX(tfPss.getTax().intValue());
				totalTaxAmount = totalTaxAmount + tfPss.getTax().intValue();
				// assuming only 1 Allowance needs to be sent
				productItem.setALLOWANCESEQUENCENUMBER(tfPss.getId().getItm());
				productItem.setTAXTYPE(TaxTypeEnum.TAXABLE.getVaue());
				allowance.getContent().add(count++, objectFactory.createAllowancePRODUCTITEM(productItem));
			}
			allowance.getContent().add(count++, objectFactory.createAllowanceTAXAMOUNT(totalTaxAmount));
			allowance.getContent().add(count++, objectFactory.createAllowanceTOTALAMOUNT(Float.valueOf(totalNetSalesAmount).intValue()));			
			String xml = XmlUtils.marshal(allowance, null);
			logger.debug(xml);
			ClientConfig clientConfig = new ClientConfig();
			Client client = ClientBuilder.newClient(clientConfig).register(D0401ResponseMessageReader.class);
			WebTarget target = client.target(MirleConfig.ENVIRONMENT.getUrl());
			Response response = target.request(MediaType.APPLICATION_XML).post(Entity.entity(xml, MediaType.APPLICATION_XML));
			index = response.readEntity(com.shenghsiang.mirle.d0401.response.INDEX.class);
			// save the response message back to MF_PSS.REM if runs on the PRODUCTION environment
			//if (index != null && MirleConfig.ENVIRONMENT == Environment.PRODUCTION) {
			if (index != null) {
				logger.debug("Message: " + index.getMESSAGE());
				updateMfPssRem(mfPss, index.getMESSAGE());
			}
		}
		return index;		
	}
	
	@Override
	public void postD0401(List<MfPss> salesList) {				
		if (salesList != null) {
			logger.debug("Begin processing D0401 ");
			for (MfPss mfPss : salesList) {
				logger.debug("Processing MF_PSS.PS_NO: " + mfPss.getId().getPsNo());
				com.shenghsiang.mirle.d0401.response.INDEX index = postD0401(mfPss);
				if (index != null) {
					logger.debug(index.getMESSAGE());
				}
				logger.debug("End of processing MF_PSS.PS_NO: " + mfPss.getId().getPsNo()); 
			}
		}	
	}

	@Override
	public void postD0501(List<MfPss> salesList) {
		if (salesList != null) {
			logger.debug("Begin processing D0501");
			for (MfPss mfPss: salesList) {	
				logger.info("Processing " + mfPss.getId().getPsNo());
				com.shenghsiang.mirle.d0501.response.INDEX index = postD0501(mfPss);
				if (index != null) logger.info("Message: " + index.getMESSAGE());
			}
			logger.debug("End of processing D0501 ");
		}
	}

	public com.shenghsiang.mirle.d0501.response.INDEX postD0501(MfPss mfPss) {
		com.shenghsiang.mirle.d0501.response.INDEX index = null;
		if (mfPss != null) {
			com.shenghsiang.mirle.d0501.ObjectFactory objectFactory = new com.shenghsiang.mirle.d0501.ObjectFactory();
			com.shenghsiang.mirle.d0501.Invoice invoice = objectFactory.createInvoice();
			invoice.setINVOICECODE(MessageTypeEnum.D0501.name());
			invoice.setPOSSN(MirleConfig.ENVIRONMENT.getKey());
			invoice.setPOSID(MirleConfig.ENVIRONMENT.getPosId());
			invoice.setCANCELALLOWANCENUMBER(mfPss.getId().getPsNo());
			invoice.setALLOWANCEDATE(Utils.getDateFormat(mfPss.getPsDd()));
			String buyerId = (mfPss.getInvNo().getUniNoBuy() != null && mfPss.getInvNo().getUniNoBuy().length() > 0)? mfPss.getInvNo().getUniNoBuy() : DEFAULT_BUYER_TAX_ID;
			invoice.setBUYERID(buyerId);
			invoice.setSELLERID(mfPss.getInvNo().getUniNoPay());
			invoice.setCANCELDATE(Utils.getCurrentDate());
			invoice.setCANCELTIME(Utils.getCurrentTime());
			//TODO: get reason from user
			invoice.setCANCELREASON("稅計算錯誤");
			// TODO: get remark from user
			invoice.setREMARK("");
			invoice.setSYSTIME(Utils.getCurrentDateTime());
			
			String xml = XmlUtils.marshal(invoice, null);
			logger.debug(xml);
			ClientConfig clientConfig = new ClientConfig();
			Client client = ClientBuilder.newClient(clientConfig).register(D0501ResponseMessageReader.class);
			WebTarget target = client.target(MirleConfig.ENVIRONMENT.getUrl());
			Response response = target.request(MediaType.APPLICATION_XML).post(Entity.entity(xml, MediaType.APPLICATION_XML));
			index = response.readEntity(com.shenghsiang.mirle.d0501.response.INDEX.class);
			// save the response message back to MF_PSS.REM if runs on the PRODUCTION environment			
			if (index != null && MirleConfig.ENVIRONMENT == Environment.PRODUCTION) {	
				updateMfPssRem(mfPss, index.getMESSAGE());
			}						
		}
		return index;
	}
	
	/*
	 * Save the message returned from Mirle to INV_NO.REM
	 */
	private void updateMfPssRem(MfPss mfPss, String message) {
		InvNoPK pk = new InvNoPK();
		pk.setBilId(mfPss.getId().getPsId());
		pk.setBilNo(mfPss.getId().getPsNo());
		pk.setInvNo(mfPss.getInvNo().getId().getInvNo());
		InvNo invNo = invoiceRepository.findByPK(pk);
		if (invNo != null) {
			invNo.setRem(message);
			invoiceRepository.save(invNo);	
		}
	}
}
