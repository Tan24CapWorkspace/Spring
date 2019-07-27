package com.cg.intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("currencyConverter")
public class CurrencyConverterImpl implements CurrencyConverter {
	
	public CurrencyConverterImpl() {
		System.out.println("CurrencyConverterImpl()");
	}
	
	@Autowired(required = true)
	private ExchangeService exchangeService;

	public ExchangeService getExchangeService() {
		System.out.println("getExchangeService()");		
		return exchangeService;
	}

	public void setExchangeService(ExchangeService exchangeService) {
		System.out.println("setExchangeService()");		
		this.exchangeService = exchangeService;
	}

	public double dollarsToRupees(double dollars) {
		System.out.println("dollarsToRupees()");		
		return dollars * exchangeService.getExchangeRate();
	}
};