package com.marketplace.insertscript;

import com.mongodb.client.MongoCollection; 
import com.mongodb.client.MongoDatabase; 

import org.bson.Document;

import com.marketplace.MarketPlace.Project.Project_percentage;
import com.mongodb.MongoClient; 
import com.mongodb.MongoCredential;  

public class InsertingDocument { 
   
   public static void main( String args[] ) {  
      
	   perc();
   }
   public static void perc()
   {
	   Project_percentage sb=new Project_percentage();
	   sb.setPercenatge(90);
	   sb.setProject_status("done");
	      MongoClient mongo = new MongoClient( "localhost" , 27017 ); 
	      MongoCredential credential; 
	      credential = MongoCredential.createCredential("sampleUser", "myDb", 
	         "password".toCharArray()); 
	      System.out.println("Connected to the database successfully");  
	      MongoDatabase database = mongo.getDatabase("Marketplace"); 
	      MongoCollection<Document> collection = database.getCollection("Projectpercentage"); 
	      System.out.println("Collection sampleCollection selected successfully");

	      Document document = new Document("Project_title", "Marketplace") 
	      .append("project_status", sb.getPercenatge())
	      .append("percenatge", sb.getProject_status()) ;
	       
	      collection.insertOne(document); 
	      System.out.println("Document inserted successfully");     
	   } 
	   
	   
   

}
