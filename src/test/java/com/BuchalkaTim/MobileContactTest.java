package com.BuchalkaTim;

import org.testng.annotations.Test;

public class MobileContactTest {
  @Test
  public void f() {
	  MobilePhone phone = new MobilePhone();
	  phone.showContacts();
	  phone.storeContact("Ram", "437877345");
	  phone.showContacts();
	  phone.storeContact("Khalid", "437866328");
	  phone.showContacts();
	  phone.queryContact("Khalid");
	  phone.queryContact("437");
	  phone.queryContact("kshama");
	  phone.storeContact("Khalid", "437866345");
	  phone.storeContact("Kshama", "437866328");
	  phone.storeContact("Kshama", "437866123");
	  phone.showContacts();
	  phone.modifyContact("Kshama", "457457688");
	  phone.showContacts();
	  phone.modifyContact("Khalid", "457457688");
	  phone.showContacts();
	  phone.modifyContact("Varun", "457457688");
	  phone.removeContact("Khalid");
	  phone.showContacts();
  }
}
