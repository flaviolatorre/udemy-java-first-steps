package curso_udemy;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6Pdf {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter worker ID: ");
		int id = sc.nextInt();
		System.out.print("Enter worked hours: ");
		int horasTrabalhadas = sc.nextInt();
		System.out.print("Worked hour value: ");
		double valorHora = sc.nextDouble();
		double salario = valorHora * horasTrabalhadas;
		
		System.out.println("ID Number= " + id);
		System.out.printf("Salary= U$ %.2f", salario);
		
		sc.close();
		
	}

}
