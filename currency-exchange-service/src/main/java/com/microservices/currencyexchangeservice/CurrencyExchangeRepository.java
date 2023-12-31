package com.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository 
	extends JpaRepository<CurrencyExchange,Long>{
	CurrencyExchange findByFrAndTo(String from,String to);
}
