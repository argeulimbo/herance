package application;

import java.util.Random;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("--- >> G Bank - Bem vindo << ---");
		System.out.println(" === :::: Programa de abertura de conta :::: === ");
		System.out.println(" /// Digite 1 para abertura de conta corrente & 2 para conta comercial");
		int resposta = sc.nextInt();
		
		switch (resposta) {
		case 1: 
			System.out.print("Digite o nome do titular da conta: ");
			String holder = sc.next();
			System.out.print("Digite o saldo inicial da conta: ");
			double balance = sc.nextDouble();
			Random random = new Random();
			int number = random.nextInt();
			Account accountNormal = new Account(number, holder, balance);
			System.out.println();
			System.out.println("Conta PESSOA FÍSICA criada: ");
			System.out.println(accountNormal.toString());
			break;
			
		case 2:
			System.out.print("NOME TITULAR da conta: ");
			holder = sc.next();
			System.out.print("SALDO INICIAL da conta: ");
			balance = sc.nextDouble();
			System.out.print("RENDA MENSAL titular: ");
			double monthlyIncome = sc.nextDouble();
			if (monthlyIncome >= 2500.00) {
				double loanLimit = 1200.00;
				random = new Random();
				number = random.nextInt();			
				BusinessAccount accountBusiness = new BusinessAccount(number, holder, balance, loanLimit, monthlyIncome);
				System.out.println();
				System.out.println("Conta PESSOA JURÍDICA criada: ");
				System.out.println(accountBusiness.toString());
				System.out.println("[ Limite de empréstimo: " + accountBusiness.getLoanLimit() + " ]");
				System.out.println("[ Renda mensal - R$ " + accountBusiness.getMonthlyIncome() + " ]");
		        break;
				 
			} else {
				double loanLimit = 500.00;
				random = new Random();
				number = random.nextInt();			
				BusinessAccount accountBusiness = new BusinessAccount(number, holder, balance, loanLimit, monthlyIncome);
				System.out.println();
				System.out.println("Conta PESSOA JURÍDICA criada: ");
				System.out.println(accountBusiness.toString());
				System.out.println("[ Limite de empréstimo: " + accountBusiness.getLoanLimit() + " ]");
				System.out.println("[ Renda mensal - R$ " + accountBusiness.getMonthlyIncome() + " ]");
		        break;
			}			

		default: 
			System.out.println("Comando inválido");
		}
		sc.close();
	}
}
