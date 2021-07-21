package jsonPayload;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FetchJson {

	public static String AddPlace() {
		return "{\r\n" + 
				"  \"location\": {\r\n" + 
				"    \"lat\": -38.383494,\r\n" + 
				"    \"lng\": 33.427362\r\n" + 
				"  },\r\n" + 
				"  \"accuracy\": 50,\r\n" + 
				"  \"name\": \"Rahul Shetty Academy\",\r\n" + 
				"  \"phone_number\": \"(+91) 983 893 3937\",\r\n" + 
				"  \"address\": \"29, side layout, cohen 09\",\r\n" + 
				"  \"types\": [\r\n" + 
				"    \"shoe park\",\r\n" + 
				"    \"shop\"\r\n" + 
				"  ],\r\n" + 
				"  \"website\": \"http://rahulshettyacademy.com\",\r\n" + 
				"  \"language\": \"French-IN\"\r\n" + 
				"}\r\n" + 
				"";
	}
	
	public static String CoursePrice()
	{
		
		return "{\r\n" + 
				"  \"dashboard\": {\r\n" + 
				"    \"purchaseAmount\": 1162,\r\n" + 
				"    \"website\": \"rahulshettyacademy.com\"\r\n" + 
				"  },\r\n" + 
				"  \"courses\": [\r\n" + 
				"    {\r\n" + 
				"      \"title\": \"Selenium Python\",\r\n" + 
				"      \"price\": 50,\r\n" + 
				"      \"copies\": 6\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"title\": \"Cypress\",\r\n" + 
				"      \"price\": 40,\r\n" + 
				"      \"copies\": 4\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"title\": \"RPA\",\r\n" + 
				"      \"price\": 45,\r\n" + 
				"      \"copies\": 10\r\n" + 
				"    },\r\n" + 
				"     {\r\n" + 
				"      \"title\": \"Appium\",\r\n" + 
				"      \"price\": 36,\r\n" + 
				"      \"copies\": 7\r\n" + 
				"    }\r\n" + 
				"    \r\n" + 
				"    \r\n" + 
				"    \r\n" + 
				"  ]\r\n" + 
				"}\r\n" + 
				"";
		}
	
	public static String AddBook() {
		String payload =  "{\r\n"
				+ "\r\n"
				+ "\"name\":\"Learn Appium Automation with Java\",\r\n"
				+ "\"isbn\":\"bcd\",\r\n"
				+ "\"aisle\":\"227sdf\",\r\n"
				+ "\"author\":\"John foe\"\r\n"
				+ "}\r\n"
				+ "";
		return payload;
	}
	
	public static String GenerateStringFromResource(String path) throws IOException {
		//get JSON from a file instead
		
		return new String(Files.readAllBytes(Paths.get(path)));
	}
	
	  public static String strJson1() {
		  String s1 = "{\n"
		  		+ "    \"employee\":\n"
		  		+ "    {\n"
		  		+ "        \"id\": \"1212\",\n"
		  		+ "        \"fullName\": \"John Miles\",\n"
		  		+ "        \"age\": 34\n"
		  		+ "    }\n"
		  		+ "}";
		  return s1;
		  
	  }
	  
	  public static String strJson2() {
		  String s2 = "{   \r\n"
		  		+ "    \"employee\":\r\n"
		  		+ "    {\r\n"
		  		+ "        \"id\": \"1212\",\r\n"
		  		+ "        \"age\": 34,\r\n"
		  		+ "        \"fullName\": \"John Miles\"\r\n"
		  		+ "    }\r\n"
		  		+ "}";
		  return s2;		  
	  }
}
