package com.example.spring.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.spring.model.CryptoCurrencyBean;

public interface CryptoRepository extends JpaRepository<CryptoCurrencyBean, Integer> {
  
  List<CryptoCurrencyBean> findAll();
  
//	@Query(value = Queries.CRYPTONAMES, nativeQuery = true)
//	List<CryptoCurrencyBean> AllCryptNames();

	@Query(value = Queries.AddCryptoData, nativeQuery = true)
	public void AddCryptData(CryptoCurrencyBean cryptoData);

	@Query(value = Queries.GetDataByUid, nativeQuery = true)
	List<CryptoCurrencyBean> getByUid(Integer uid);
}


