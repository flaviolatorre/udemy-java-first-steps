package curso_udemy;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4Pdf {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o raio da circunfer�ncia: ");
		double raio = sc.nextDouble();
		double pi = 3.14159;
		double area = pi * (raio * raio);
		
		System.out.printf("A �rea da circunfer�ncia � %.4f", area);
		
		sc.close();
		
	}
	
}
