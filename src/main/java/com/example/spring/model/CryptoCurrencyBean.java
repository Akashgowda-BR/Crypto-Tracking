package com.example.spring.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cryptocurrency", schema = "public")
public class CryptoCurrencyBean {
	
	String CRYPTONAME;
	int LTP;
	String USERNAME;
	int uid;
	@Id
	int CRYPTID;
	
	
	public String getCRYPTONAME() {
		return CRYPTONAME;
	}


	public int getUid() {
		return uid;
	}


	public void setUid(int uid) {
		this.uid = uid;
	}


	public void setCRYPTONAME(String cRYPTONAME) {
		CRYPTONAME = cRYPTONAME;
	}


	public int getLTP() {
		return LTP;
	}


	public void setLTP(int lTP) {
		LTP = lTP;
	}


	public String getUSERNAME() {
		return USERNAME;
	}


	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}


	public int getCRYPTID() {
		return CRYPTID;
	}


	public void setCRYPTID(int cRYPTID) {
		CRYPTID = cRYPTID;
	}


	public CryptoCurrencyBean(String cRYPTONAME, int lTP, String uSERNAME, int uid, int cRYPTID) {
		super();
		CRYPTONAME = cRYPTONAME;
		LTP = lTP;
		USERNAME = uSERNAME;
		this.uid = uid;
		CRYPTID = cRYPTID;
	}


	public CryptoCurrencyBean() {
		super();
	}
	
	

}
