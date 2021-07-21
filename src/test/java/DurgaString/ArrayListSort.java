package DurgaString;

import java.util.*;

import org.testng.annotations.Test;

public class ArrayListSort {
  @Test
  public void f() {
	  List<Integer> l = new ArrayList<Integer>();
	  double i = 1.02;
	  Double j = 1.00;
	  System.out.println(j.compareTo(j));
	  System.out.println(i == j);
	  l.add(10);
	  l.add(0);
	  l.add(15);
	  l.add(20);
	  System.out.println("Before sorting : " + l);
	  Collections.sort(l);
	  System.out.println("after sorting : " + l);
	  Collections.sort(l, new MyComparator());
	  System.out.println("after custom sorting : " + l);
	  
	  
  }
  
  @Test
  public void fLambda() {
	  List<Integer> l = new ArrayList<Integer>();
	  l.add(10);
	  l.add(0);
	  l.add(15);
	  l.add(15);
	  l.add(20);
	  System.out.println("Before sorting : " + l);
	  Collections.sort(l);
	  System.out.println("after sorting : " + l);
	  Collections.sort(l, (o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
	  System.out.println("after custom sorting : " + l);
  }
  
  @Test
  public void fLambdaSet() {
	  //Set<Integer> l = new TreeSet<Integer>();
	  Set<Integer> l = new TreeSet<Integer>((o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
	  l.add(10);
	  l.add(0);
	  l.add(15);
	  l.add(15);
	  l.add(20);
	  System.out.println("Before sorting Set: " + l);
	  System.out.println("after sorting Set: " + l);
  }
  
  @Test
  public void fHashMap() {
  String str = "this is a sentence which is a requirement to test another requirement for duplicate values which is used to check Collections knowledge";
  String arr[] = str.split(" ");
  HashMap<String, Integer> l = new HashMap<String, Integer>();
  
  for(String sVal : arr) {
	  System.out.println(sVal);		  
	  if(l.containsKey(sVal)) {
		  //int iVal = l.get(sVal);
	  //System.out.println("Value for " + sVal + " is : " + iVal);
		  System.out.println(l.put(sVal, (l.get(sVal) + 1)));
	  }
	  else {
		  System.out.println(l.put(sVal, 1));
	  }
  }

  System.out.println("Hash map : " + l);
  }
}