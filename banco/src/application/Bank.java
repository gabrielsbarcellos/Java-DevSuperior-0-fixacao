package application;

import java.util.Scanner;

import entities.Account;

public class Bank {

	public static void main(String[] args) {

		/*
		Exercício de fixação OO
		
		Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do 
		titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito 
		inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua 
		conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
		
		Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já 
		o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por 
		exemplo). 
		
		Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger 
		isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque 
		realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for 
		suficiente para realizar o saque e/ou pagar a taxa.
		
		Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não 
		informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre 
		mostrando os dados da conta após cada operação. 
		
			Enter account number: 8532
			Enter account holder: Alex Green
			Is there an initial deposit (y/n)? y
			Enter initial deposit value: 500.00
			Account data:
			Account 8532, Holder: Alex Green, Balance: $ 500.00
			Enter a deposit value: 200.00
			Updated account data:
			Account 8532, Holder: Alex Green, Balance: $ 700.00
			Enter a withdraw value: 300.00
			Updated account data:
			Account 8532, Holder: Alex Green, Balance: $ 395.00

		 */
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int number;
		double value = 0;
		char yn = 'x';
		Account conta;
		
		System.out.printf("Enter account number: ");
		number = sc.nextInt();
		
		System.out.println("Enter account holder: ");
		sc.nextLine();
		name = sc.nextLine();
		
		System.out.printf("Is therena initial deposit (y/n)? ");
		yn = sc.nextLine().charAt(0);	
		
		if(yn == 'y') {
			System.out.printf("Enter initial depositvalue: ");
			value = sc.nextDouble();
			conta = new Account(number,name,value);
		}
		else {
			conta = new Account(number,name);
		}
		
		System.out.println("\nAccount data: ");
		System.out.println(conta.toString());
		
		System.out.println("\nEnter a deposit value: ");
		value = sc.nextDouble();
		
		conta.deposit(value);
		
		System.out.println("\nUpdated account data: ");
		System.out.println(conta.toString());
		
		System.out.println("\nEnter a withdraw value: ");
		value = sc.nextDouble();
		
		conta.withdraw(value);
		
		System.out.println("\nUpdated account data: ");
		System.out.println(conta.toString());
		
		sc.close();

	}

}
