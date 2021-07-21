package RestAssuredRahulShetty;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import jsonPayload.FetchJson;

public class ComplexJsonParse {
  @Test
  public void f() {
	  JsonPath js = new JsonPath(FetchJson.CoursePrice());
	  //1. Print No of courses returned by API
	  int count = js.getInt("courses.size()");
	  System.out.println("count of courses : " + count);

	  //2.Print Purchase Amount
	  int purchaseAmount = js.getInt("dashboard.purchaseAmount");
	  System.out.println("purchase amount : " + purchaseAmount);
	  //print the json from String
	  //System.out.println(js.prettify());

	  //3. Print Title of the first course
	  System.out.println("Title of first course : " + js.getString("courses[0].title"));	  

	  //4. Print All course titles and their respective Prices
	  for(int i=0;i<count;i++) {
		  System.out.println("Title : " + js.getString("courses[" + i + "].title") + ", price : " + js.getString("courses[" + i + "].price"));
	  }
	  //5. Print no of copies sold by RPA Course
	  for(int i=0;i<count;i++) {
		  String courseTitle = js.getString("courses[" + i + "].title");
		  if(courseTitle.equalsIgnoreCase("RPA")) {
		  System.out.println("number of copies sold : " + js.getString("courses[" + i + "].copies"));
		  break;
		  }
	  }
	  //6. Verify if Sum of all Course prices matches with Purchase Amount
	  int sum=0;
	  for(int i=0;i<count;i++) {
		  int coursePrice = js.getInt("courses[" + i + "].price");
		  int copiesSold = js.getInt("courses[" + i + "].copies");
		  sum += (coursePrice * copiesSold);
	  }
	  System.out.println("sum : " + sum);
	  Assert.assertEquals(purchaseAmount, sum);
	  
	  System.out.println(js.getList("courses"));
	  List<Object> arrList = new ArrayList<>();
	  arrList = js.getList("courses");
	  for(Object l : arrList)
		  System.out.println(l);
  }
}
