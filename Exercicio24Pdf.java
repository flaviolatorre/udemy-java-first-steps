package curso_udemy;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio24Pdf {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
						
			if (b == 0) {
				System.out.println("divisão impossível");
			} else {
				double divisao = a / b;
				System.out.println(divisao);
			}
			
		}
		
		sc.close();
		
	}

}
