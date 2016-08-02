package com.shenghsiang.mirleclient.jpa.test;

import static org.junit.Assert.assertNotEquals;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.junit.Before;
import org.junit.Test;

import com.shenghsiang.common.EntityManagerUtil;
import com.shenghsiang.mirle.entity.InvNo;
import com.shenghsiang.mirle.entity.MathNokey;
import com.shenghsiang.mirle.entity.TfPss;

public class JPATest {
	private EntityManager em;

	@Before
	public void setup() {
		em = EntityManagerUtil.getEntityManagerFactory().createEntityManager();
	}
/*
	@Test
	public void testGetInvoiceObject() {
		InvNoPK key = new InvNoPK();
		key.setInvNo("TT12618753");
		key.setBilId("SA");
		key.setBilNo("SA41290001");
		InvNo invoice = em.find(InvNo.class, key);
		System.out.println("---------" + invoice.getCust().getCusNo());
		assertEquals(invoice.getCust().getCusNo(), "052304");
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testNamedQuery() {
		Query query = em.createNamedQuery("InvNo.findByPK");
		InvNoPK pk = new InvNoPK();
		pk.setBilId("SA");
		pk.setBilNo("SA41290001");
		pk.setInvNo("TT12618753");
		query.setParameter("pk", pk);
		List<InvNo> list = query.getResultList();
		assertEquals(1, list.size());
	}

	@Test
	@SuppressWarnings("unchecked")
	public void testNamedQuery2() {
		Collection<InvNo> list = em.createNamedQuery("InvNo.findAll")
				.getResultList();
		assertNotEquals(0, list.size());
	}
*/
	@Test
	@SuppressWarnings("unchecked")
	public void testFetchInvoiceByDate() {
		Query query = em.createNamedQuery("InvNo.findByInvoiceDate");		
		DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
		Date date = null;
		
		try {
			date = df.parse("03-03-2015");
		} catch (ParseException e) {
			e.printStackTrace();
		}		

		Timestamp invoiceTimestamp = new Timestamp(date.getTime());
		query.setParameter("invoice_date", invoiceTimestamp);
		Collection<InvNo> list = query.getResultList();
		System.out.println("------------------test------------------");
		System.out.println(list.size());
		assertNotEquals(0, list.size());
	}

	@Test
	public void testMathNokey() {
		Query query = em.createNamedQuery("MathNokey.findAll");
		List<MathNokey> list = query.getResultList();
		assertNotEquals(0, list.size());
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testTfPssListByPsNo() {
		Query query = em.createNamedQuery("TfPss.findByPsNo");	
		query.setParameter("psNo", "SA47080006");
		List<TfPss> list = query.getResultList();
		assertNotEquals(0, list.size());
	}
	
	public void tearDown() {
		em.close();
	}
}
