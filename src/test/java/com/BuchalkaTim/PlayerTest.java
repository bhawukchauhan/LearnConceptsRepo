package com.BuchalkaTim;

import java.util.List;

import org.testng.annotations.Test;

import interfaceExcercise.ISaveable;
import interfaceExcercise.Monster;
import interfaceExcercise.Player;

public class PlayerTest {
  @Test
  public void f() {
	  ISaveable iSave = new Player("Tim", 20, 40);
	  List<String> arrList = null;
	  arrList = iSave.write();
	  iSave.read(arrList);
	  System.out.println(iSave.toString());
	  
	  iSave = new Monster("Khalid", 80, 90);
	  arrList = iSave.write();
	  iSave.read(arrList);
	  System.out.println(iSave.toString());
  }
}
