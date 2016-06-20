package edu.GriffithICT.HumanSensor.MongoQuery;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Main {

	public static MongoClient mongoClient;
	public static MongoDatabase database;
	
	public static void main(String[] args) {
		
		mongoClient = new MongoClient( "localhost" , 27017 );
		
		database = mongoClient.getDatabase("twitter");
		
		MongoCollection<Document> collection = database.getCollection("test");
	}
	
}
