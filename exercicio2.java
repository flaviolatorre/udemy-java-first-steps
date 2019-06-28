package curso_udemy;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your full name: ");
		String name = sc.nextLine();
		System.out.print("How many bedrooms are there in your house: ");
		int bedrooms = sc.nextInt();
		System.out.print("Enter product price: ");
		double price = sc.nextDouble();
		System.out.println("Enter your last name, age and height(same line): ");
		String lastName = sc.next();
		int age = sc.nextInt();
		double height = sc.nextDouble();
		
		System.out.println(name);
		System.out.println(bedrooms);
		System.out.printf("%.2f%n", price);
		System.out.println(lastName);
		System.out.println(age);
		System.out.println(height);
		
		sc.close();
		
	}

}
