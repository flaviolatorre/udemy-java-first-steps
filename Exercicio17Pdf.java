package curso_udemy;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio17Pdf {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		double valorImposto;
		
		if (salario <= 2000.00) {
			System.out.println("Isento");
		} else if (salario > 2000.01 && salario <= 3000.00) {
			valorImposto = ((salario - 2000.00) * 8) / 100;
			System.out.println(valorImposto);
		} else if (salario > 3000.01 && salario <= 4500.00) {
			valorImposto = ((salario - 2000.00) * 18) / 100;
			System.out.println(valorImposto);
		} else {
			valorImposto = (salario * 28) / 100;
			System.out.println((valorImposto - 2000.00) * 28);
		}
		
		sc.close();
	}

}
