package entities;

public class Account {

	private Integer number;
	private String holder;
	protected Double balance;
	
	//CONSTRUTORS
	public Account() {}
	public Account(int number, String holder, double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	
	//GETTERS & SETTERS
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	
	//METHODS
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	@Override
	public String toString() {
		return "[ Número da conta = " + number
				+ " "
				+ " | Titular: " + holder + " | Saldo: R$ " + balance + " ]";
	}
	
}
