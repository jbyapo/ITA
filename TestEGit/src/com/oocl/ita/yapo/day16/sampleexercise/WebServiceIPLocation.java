package com.oocl.ita.yapo.day16.sampleexercise;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class WebServiceIPLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length !=1) {
			System.out.println("You need to pass in one IP address");
		} else {
			String ipAddress = args[0];
			GeoIPService ipService = new GeoIPService();
			GeoIPServiceSoap geoIPServiceSoap = ipService.getGeoIPServiceSoap();
			GeoIP geoIp = geoIPServiceSoap.getGeoIP(ipAddress);
			System.out.println(geoIp.getCountryName());
		}
	}

}
