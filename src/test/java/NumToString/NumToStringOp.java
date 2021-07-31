package NumToString;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.Test;

import scala.Char;

public class NumToStringOp {
  @Test
  public void f() {
	  HashMap<Integer,String> n = new HashMap<Integer,String>();
	  n.put(0, "Zero");
	  n.put(1, "One");
	  n.put(2, "Two");
	  n.put(3, "Three");
	  n.put(4, "Four");
	  n.put(5, "Five");
	  n.put(6, "Six");
	  n.put(7, "Seven");
	  n.put(8, "Eight");
	  n.put(9, "Nine");
	  
      // using for-each loop for iteration over Map.entrySet()
      for (Entry<Integer, String> entry : n.entrySet())
          System.out.println("Key = " + entry.getKey() +  ", Value = " + entry.getValue());
      
      @SuppressWarnings("deprecation")
	Integer i = new Integer(125);
    int l = 125;
    char arr[] = String.valueOf(i).toCharArray();
    String s = "";
    for(char a : arr) {
    	System.out.println(a);
    	System.out.println(Integer.valueOf(Character.getNumericValue(a)));
    	System.out.println(n.get(Integer.valueOf(Character.getNumericValue(a))));
    	s = s + n.get(Integer.valueOf(Character.getNumericValue(a))) + " ";    	
    }
    
    System.out.println(s);
   }
  
  @Test
  public void mergeSort() {
  	//you have 2 sorted arrays
	//merge the 2 sorted arrays which should also be sorted
	//without using inbuilt functions
  }
}
