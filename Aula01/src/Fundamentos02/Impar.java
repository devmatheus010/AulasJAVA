package Fundamentos02;

import java.util.Scanner;

public class Impar {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero = entrada.nextInt();
		int i = 1;
		while (i <= numero) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
			i++;
		}
	}
}