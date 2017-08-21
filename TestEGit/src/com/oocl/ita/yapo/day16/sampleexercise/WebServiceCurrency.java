package com.oocl.ita.yapo.day16.sampleexercise;

import net.webservicex.ConversionRate;
import net.webservicex.Currency;
import net.webservicex.CurrencyConvertor;
import net.webservicex.CurrencyConvertorSoap;

public class WebServiceCurrency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrencyConvertor currency = new CurrencyConvertor();
		CurrencyConvertorSoap currencyConverter = currency.getCurrencyConvertorSoap();
		Currency fcurr = Currency.USD;
		Currency tcurr = Currency.PHP;
		double rate  = currencyConverter.conversionRate(fcurr, tcurr);
		System.out.println(rate);

	}

}
