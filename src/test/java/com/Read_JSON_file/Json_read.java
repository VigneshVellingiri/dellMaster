package com.Read_JSON_file;

import java.io.FileNotFoundException;
import java.io.FileReader;

import io.restassured.path.json.JsonPath;

public class Json_read  {
	
	public static void reader() throws FileNotFoundException {

	FileReader file = new FileReader("src/test/resources/json_file/post.json");
	
	JsonPath jpsth = new JsonPath(file);
	
	Object object = jpsth.get("features[0]");
	
	System.out.println(object);
	
	}
	
	public static void main(String[] args){
		try {
			reader();
		}
		
		catch(Exception e) {
			System.out.println();
			System.out.println("Thrown exception is: " + e);
		}
		
	}

}
