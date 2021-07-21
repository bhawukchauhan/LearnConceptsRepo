package Banking;

import java.util.ArrayList;

public class Bank {

	private String name;
	private ArrayList<Branch> branches = new ArrayList<Branch>();

	public Bank(String name, Branch branch) {
		this.name = (name != null && !name.isBlank()) ? name : "Winston";
		this.branches.add(branch);
	}
	
	public String getName() {
		return name;
	}
	
	public void addBranch(Branch branch) {
		this.branches.add(branch);
	}
	
	public void showbranches() {
		int i = 1;
		System.out.println("Branch name -> ");
		for(Branch b : branches){
			System.out.println(i++ + ". " + b.getBranchName());
		}
	}
	
	public void showbranchesandCustomers() {
		for(Branch b : branches){
			System.out.println("Branch name -> " + b.getBranchName());
			b.showCustomersInBranch();
		}
	}
	
	public void addCustomerToBranch(String branchName, String customerName, Double firstTransaction) {
		int matchFoundAtIndex = queryBranch(branchName);
		if(matchFoundAtIndex >= 0 ) {
			branches.get(matchFoundAtIndex).addCustomerstoBranch(customerName, firstTransaction);
		}
		else {
			System.out.println(branchName + " - This branch does not exist");
		}
	}
	
	public void addCustomerTransaction(String branchName, String customerName, Double transactionAmount) {
		int matchFoundAtIndex = queryBranch(branchName);
		if(matchFoundAtIndex >= 0 ) {
			branches.get(matchFoundAtIndex).addTransactionForCustomer(customerName, transactionAmount);;
		}
		else {
			System.out.println(branchName + " - This branch does not exist");
		}
	}
	
	private int queryBranch(String branchName) {
		int matchFoundAtIndex = -1;
		for (Branch b : branches) {
			if (b.getBranchName().equalsIgnoreCase(branchName)) {
				matchFoundAtIndex = branches.indexOf(b);
				return matchFoundAtIndex;
			}
		}

		return matchFoundAtIndex;
	}
}
