package cj;

public abstract class Account {

	private int id;
	private String name;
	private double balance;
	public Account() {
		super();
	}
	public Account(int id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		System.out.println("Account created with initial balance : "+balance);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println(amount+" deposited, Available Balance = "+balance);
	}
	public void withdraw(double amount) {
		if(amount <= balance) {
			balance = balance - amount;
			System.out.println(amount+" withdrawn, Available Balance = "+balance);
		}
		else
			System.out.println("Insufficient balance, try with lesser amount");
	}
	public abstract double calculateInterest();
}
