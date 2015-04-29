package com.cmpe273.controller;


import java.util.ArrayList;
import java.util.List;

import com.cmpe273.database.DatabaseConnection;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/theshop/api/v1/")
public class ShoppingController {
    private static DatabaseConnection dbConnection = new DatabaseConnection();
    public MongoCollection<Document> collection;

    static{
        dbConnection.setDbConnection();
        // new ScheduledTasks();
    }
	@RequestMapping(value="getoffers/beaconid/{beaconId}/rss/{rss}",method = RequestMethod.GET)
	public ResponseEntity<List<Document>> getOffers(@PathVariable int beaconId,@PathVariable int rss){

        this.collection = dbConnection.getCollection("offers");
        List<Document> list = (List<Document>)this.collection.find(new Document()).into(new ArrayList<Document>());
        return new ResponseEntity<List<Document>>(list, HttpStatus.OK);
	}





}
