package exercicioExceptionQ1;

import java.util.InputMismatchException;

public class ContaBancaria {
private double saldo;
private String conta;


public ContaBancaria(double saldo, String conta) {
	super();
	this.saldo = saldo;
	this.conta = conta;
}

public void deposit(double valor) throws InputMismatchException{
	if(valor <= 0) {
		throw new InputMismatchException("valor de depósito inválido");
	}
	 saldo += valor;
	
}

public void withdraw(double valor) throws SaldoInsuficienteException{
	if(valor > saldo) {
		throw new SaldoInsuficienteException("Valor de saque excede o valor de saldo. ");
	}
	saldo -= valor;
}

public boolean validarSaldoDisponivel(double valor) {
	boolean valido = true;
	try {
		withdraw(valor);
	}catch (SaldoInsuficienteException e) {
		System.out.println("O valor informado está fora dos limites do saldo.");
		valido = false; 
	}
	return valido;
}

public double getSaldo() {
	return saldo;
}

public void setSaldo(double saldo) {
	this.saldo = saldo;
}

public String getConta() {
	return conta;
}

public void setConta(String conta) {
	this.conta = conta;
}





}
