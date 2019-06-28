package curso_udemy;

import java.util.Scanner;

public class Exercicio21Pdf {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int i;

		for (i = 1; 1 <= x && x >= i; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
				
			}
			
		}

		sc.close();

	}

}
