package curso_udemy;

import java.util.Scanner;

public class Exercicio19Pdf {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite as coordenadas: ");
		int x = sc.nextInt();
		int y = sc.nextInt();

//		if (x > 0 && y > 0) {
//			System.out.println("primeiro");
//		} else if(x > 0 && y < 0) {
//			System.out.println("quarto");
//		} else if (x < 0 && y < 0) {
//			System.out.println("terceiro");
//		} else if (x < 0 && y > 0) {
//			System.out.println("segundo");
//		} else if (x == 0 || y == 0) {
//			System.out.println("");
//		}

		while (x != 0 || y != 0) {
						
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			} else if (x > 0 && y < 0) {
				System.out.println("quarto");
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			} else if (x < 0 && y > 0) {
				System.out.println("segundo");
			}
			
			x = sc.nextInt();
			y = sc.nextInt();
			
		}

		sc.close();

	}

}
