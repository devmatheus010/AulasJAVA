package Fundamentos;

import  java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		Scanner notas = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		float nota1 = notas.nextFloat();
		System.out.println("Digite a segunda nota: ");
		float nota2 = notas.nextFloat();
		
		float media = (nota1 + nota2) /2;
		System.out.println("A média é: "+ media);
		
		if (media >=7) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
		
	}

}
