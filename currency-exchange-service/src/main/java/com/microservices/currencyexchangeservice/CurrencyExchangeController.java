package com.microservices.currencyexchangeservice;


import java.math.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	private CurrencyExchangeRepository repository;
	
	
	@Autowired
	private Environment env;
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retrieveExchangeValue(@PathVariable String from,@PathVariable String to) {
		//CurrencyExchange currencyExchange = new CurrencyExchange((long) 1000,from,to,BigDecimal.valueOf(1000));
		CurrencyExchange currencyExchange = repository.findByFrAndTo(from, to);
		
		if(currencyExchange==null) {
			throw new RuntimeException("unableto find data for"+from+"to"+to);
		}
		
		String port = env.getProperty("local.server.port");
		currencyExchange.setEnvironment(port);
		return currencyExchange;
	}
}
