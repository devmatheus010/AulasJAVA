package Fundamentos;

import java.util.Scanner;

public class Dias {
	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int dia = numero.nextInt();
			if (dia == 1) {
				System.out.println("Domingo");
			}else if (dia == 2) {
				System.out.println("Segunda");
			}else if (dia == 3) {
				System.out.println("Terça-Feira");
			}else if (dia == 4) {
				System.out.println("Quarta-Feira");
			}else if (dia == 5) {
				System.out.println("Quinta-Feira");
			}else if (dia == 6) {
				System.out.println(dia == 7);
				System.out.println("Sábado");
			}else  {
				System.out.println("Número inválido, a semana possui 7 dias");
			}
			
			
	}
	
}
