package com.cmpe273.controller;

import java.util.ArrayList;
import java.util.List;

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
		offers.append("beacon_id", beaconId);
		offers.append("rss", rss);
		List<String> offersList=new ArrayList<String>();
		if(rss>0&&rss<=40)
		{
			offersList.add("40% on Boost");
			offersList.add("20% on Horlicks");
			offersList.add("10% on Bournvita");
		}
		if(rss>40&&rss<=50)
		{
			offersList.add("2$ on Tomatoes");
			offersList.add("1$ on Brinjal");
			offersList.add("3$ on Potatoes");
		}
		if(rss>50&&rss<=60)
		{
			offersList.add("40% on Reebok");
			offersList.add("20% on Nike");
			offersList.add("10% on Puma");
		}
		if(rss>60&&rss<=80)
		{
			offersList.add("30$ on AT&T");
			offersList.add("50$ on TMobile");
			offersList.add("45$ on Verizon");
		}
		if(rss>80)
		{
			offersList.add("20% on HP");
			offersList.add("10% on DELL");
			offersList.add("70% on Acer");	
		}
		offers.append("offer", offersList);
		return offers;
	}

}
