package curso_udemy;

import java.util.Scanner;

public class Exercicio9 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite três números inteiros: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a < b && b > c) {
			System.out.println("O maior número digitado é " + b);
		} else if (a > b && a > c){
			System.out.println("O maior número digitado é " + a);
		} else {
			System.out.println("O maior número digitado é " + c);
		}
		
		sc.close();
		
	}

}
