package curso_udemy;

import java.util.Scanner;

public class Exercicio27Pdf {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
				
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
			System.out.print(i * i + " ");
			System.out.println(i * i * i);
		}
		
		sc.close();
		
	}

}
