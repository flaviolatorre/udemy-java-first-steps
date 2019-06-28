package curso_udemy;

import java.util.Scanner;

public class Exercicio11Pdf {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("Número par");
		} else {
			System.out.println("Número ímpar");
		}
		
		sc.close();
		
	}

}
