package com.cmpe239.sjsu.parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

public class Reviews {
	
	@JsonProperty("votes")
	HashMap<String,Integer> votes;
	@JsonProperty("user_id")
	String user_id;
	@JsonProperty("review_id")
	String review_id; 
	@JsonProperty("stars")
	int stars;
	@JsonProperty("daate")
	String daate; 
	@JsonProperty("text")
	String text; 
	@JsonProperty("type")
	String type; 
	@JsonProperty("business_id")
	String business_id;
}
