package RestAssuredRahulShetty;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import jsonPayload.FetchJson;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class RestBasics {
	public void fwithJsonInBody() {
		// validate if Add Place API is working as expected
		// Add place-> Update Place with New Address -> Get Place to validate if New
		// address is present in response

		// given - all input details
		// when - Submit the API -resource,http method
		// Then - validate the response
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body("{\r\n" + 
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
						"")
				.when().post("maps/api/place/add/json")
				.then().log().all()
				.assertThat().statusCode(200).body("scope",equalTo("APP"));

	}
	
	@Test
	public void f() {
		// validate if Add Place API is working as expected
		// Add place-> Update Place with New Address -> Get Place to validate if New
		// address is present in response

		// given - all input details
		// when - Submit the API -resource,http method
		// Then - validate the response
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body(FetchJson.AddPlace())
				.when().post("maps/api/place/add/json")
				.then().log().all()
				.assertThat().statusCode(200).body("scope",equalTo("APP")).extract().response().asString();
		
		System.out.println("########################################################################################");
		System.out.println(response);
		
		JsonPath js = new JsonPath(response);//for parsing Json
		System.out.println(js.getString("scope"));
		String placeId=js.getString("place_id");
		
		System.out.println(placeId);
		
		//Update Place
		String newAddress = "Summer Walk, Africa";
		
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body("{\r\n" + 
				"\"place_id\":\""+placeId+"\",\r\n" + 
				"\"address\":\""+newAddress+"\",\r\n" + 
				"\"key\":\"qaclick123\"\r\n" + 
				"}").
		when().put("maps/api/place/update/json")
		.then().assertThat().log().all().statusCode(200).body("msg", equalTo("Address successfully updated"));
		
		//Get Place
		
	String getPlaceResponse=	given().log().all().queryParam("key", "qaclick123")
		.queryParam("place_id",placeId)
		.when().get("maps/api/place/get/json")
		.then().assertThat().log().all().statusCode(200).extract().response().asString();
	/*
	JsonPath js1=ReUsableMethods.rawToJson(getPlaceResponse);
	String actualAddress =js1.getString("address");
	System.out.println(actualAddress);
	Assert.assertEquals(actualAddress, "Pacific ocean");
	*/
	JsonPath js1=new JsonPath(getPlaceResponse);
	String actualAddress =js1.getString("address");
	System.out.println(actualAddress);
	//Assert.assertEquals(actualAddress, "Pacific ocean");
	Assert.assertEquals(actualAddress, newAddress);
	}
}
