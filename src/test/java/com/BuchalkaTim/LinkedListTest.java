package com.BuchalkaTim;

import java.sql.Time;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.testng.annotations.Test;

public class LinkedListTest {
  @Test
  public void f() {
	  /*
		List<String> aList = new ArrayList<String>();
		System.out.println(aList.size());
		aList.add("Front");
		System.out.println(aList.size());
		aList.add("Yonge");
		System.out.println(aList.size());
		aList.add(2, "w");
		System.out.println(aList.size());
		System.out.println(aList.toString());
		*/
	  
	    List gList = null;//generic List variable which can be assigned to any type of List and any data type of list
	    gList =new ArrayList<String>();
	    gList =new ArrayList<Double>();
	    gList =new LinkedList<Integer>();
	    
		List<String> aList = new LinkedList<String>();
		aList.add("Front");
		aList.add("Yonge");
		aList.add("Tecumseth");
		aList.add("Gladstone");
		aList.add("Secumseth");
		aList.add("Uecumseth");
		aList.add("Tbcumseth");
		Iterator<String> itr = aList.iterator();
		while(itr.hasNext()) {
			//System.out.println("aList : " + itr.next());
			System.out.println("aList : " + itr.next().compareTo("Tecumseth"));
		}
		
		System.out.println("Front exists in the list - " + aList.contains("Front"));
		System.out.println("Fron exists in the list - " + aList.contains("Fron"));
		System.out.println("Bremley exists in the list - " + aList.contains("Bremley"));
		System.out.println("Gladstone exists in the list - " + aList.contains("Gladstone"));
		List<String> bList = aList.subList(0, 2);
		System.out.println(bList.toString());
		System.out.println("Gladstone exists in the list - " + aList.containsAll(bList));
		
	      // displaying current date and time
	      Calendar cal = Calendar.getInstance();
	      SimpleDateFormat simpleformat = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:s");
	      System.out.println("Today's date = "+simpleformat.format(cal.getTime()));
	      // current time
	      Format f = new SimpleDateFormat("HH:mm:ss");
	      String strResult = f.format(new Date());
	      System.out.println("Time = "+strResult);
	      
	      LocalTime timeVar = LocalTime.parse("06:30");
	      LocalTime timeVar2 = LocalTime.parse("02:30");
	      System.out.println(timeVar);
	      System.out.println(timeVar2);
	      System.out.println(timeVar2.plusMinutes(40));
	      
	        Time sqlTime1 = Time.valueOf("18:45:20");
	        System.out.println("SqlTime1: " + sqlTime1);
	        
	        Time sqlTime2 = Time.valueOf(LocalTime.of(8, 15, 20, 1000));
	        System.out.println("SqlTime2: " + sqlTime2);
	      
  }
}
