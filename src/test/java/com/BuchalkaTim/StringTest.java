package com.BuchalkaTim;

import org.testng.annotations.Test;

public class StringTest {
  @Test
  public void f() {

		String concatString = "concatString";
		StringBuffer appendBuffer = new StringBuffer("appendBuffer");
		StringBuilder appendBuilder = new StringBuilder("appendBuilder");
		long timerStarted;

		timerStarted = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
		    concatString = Integer.toString(i);
		}
		System.out.println("Time needed for 50000 String concatenations: " + (System.currentTimeMillis() - timerStarted) + "ms");

		timerStarted = System.currentTimeMillis();
		for (int j = 0; j < 50000; j++) {
		    appendBuffer = new StringBuffer(Integer.toString(j));
		}
		System.out.println("Time needed for 50000 StringBuffer appends: " + (System.currentTimeMillis() - timerStarted) + "ms");
		        
		timerStarted = System.currentTimeMillis();
		for (int h = 0; h < 50000; h++) {
		    appendBuilder = new StringBuilder(Integer.toString(h));
		}
		System.out.println("Time needed for 50000 StringBuilder appends: " + (System.currentTimeMillis() - timerStarted) + "ms");
		
  }
}
