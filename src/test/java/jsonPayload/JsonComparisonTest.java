package jsonPayload;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.path.json.JsonPath;

public class JsonComparisonTest {
  @Test
  public void f() {
	  JsonPath js = new JsonPath(FetchJson.strJson1());
	  String value = js.getString("employee.fullName");
	  System.out.println("fullName : " + value);
	  JsonPath js2 = new JsonPath(FetchJson.strJson2());
	  
	  ObjectMapper mapper = new ObjectMapper();
	  try {
		Assert.assertEquals(mapper.readTree(FetchJson.strJson1()), mapper.readTree(FetchJson.strJson2()));
	} catch (JsonMappingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (JsonProcessingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}
