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
			System.out.print("Digite o nome do titular da conta: ");
			holder = sc.next();
			System.out.print("Digite o saldo inicial da conta: ");
			balance = sc.nextDouble();
			random = new Random();
			number = random.nextInt();
			double loanLimit = 0;
			BusinessAccount accountBusiness = new BusinessAccount(number, holder, balance, loanLimit);
			System.out.println();
			System.out.println("Conta PESSOA JURÍDICA criada: ");
			System.out.println(accountBusiness.toString());
	        break;
	        
		default: 
			System.out.println("Comando inválido");
		}
		sc.close();
	}
}
