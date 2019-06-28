package curso_udemy;

import java.util.Scanner;

public class Exercicio13Pdf {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicio = sc.nextInt();
		int horaFim = sc.nextInt();
		int duracao;
		
		if (horaInicio < horaFim) {
			duracao = horaFim - horaInicio;
		} else {
			duracao = 24 - horaInicio + horaFim;
		}
		
		System.out.println("O jogo durou " + duracao + " hora(s).");
		
		sc.close();
		
	}

}
