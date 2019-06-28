package curso_udemy;

import java.util.Scanner;

public class Exercicio15Pdf {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número:");
		double numero = sc.nextDouble();
		
		if (numero <= 25) {
			System.out.println("Intervalo [0, 25]");
		} else if (numero == 25 || numero <= 50) {
			System.out.println("Intervalo [25.01, 50]");
		} else if (numero == 50 || numero <= 75) {
			System.out.println("Intervalo [50.01, 75]");
		} else if (numero == 75 || numero <= 100){
			System.out.println("Intervalo [75.01, 100]");
		} else {
			System.out.println("Fora do intervalo.");
		}
		
		sc.close();
	}

}
