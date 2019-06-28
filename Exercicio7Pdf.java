package curso_udemy;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7Pdf {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade e o valor da peça: ");
		int numPecas1 = sc.nextInt();
		double valorPeca1 = sc.nextDouble();
		
		System.out.print("Digite a quantidade e o valor da peça: ");
		int numPecas2 = sc.nextInt();
		double valorPeca2 = sc.nextDouble();
		
		double valorTotal = valorPeca1 * numPecas1 + valorPeca2 * numPecas2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);
		
		sc.close();
		
	}

}
