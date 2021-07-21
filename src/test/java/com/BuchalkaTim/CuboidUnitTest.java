package com.BuchalkaTim;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(testListeners.ListenerTestNg.class)	
public class CuboidUnitTest {	

  @Test
  public void f1() {
	  System.out.println("in test method f1");
	  SoftAssert softassert = new SoftAssert();
	  System.out.println("This is method f1");
	  
	  Rectangle rectangle = new Rectangle(5, 10);
	  //var rectangle = new Rectangle(5, 10);
	  System.out.println("rectangle.width= " + rectangle.getWidth());
	  //Assert.assertEquals(rectangle.getWidth(), 5.0);
      //Assert.assertEquals("rectangle.width= ", rectangle.getWidth(), 6.0, 0.0);
	  //softassert.assertEquals(rectangle.getWidth(), 6.0, 0.0);
	  softassert.assertEquals(rectangle.getWidth(), 5.0, 0.0, "rectangle.width= ");
	  System.out.println("rectangle.length= " + rectangle.getLength());
	  softassert.assertEquals(rectangle.getLength(), 10.0, 0.0, "rectangle.length= ");
	  System.out.println("rectangle.area= " + rectangle.getArea());
	  softassert.assertEquals(rectangle.getArea(), 50.0, 0.0, "rectangle.area= ");
	  
	  /*
	  Cuboid cuboid = new Cuboid(5,10,5);
	  System.out.println("cuboid.width= " + cuboid.getWidth());
	  softassert.assertEquals(cuboid.getWidth(), 5.0, 0.0, "cuboid.width= ");
	  System.out.println("cuboid.length= " + cuboid.getLength());
	  softassert.assertEquals(cuboid.getLength(), 10.0, 0.0, "cuboid.length= ");
	  System.out.println("cuboid.area= " + cuboid.getArea());
	  softassert.assertEquals(cuboid.getArea(), 50.0, 0.0, "cuboid.area= ");
	  System.out.println("cuboid.height= " + cuboid.getHeight());
	  softassert.assertEquals(cuboid.getHeight(), 5.0, 0.0, "cuboid.height= ");
	  System.out.println("cuboid.volume= " + cuboid.getVolume());
	  softassert.assertEquals(cuboid.getVolume(), 250.0, 0.0, "cuboid.volume= ");
	  */
	  try {
	  softassert.assertAll();
	  }
	  catch(Exception e) {
		  System.out.println("Printing excpetion ###################################");
		  System.out.println(e.getMessage());
		  e.printStackTrace();
	  }
	  softassert = null;
  }
  
  @Test
  public void f2() {
	  SoftAssert softassert = new SoftAssert();	  
	  /*
	  Rectangle rectangle = new Rectangle(5, 10);
	  System.out.println("rectangle.width= " + rectangle.getWidth());
	  //Assert.assertEquals(rectangle.getWidth(), 5.0);
      //Assert.assertEquals("rectangle.width= ", rectangle.getWidth(), 6.0, 0.0);
	  //softassert.assertEquals(rectangle.getWidth(), 6.0, 0.0);
	  softassert.assertEquals(rectangle.getWidth(), 5.0, 0.0, "rectangle.width= ");
	  System.out.println("rectangle.length= " + rectangle.getLength());
	  softassert.assertEquals(rectangle.getLength(), 10.0, 0.0, "rectangle.length= ");
	  System.out.println("rectangle.area= " + rectangle.getArea());
	  softassert.assertEquals(rectangle.getArea(), 50.0, 0.0, "rectangle.area= ");
	  */
	  
	  Cuboid cuboid = new Cuboid(5,10,5);
	  System.out.println("cuboid.width= " + cuboid.getWidth());
	  softassert.assertEquals(cuboid.getWidth(), 5.0, 0.0, "cuboid.width= ");
	  System.out.println("cuboid.length= " + cuboid.getLength());
	  softassert.assertEquals(cuboid.getLength(), 10.0, 0.0, "cuboid.length= ");
	  System.out.println("cuboid.area= " + cuboid.getArea());
	  softassert.assertEquals(cuboid.getArea(), 50.0, 0.0, "cuboid.area= ");
	  System.out.println("cuboid.height= " + cuboid.getHeight());
	  softassert.assertEquals(cuboid.getHeight(), 5.0, 0.0, "cuboid.height= ");
	  System.out.println("cuboid.volume= " + cuboid.getVolume());
	  softassert.assertEquals(cuboid.getVolume(), 250.0, 0.0, "cuboid.volume= ");
	  
	  softassert.assertAll();
  }
}
