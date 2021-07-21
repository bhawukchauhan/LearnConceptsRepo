package Banking;

import java.util.ArrayList;

public class Customer {

	private String strCustomerName = "";
	private ArrayList<Double> arrListTransactions = new ArrayList<Double>();
	
	public Customer(String strCustomerName, Double dblInitialTransactionAmount) {
		this.strCustomerName = (strCustomerName != null && !strCustomerName.isBlank()) ? strCustomerName : "John"; 
		//this.arrListTransactions.add(dblInitialTransactionAmount >= 0 ? dblInitialTransactionAmount : 0);
		//this.arrListTransactions.add(dblInitialTransactionAmount != null ? dblInitialTransactionAmount : 0);
		addTransaction(dblInitialTransactionAmount);
	}

	public void addTransaction(Double customerTransaction) {
		this.arrListTransactions.add(customerTransaction);
	}

	public String getStrCustomerName() {
		return strCustomerName;
	}

	public ArrayList<Double> getArrListTransactions() {
		return arrListTransactions;
	}
	
	public void showTransactions() {
		System.out.println(" ######### Transactions ########");
		for(Double var : arrListTransactions)
			System.out.println(String.format("%.2f", var));
		System.out.println(" ###############################");
	}
	
	public void showTotalBalance() {
		Double dblBalance = 0.0;
		for(Double var : arrListTransactions)
			dblBalance += var;			
		System.out.println("Customer " + this.strCustomerName + "'s total balance is : " + String.format("%.2f", dblBalance));
	}
	
}
