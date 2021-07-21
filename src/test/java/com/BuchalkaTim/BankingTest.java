package com.BuchalkaTim;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.testng.annotations.Test;

import Banking.Bank;
import Banking.Branch;
import Banking.Customer;

public class BankingTest {
  @Test
  public void f() {
	  //Customer cust = new Customer("Ram", null);
	  Customer cust = new Customer("Ram", -2100.50);
	  /*
	  System.out.println(cust.getStrCustomerName());
	  cust.showTransactions();
	  cust.addTransaction(5020.50);
		for(Double var : cust.getArrListTransactions())
			System.out.println(String.format("%.2f", var));
		//cust.showTotalBalance();
		 
		
		Branch br = new Branch("Parabellum", cust);
		br.addCustomerstoBranch("Kshama", 6000.50);
		System.out.println("Branch name : " + br.getBranchName());
		System.out.println("Customers in branch : " + br.getBranchName() + " ###########");
		br.showCustomersInBranch();
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		br.addTransactionForCustomer("Ram", 750.30);
		br.addTransactionForCustomer("Rm", 750.30);
		br.addTransactionForCustomer("Kshama", 1750.30);
		br.showCustomersInBranch();
		*/
	  
		Bank bank = new Bank("Scotia", new Branch("Yonge", new Customer("Ram", 2100.50)));
		System.out.println("Bank name : " + bank.getName());
		//bank.showbranches();
		//bank.showbranchesandCustomers();
		bank.addBranch(new Branch("Front", new Customer("Kshama", 3100.90)));
		bank.showbranches();
		bank.addCustomerToBranch("Dund", "Terence", 1000.50);
		bank.addCustomerToBranch("Front", "Terence", 1000.50);
		bank.addCustomerToBranch("Front", "Jackson", 2000.50);
		bank.addCustomerToBranch("Yonge", "Justin", 3000.50);
		bank.addCustomerTransaction("Front", "Jackson", 6000.50);
		bank.addCustomerTransaction("Front", "Jackson", -600.50);
		bank.addCustomerTransaction("Front", "Jackson", 750.50);
		bank.addCustomerTransaction("Yonge", "Jackson", 6000.50);
		bank.addCustomerTransaction("Yonge", "Justin", 200.50);
		bank.addCustomerTransaction("Front", "Jackson", 220.50);
		bank.showbranches();
		bank.showbranchesandCustomers();
		
  }
}
