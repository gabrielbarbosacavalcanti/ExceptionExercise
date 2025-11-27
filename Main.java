package exercicioExceptionQ1;

import java.util.InputMismatchException;

public class Main {
	public static void main(String[] args) {
		
		ContaBancaria c = new ContaBancaria(0,"34245");
		try {
			c.deposit(-8);
		}catch (InputMismatchException e) {
			System.out.println("Erro : " +e.getMessage());
		}
		
	}
}
