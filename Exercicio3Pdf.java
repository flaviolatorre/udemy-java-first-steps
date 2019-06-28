package curso_udemy;

import java.util.Scanner;

public class Exercicio3Pdf {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o valor de A: ");
		int a = sc.nextInt();
		System.out.print("Informe o valor de B: ");
		int b = sc.nextInt();
		int soma = a + b;
		
		System.out.println("A soma de A e B é " + soma);
		
		
		sc.close();
		
	}

}
