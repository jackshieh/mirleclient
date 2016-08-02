package com.shenghsiang.common;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil {
	private static final String PERSISTENT_UNIT = "mirleclient" ;
	public static EntityManagerFactory getEntityManagerFactory() {		
		return Persistence.createEntityManagerFactory(PERSISTENT_UNIT);
	}
}
	