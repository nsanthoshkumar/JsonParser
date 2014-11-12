package com.cmpe239.sjsu.parser;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.codehaus.*;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;


public class ParseJson {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws JsonMappingException 
	 * @throws JsonParseException 
	 */
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		ObjectMapper mapper=new ObjectMapper();
		Reviews review=new Reviews();
		JsonParser jp=mapper.getJsonFactory().createJsonParser("/home/santosh/Desktop/ItemRecommender/data/yelp_academic_dataset_review_daate.json");
		BufferedReader br =new BufferedReader(new FileReader("/home/santosh/Desktop/ItemRecommender/data/yelp_academic_dataset_review_daate.json"));
		String line=null;
		int count=0;
		while((line=br.readLine())!=null && count<=10)
		{
			review=mapper.readValue(line,Reviews.class);
			System.out.println(review.votes+" "+review.business_id+"reviews "+review.text);
			count++;
		}
		
		//
		//org.codehaus.jackson.map.ObjectMapper 

	}

}
