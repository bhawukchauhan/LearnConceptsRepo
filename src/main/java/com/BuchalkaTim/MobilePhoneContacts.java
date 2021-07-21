package com.BuchalkaTim;

public class MobilePhoneContacts {
	private String name;
	private String phoneNumber;
	
	public MobilePhoneContacts(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		System.out.println("Contact name : " + this.name + " with number : " + this.phoneNumber + " added to contacts");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
