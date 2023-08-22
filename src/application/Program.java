package application;

import java.util.Random;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("--- G Bank - Bem vindo ---");
		System.out.println(" :::: Programa de abertura de conta :::: ");
		System.out.println(" > Digite 1 para abertura de conta corrente & 2 para conta comercial < ");
		int resposta = sc.nextInt();

		switch (resposta) {

		// CASE USER SELECT FOR ACCOUNT NORMAL
		case 1:
			System.out.print("| NOME TITULAR da conta: ");
			String holder = sc.next();
			System.out.print("| SALDO INICIAL da conta: ");
			double balance = sc.nextDouble();
			Random random = new Random();
			int number = random.nextInt();
			Account accountNormal = new Account(number, holder, balance);
			System.out.println();
			System.out.println("| Conta PESSOA FÍSICA criada: ");
			System.out.println(accountNormal.toString());
			System.out.println();

			System.out.println("| Deseja efetuar um saque ou depósito? (s/n)");
			String respostaSaque = sc.next();
			// EXECUTION OPERATION
			if (respostaSaque.toLowerCase().charAt(0) == 's') {
				System.out.print("| 1 - SAQUE / 2 - DEPÓSITO : ");
				int operation = sc.nextInt();
				switch (operation) {
				// WITHDRAW
				case 1:
					System.out.println("| Saldo atual: " + accountNormal.getBalance());
					System.out.print("| Valor para saque: ");
					double amount = sc.nextDouble();
					System.out.println();
					if (amount > accountNormal.getBalance()) {
						System.out.println("| Saldo infuciente.");
					} else {
						accountNormal.withdraw(amount);
						System.out.println("| Saldo atualizado: ->  " + accountNormal.getBalance());
					}
					break;
				// DEPOSIT
				case 2:
					System.out.println("| Saldo atual: R$ " + accountNormal.getBalance());
					System.out.print("| Valor para depósito: R$ ");
					amount = sc.nextDouble();
					System.out.println();
					accountNormal.deposit(amount);
					System.out.println("| Saldo atualizado: R$ " + accountNormal.getBalance());
					break;

				default:
					System.out.println("[ Fim da execução ]");
					break;
				}

			} else {
				System.out.println("[ Fim da execução ]");
				break;
			}
		break;

			// CASE USER SELECT OPTION FOR ACCOUNT BUSINESS
		case 2:
			System.out.print("| NOME TITULAR da conta: ");
			holder = sc.next();
			System.out.print("| SALDO INICIAL da conta: ");
			balance = sc.nextDouble();
			System.out.print("| RENDA MENSAL titular: ");
			double monthlyIncome = sc.nextDouble();
			double loanLimit = 0;
			String saqueDeposito = null;

			if (monthlyIncome >= 2500.00) {
				loanLimit = 1200.00;
				random = new Random();
				number = random.nextInt();
				BusinessAccount accountBusiness = new BusinessAccount(number, holder, balance, loanLimit,
						monthlyIncome);
				System.out.println();
				System.out.println("| Conta PESSOA JURÍDICA criada: ");
				System.out.println(accountBusiness.toString());
				System.out.println("[ Limite de empréstimo: " + accountBusiness.getLoanLimit() + " ]");
				System.out.println("[ Renda mensal - R$ " + accountBusiness.getMonthlyIncome() + " ]");
				System.out.println();
				System.out.println("| Deseja efetuar um saque ou depósito? (s/n)");
				saqueDeposito = sc.next();

				// EXECUTION WITHDRAW OR DEPOSIT OR LOAN
				if (saqueDeposito.toLowerCase().charAt(0) == 's') {
					System.out.print("| 1 - SAQUE / 2 - DEPÓSITO / 3 - EMPRÉSTIMO : ");
					int operacao = sc.nextInt();
					System.out.println();

					switch (operacao) {
					// FIRST BLOCK CASE ONE - WITHDRAW
					case 1:
						System.out.println("| Saldo atual: " + accountBusiness.getBalance());
						System.out.print("| Valor para saque: ");
						double amount = sc.nextDouble();
						System.out.println();
						if (amount > accountBusiness.getBalance()) {
							System.out.println("| Saldo infuciente."); // VALIDATION FOR BALANCE IN ACCOUNT
						} else {
							accountBusiness.withdraw(amount);
							System.out.println("| Saldo atualizado: ->  " + accountBusiness.getBalance());
						}
						break;

					// SECOND BLOCK CASE TWO - DEPOSIT
					case 2:
						System.out.println("| Saldo atual: " + accountBusiness.getBalance());
						System.out.print("| Valor para depósito: ");
						amount = sc.nextDouble();
						accountBusiness.deposit(amount);
						System.out.println();
						System.out.println("| Saldo atualizado: -> R$ " + accountBusiness.getBalance());
						break;

					// THIRD BLOCK CASE THREE - LOAN
					case 3:
						System.out.println("| Saldo atual: " + accountBusiness.getBalance());
						System.out.println("| Valor disponível para empréstimo: " + accountBusiness.getLoanLimit());
						System.out.print("| VALOR DO EMPRÉSTIMO: ");
						amount = sc.nextDouble();
						accountBusiness.loan(amount);

						System.out.println("[ Saldo atual: " + accountBusiness.getBalance() + " ]");
						break;

					default:
						System.out.println("--- Fim da execução! ---");
					}

				} else {

					System.out.println("Teste");
				}

			} else {

				loanLimit = 500.00;
				random = new Random();
				number = random.nextInt();
				BusinessAccount accountBusiness = new BusinessAccount(number, holder, balance, loanLimit,
						monthlyIncome);
				System.out.println();
				System.out.println("| Conta PESSOA JURÍDICA criada: ");
				System.out.println(accountBusiness.toString());
				System.out.println("[ Limite de empréstimo: " + accountBusiness.getLoanLimit() + " ]");
				System.out.println("[ Renda mensal - R$ " + accountBusiness.getMonthlyIncome() + " ]");
				System.out.println();
				System.out.println("| Deseja efetuar um saque ou depósito? (s/n)");
				saqueDeposito = sc.next();

				// EXECUTION WITHDRAW OR DEPOSIT OR LOAN
				if (saqueDeposito.toLowerCase().charAt(0) == 's') {
					System.out.print("| 1 - SAQUE / 2 - DEPÓSITO / 3 - EMPRÉSTIMO : ");
					int operacao = sc.nextInt();
					System.out.println();
					switch (operacao) {

					// FIRST BLOCK CASE ONE - WITHDRAW
					case 1:
						System.out.println("| Saldo atual: " + accountBusiness.getBalance());
						System.out.print("| Valor para saque: ");
						double amount = sc.nextDouble();
						System.out.println();
						if (amount > accountBusiness.getBalance()) {
							System.out.println("| Saldo infuciente."); // VALIDATION FOR BALANCE IN ACCOUNT
						} else {
							accountBusiness.withdraw(amount);
							System.out.println("| Saldo atualizado: ->  " + accountBusiness.getBalance());
						}
						break;

					// SECOND BLOCK CASE TWO - DEPOSIT
					case 2:
						System.out.println("| Saldo atual: " + accountBusiness.getBalance());
						System.out.print("| Valor para depósito: ");
						amount = sc.nextDouble();
						accountBusiness.deposit(amount);
						System.out.println();
						System.out.println("| Saldo atualizado: -> R$ " + accountBusiness.getBalance());
						break;

					// THIRD BLOCK CASE THREE - LOAN
					case 3:
						System.out.println("| Saldo atual: " + accountBusiness.getBalance());
						System.out.println("| Valor disponível para empréstimo: " + accountBusiness.getLoanLimit());
						System.out.print("| VALOR DO EMPRÉSTIMO: ");
						amount = sc.nextDouble();
						accountBusiness.loan(amount);

						System.out.println("[ Saldo atual: " + accountBusiness.getBalance() + " ]");
						break;

					default:
						System.out.println("--- Fim da execução! ---");
					}

				}

			}
		}
		sc.close();
	}
}
