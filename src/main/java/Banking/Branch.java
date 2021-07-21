package Banking;

import java.util.ArrayList;

import com.BuchalkaTim.MobilePhoneContacts;

public class Branch {
	
private String branchName;
private ArrayList<Customer> arrListCustomers = new ArrayList<Customer>();

public Branch(String branchName, Customer objCustomer) {
	this.branchName = (branchName != null && !branchName.isBlank()) ? branchName : "The Continental";
	this.arrListCustomers.add(objCustomer);
}

public void addCustomerstoBranch(String strCustomerName, Double dblInitialTransactionAmount) {
	this.arrListCustomers.add(newCustomer(strCustomerName, dblInitialTransactionAmount));
}

public String getBranchName() {
	return branchName;
}

public ArrayList<Customer> getCustomersInBranch() {
	return arrListCustomers;
}

public void showCustomersInBranch() {
	System.out.println("printing customers and their transactions");
	for(Customer i : arrListCustomers) {		
		System.out.println("Customer name : " + i.getStrCustomerName());
		i.showTransactions();
		i.showTotalBalance();
	}
}

public void addTransactionForCustomer(String customerName, Double transactionAmount) {
	int custIndex = queryCustomer(customerName);
	if(custIndex >= 0) {
		arrListCustomers.get(custIndex).addTransaction(transactionAmount);
	}
	else
		System.out.println(customerName + " does not exist as our customer, cannot do transaction");
}

private Customer newCustomer(String strCustomerName, Double dblInitialTransactionAmount) {
	return new Customer(strCustomerName, dblInitialTransactionAmount);		
}

private int queryCustomer(String CustomerName) {
	//System.out.println("querying customers");
	int matchFoundAtPosition = -1;
	for (Customer listElement : arrListCustomers) {
		if (listElement.getStrCustomerName().equalsIgnoreCase(CustomerName) ) {
			matchFoundAtPosition = arrListCustomers.indexOf(listElement);
			//System.out.println("match found at position : " + matchFoundAtPosition);
			return matchFoundAtPosition;
		}
	}

	//if (matchFoundAtPosition < 0)
	//	System.out.println("No match found in Customers");
	
	return matchFoundAtPosition;
}
}
