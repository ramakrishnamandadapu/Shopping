package com.cmpe273.controller;

import org.bson.Document;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/theshop/api/v1/")
public class ShoppingController {
	
	@RequestMapping(value="getoffers/beaconid/{beaconId}/rss/{rss}",method = RequestMethod.GET)
	public Document getOffers(@PathVariable int beaconId,@PathVariable int rss){
		Document offers=new Document();
		if(rss>0&&rss<=40)
		{
			
			offers.append("OffersSet", "1");
			offers.append("1", "40% on Boost");
			offers.append("2", "20% on Horlicks");
			offers.append("3", "10% on Bournvita");
		}
		if(rss>40&&rss<=50)
		{
			
			offers.append("OffersSet", "1");
			offers.append("1", "2$ on Tomatoes");
			offers.append("2", "1$ on Brinjal");
			offers.append("3", "3$ on Potatoes");
		}
		if(rss>50&&rss<=60)
		{
			
			offers.append("OffersSet", "1");
			offers.append("1", "40% on Reebok");
			offers.append("2", "20% on Nike");
			offers.append("3", "10% on Puma");
		}
		if(rss>60&&rss<=80)
		{
			
			offers.append("OffersSet", "1");
			offers.append("1", "30$ on AT&T");
			offers.append("2", "50$ on TMobile");
			offers.append("3", "45$ on Verizon");
		}
		if(rss>80)
		{
			
			offers.append("OffersSet", "1");
			offers.append("1", "20% on HP");
			offers.append("2", "10% on DELL");
			offers.append("3", "70% on Acer");
		}
		return offers;
	}

}
