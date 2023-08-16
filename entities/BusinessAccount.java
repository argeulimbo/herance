package entities;

public class BusinessAccount extends Account {

	private Double loanLimit;
	private Double monthlyIncome;

	// CONSTRUCTORS
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(int number, String holder, double balance, double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public BusinessAccount(int number, String holder, double balance, double loanLimit, double monthlyIncome) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
		this.monthlyIncome = monthlyIncome;
	}

	
	// METHODS
	public void loan(double amount) {
		if (amount <= this.loanLimit) {
			balance += amount - 10.0;
		} else {
			System.out.println();
			System.out.println("[ Operação Cancelada ]");
			System.out.println();
			System.out.println("[ LIMITE DE EMPRÉSTIMO EXCEDIDO ]");
			System.out.println();
			System.out.println("> Entre em contato com a nossa central para solicitar um aumento no limite <");
		}
	}

	// GETTER LOAN LIMIT & MONTHLY INCOME
	public Double getLoanLimit() {
		return loanLimit;
	}

	public Double getMonthlyIncome() {
		return monthlyIncome;
	}
}
