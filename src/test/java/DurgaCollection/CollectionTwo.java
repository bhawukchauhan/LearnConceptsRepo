package DurgaCollection;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;

import java.util.*;

import org.testng.annotations.Test;

public class CollectionTwo {
  @Test
  public void f() {
  List<Integer> arr1 = new ArrayList();
  arr1.add(1);
  arr1.add(2);
  List<Integer> arr2 = new ArrayList();
  arr2.add(3);
  arr2.add(4);
  
  arr1.addAll(arr2);
  for(int i : arr1)
	  System.out.println(arr1.get(i-1));
  System.out.println(arr1.toString());
  System.out.println("##############################");
  arr1.removeAll(arr2);
  System.out.println(arr1.toString());
  System.out.println("##############################");
  arr1.addAll(arr2);
  System.out.println(arr1.toString());
  List<Integer> arr3 = new ArrayList();
  arr3.add(3);
  arr3.add(2); 
  //arr3.add(5); //below method will return false
  System.out.println(arr1.containsAll(arr3));
  System.out.println("##############################");
  arr1.retainAll(arr2);
  System.out.println(arr1.toString());
	  
  }
}
