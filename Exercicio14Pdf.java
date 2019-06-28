package curso_udemy;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio14Pdf {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("informe o código do produto: ");
		int codigo = sc.nextInt();
		System.out.print("Informe a quantidade: ");
		int quantidade = sc.nextInt();
		double total;
		
		if (codigo == 1) {
			total = 4.00 * quantidade;
			System.out.printf("Total R$: %.2f", total);
		} else if (codigo == 2) {
			total = 4.50 * quantidade;
			System.out.printf("Total R$: %.2f", total);
		} else if (codigo == 3) {
			total = 5.00 * quantidade;
			System.out.printf("Total R$: %.2f", total);
		} else if (codigo == 4) {
			total = 2.00 * quantidade;
			System.out.printf("Total R$: %.2f", total);
		} else if (codigo == 5) {
			total = 1.50 * quantidade;
			System.out.printf("Total R$: %.2f", total);
		} else {
			System.out.println("Produto não encontrado.");
		}
		
		sc.close();
		
	}

}
