package com.oocl.ita.yapo.day16.sampleexercise;

import net.webservicex.TranslateService;
import net.webservicex.TranslateServiceSoap;

public class WebServiceTranslation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		if(args.length !=1) {
//			System.out.println("You need to pass in one text");
//		} else {
//			String text = args[0];
			TranslateService translate = new TranslateService();
			TranslateServiceSoap translateSoap = translate.getTranslateServiceSoap();
			String translated = translateSoap.translate("EnglishTOJapanese", "Love");		
			System.out.println(translated);
//		}
	}

}
