package com.marketplace.MarketPlace;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marketplace.MarketPlace.Project.mycards;
import com.marketplace.MarketPlace.Project.myproject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class controller {
	

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(method = RequestMethod.GET, value = "/pjoject")

	public List<myproject> getmycard() {
		List<myproject> listp = new ArrayList<myproject>();
		myproject sb = new myproject();
		sb.setProjetcname("Building Temporary Pedestrain");
		sb.setDate("12/2/2019");
		sb.setProjectdeatils("cableopeeatore");
		sb.setAddress("india");
		sb.setStatus("scucess");
		sb.setWorktitle("UnderMaintaince");

		myproject sb1 = new myproject();
		sb1.setProjetcname("Building Temporary Pedestrain");
		sb1.setDate("12/2/2019");
		sb1.setProjectdeatils("cableopeeatore");
		sb1.setAddress("india");
		sb1.setStatus("scucess");

		myproject sb5 = new myproject();
		sb5.setProjetcname("Building Temporary Pedestrain");
		sb5.setDate("12/2/2019");
		sb5.setProjectdeatils("cableopeeatore");
		sb5.setAddress("india");
		sb5.setStatus("scucess");

		myproject sb2 = new myproject();
		sb2.setProjetcname("Building Temporary Pedestrain");
		sb2.setDate("12/2/2019");
		sb2.setProjectdeatils("cableopeeatore");
		sb2.setAddress("india");
		sb2.setStatus("scucess");

		myproject sb3 = new myproject();
		sb3.setProjetcname("Building Temporary Pedestrain");
		sb3.setDate("12/2/2019");
		sb3.setProjectdeatils("cableopeeatore");
		sb3.setAddress("india");
		sb3.setStatus("scucess");

		myproject sb4 = new myproject();
		sb4.setProjetcname("Building Temporary Pedestrain");
		sb4.setDate("12/2/2019");
		sb4.setProjectdeatils("cableopeeatore");
		sb4.setAddress("india");
		sb4.setStatus("scucess");

		myproject sb6 = new myproject();
		sb6.setProjetcname("Building Temporary Pedestrain");
		sb6.setDate("12/2/2019");
		sb6.setProjectdeatils("cableopeeatore");
		sb6.setAddress("india");
		sb6.setStatus("scucess");

		listp.add(sb);
		listp.add(sb1);
		listp.add(sb2);
		listp.add(sb3);
		listp.add(sb4);
		listp.add(sb5);
		listp.add(sb6);

		return listp;

	}

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(method = RequestMethod.GET, value = "/mycards")

	public List<mycards> getprojectdetails() {
		List<mycards> listproject = new ArrayList<mycards>();
		mycards pj = new mycards();
		pj.setProkjectheading("Building Temporary Pedestrain");
		pj.setBiddate("12/02/2018");
		pj.setProjetctitle("cableopeeatore");
		pj.setWorktilte("Cale");
		pj.setBestprice(200);
		pj.setYourprice(7000);
		pj.setProjectstatus("under work");

		mycards pj1 = new mycards();
		pj1.setProkjectheading("Building Temporary Pedestrain");
		pj1.setBiddate("12/02/2018");
		pj1.setProjetctitle("cableopeeatore");
		pj1.setWorktilte("Cale");
		pj1.setBestprice(6000);
		pj1.setProjectstatus("under work");
		listproject.add(pj1);
		mycards pj2 = new mycards();
		pj2.setProkjectheading("Building Temporary Pedestrain");
		pj2.setBiddate("12/02/2018");
		pj2.setProjetctitle("cableopeeatore");
		pj2.setWorktilte("Cale");
		pj2.setBestprice(200);
		pj2.setProjectstatus("sucess");
		listproject.add(pj2);
		mycards pj3 = new mycards();
		pj3.setProkjectheading("Building Temporary Pedestrain");
		pj3.setBiddate("12/02/2018");
		pj3.setProjetctitle("cableopeeatore");
		pj3.setWorktilte("Cale");
		pj3.setBestprice(400);
		pj3.setProjectstatus("under work");
		listproject.add(pj3);
		mycards pj4 = new mycards();
		pj4.setProkjectheading("Building Temporary Pedestrain");
		pj4.setBiddate("12/02/2018");
		pj4.setProjetctitle("cableopeeatore");
		pj4.setWorktilte("Cale");
		pj4.setBestprice(200);
		pj4.setProjectstatus("under work");
		listproject.add(pj4);

		listproject.add(pj);
		return listproject;

	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(method = RequestMethod.GET, value = "/mycardmongodb")
	public List<Document>getlistcard()
	{
		MongoClient client = new MongoClient("localhost", 27017);
		MongoDatabase database = client.getDatabase("Marketplace");
		MongoCollection<Document> collection = database
				.getCollection("mycard");
		List<Document> documents = (List<Document>) collection.find().into(new ArrayList<Document>());
		
		return documents;
		
	}
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(method = RequestMethod.GET, value = "/myprojectdb")
	public List<Document>getlismyproject()
	{
		MongoClient client = new MongoClient("localhost", 27017);
		MongoDatabase database = client.getDatabase("Marketplace");
		MongoCollection<Document> collection = database
				.getCollection("myproject");
 
		List<Document> documents = (List<Document>) collection.find().into(
				new ArrayList<Document>());
		return documents;
		
	}
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(method = RequestMethod.GET, value = "/MyIndexpage")
	public List<Document>getMyindexpage()
	{
		MongoClient client = new MongoClient("localhost", 27017);
		MongoDatabase database = client.getDatabase("Marketplace");
		MongoCollection<Document> collection = database.getCollection("mydashboard");
 
		List<Document> documents = (List<Document>) collection.find().into(
				new ArrayList<Document>());
		return documents;
	}
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(method = RequestMethod.GET, value = "/percentage")
	public List<Document>percentage()
	{
		MongoClient client = new MongoClient("localhost", 27017);
		MongoDatabase database = client.getDatabase("Marketplace");
		MongoCollection<Document> collection = database
				.getCollection("Projectpercentage");
		List<Document> documents = (List<Document>) collection.find().into(
				new ArrayList<Document>());
		return documents;
		
	}
	
}
