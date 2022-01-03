package com.example.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.model.CryptoCurrencyBean;
import com.example.spring.repository.CryptoRepository;

@RestController
@RequestMapping("/api")
public class CryptoController {

	@Autowired
	CryptoRepository repository;
	
	@GetMapping("/allData")
	public List<CryptoCurrencyBean> GetAllData()
	{
		return repository.findAll();
	}
	
	@GetMapping("/getByUserName/{uid}")
	public List<CryptoCurrencyBean> GetByUserName(@PathVariable int uid)
	{
		return repository.getByUid(uid);
	}
	
	@PostMapping("/Add")
	public void AddCryptData(@RequestBody CryptoCurrencyBean cryptoData)
	{
		repository.save(cryptoData);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Integer id)
	{
		repository.deleteById(id);
	}
}
