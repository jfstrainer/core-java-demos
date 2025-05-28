package cj;

public class SavingsAccount extends Account {

	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(int id, String name, double balance) {
		super(id, name, balance);	// calls Account(id, name, balance)
	}

	@Override
	public double calculateInterest() {
		double interest = (getBalance() * 3.5 * 90 ) / 365; 
		return interest;
	}

}
