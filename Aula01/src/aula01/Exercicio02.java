package aula01;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Primeiro número: ");
		a = numero.nextInt();
		
		System.out.println("Segundo número: ");
		b = numero.nextInt();
		
		System.out.println("Terceiro número: ");
		c = numero.nextInt();
		
		if (a > b && a > c){
			System.out.println("A é o maior número");
		}else if (b > c){
			System.out.println("B é o maior número");
		}
		else {
			System.out.println("C é o maior");
		}
	
	}

}
