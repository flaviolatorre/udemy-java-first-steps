package curso_udemy;

import java.util.Scanner;

public class Exercicio10Pdf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int number = sc.nextInt();
		
		if (number < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("POSITIVO");
		}
		
		sc.close();
		
	}
	
}
