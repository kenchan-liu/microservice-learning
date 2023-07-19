package com.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class CurrencyExchange {
	@Id
	private Long id;
	
	private String fr;
	@Column(name="currency_to")
	private String to;
	private BigDecimal rate;
	
	private String environment;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return fr;
	}
	public void setFrom(String from) {
		this.fr = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getRate() {
		return rate;
	}
	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}
	public CurrencyExchange() {
		
	}
	public CurrencyExchange(Long id, String from, String to, BigDecimal rate) {
		super();
		this.id = id;
		this.fr = from;
		this.to = to;
		this.rate = rate;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	
}
