package curso_udemy;

import java.util.Scanner;

public class Exercicio9 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite tr�s n�meros inteiros: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a < b && b > c) {
			System.out.println("O maior n�mero digitado � " + b);
		} else if (a > b && a > c){
			System.out.println("O maior n�mero digitado � " + a);
		} else {
			System.out.println("O maior n�mero digitado � " + c);
		}
		
		sc.close();
		
	}

}
