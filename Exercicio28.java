package curso_udemy;

import java.util.Scanner;

public class Exercicio28 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter N: ");
		int n = sc.nextInt();
		int x = 0;
		
		while(n <= 0) {
			System.out.println("N must be positive! Try again: " + n);
			n = sc.nextInt();
			
			}
		
		for(int i = 1; i <= n; i++) {
			System.out.print("Value #" + i + ": ");
			x = sc.nextInt();
			
		}
		
		System.out.println("Higher: " + x);
		
		sc.close();
		
	}

}
