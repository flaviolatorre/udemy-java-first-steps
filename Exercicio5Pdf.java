package curso_udemy;

import java.util.Scanner;

public class Exercicio5Pdf {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		int a = sc.nextInt();
		System.out.println("Digite o valor de B: ");
		int b = sc.nextInt();
		System.out.println("Digite o valor de c: ");
		int c = sc.nextInt();
		System.out.println("Digite o valor de D: ");
		int d = sc.nextInt();
		int diferenca = a * b - c * d;
		
		System.out.println("A diferen�a � " + diferenca);
				
		sc.close();
	}

}
