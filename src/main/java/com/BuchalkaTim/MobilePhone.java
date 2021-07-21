package com.BuchalkaTim;

import java.util.ArrayList;

public class MobilePhone {

	private ArrayList<MobilePhoneContacts> contacts = new ArrayList<MobilePhoneContacts>();
	
	public void storeContact(String contactName, String mobileNumber) {
		if (queryContact(contactName) >= 0)
			System.out.println("Contact already exists with this name");
		else if (queryContact(mobileNumber) >= 0)
			System.out.println("Contact already exists with this mobile number");
		else
			contacts.add(new MobilePhoneContacts(contactName, mobileNumber));
	}
	
	public void modifyContact(String contactName, String updatePhoneNumber) {
		int matchFoundAtPosition = queryContact(contactName);
		int phoneNumberFoundAtPosition = queryContact(updatePhoneNumber);//to check if a contact already exists with this phone number
		if(matchFoundAtPosition >= 0) {
			if(phoneNumberFoundAtPosition < 0) {
			contacts.get(matchFoundAtPosition).setPhoneNumber(updatePhoneNumber);
			System.out.println("updated contact : " + contactName);
			System.out.println(contacts.get(matchFoundAtPosition).getName() + " : " + contacts.get(matchFoundAtPosition).getPhoneNumber());
			}
			else {
				System.out.println("Cannot update the contact as a contact already exists with same number");
				System.out.println(contacts.get(phoneNumberFoundAtPosition).getName() + " : " + contacts.get(phoneNumberFoundAtPosition).getPhoneNumber());
			}
		}
	}
	
	public void removeContact(String contactName) {
		int matchFoundAtPosition = queryContact(contactName);
		if(matchFoundAtPosition >= 0) {
			contacts.remove(matchFoundAtPosition);
			System.out.println("removed contact : " + contactName);
		}
	}
	
	public int queryContact(String queryParameter) {
		System.out.println("querying contacts");
		int matchFoundAtPosition = -1;
		for (MobilePhoneContacts listElement : contacts) {
			//if (listElement.getName().contains(queryParameter) || listElement.getPhoneNumber().contains(queryParameter)) {
			if (listElement.getName().equalsIgnoreCase(queryParameter) || listElement.getPhoneNumber().equalsIgnoreCase(queryParameter)) {
				matchFoundAtPosition = contacts.indexOf(listElement);
				System.out.println("match found at position : " + matchFoundAtPosition);
				System.out.println(listElement.getName() + " : " + listElement.getPhoneNumber());
				return matchFoundAtPosition;
			}
		}

		if (matchFoundAtPosition < 0)
			System.out.println("No match found in Contacts");
		
		return matchFoundAtPosition;
	}

	public void showContacts() {
		System.out.println("################### Contacts ####################");
		for (MobilePhoneContacts listElement : contacts) {
			System.out.println(listElement.getName() + " : " + listElement.getPhoneNumber());
		}
		System.out.println("#################################################");
	}
}
