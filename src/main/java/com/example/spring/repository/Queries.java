package com.example.spring.repository;

public class Queries {
	
	public static final String CRYPTONAMES = "select CRYPTONAME, LTP from CRYPTOCURRENCY";
	
	public static final String AddCryptoData = "insert into cryptocurrency values (2, 'Litecoin', 84542, 'Sukesh')";
	
	public static final String GetDataByUid = "select * from CRYPTOCURRENCY where uid=:uid";

}
