package cj;

public class AccountMain {

	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount(101, "Mike", 5000);
		System.out.println("Available Balance : "+sa.getBalance());
		sa.deposit(1000);
		sa.withdraw(4000);
		System.out.print("Interest : "+sa.calculateInterest());
	}

}
