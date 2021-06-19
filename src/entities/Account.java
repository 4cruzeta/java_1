package entities;

public class Account {
	
	private int number;
	private String holder;
	private double balance;
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	// public Account(int number, String holder, double balance) {
	//	this.number = number;	
	//	this.holder = holder;	*** Esse bloco foi alterado para o a seguir devido a 
	//	this.balance = balance;	*** regras de depósito. amount só muda com deposito ou retirada
	// }

	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	public int getNumber() {
		return number;
	}

	// public void setNumber(int number) { *** como o número da conta não pode ser modificado
	// 	this.number = number;			   *** Esse setter não será utilizado.	
	// }

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	// public void setBalance(double balance) {	*** Saldo da conta só pode ser alterado por saque
	//	this.balance = balance;					*** e depósito.
	// }
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}

}
