package aula01;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		double resp = entrada.nextDouble();
		if (resp > 0) {
			System.out.println("Numero positivo");
		}
		else
			System.out.println("Número negativo");
		
	}

}
