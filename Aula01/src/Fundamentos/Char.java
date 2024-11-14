package Fundamentos;

import java.util.Scanner;

public class Char {
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		System.out.println("Digite uma letra: ");
		char letra = c.next().charAt(0);
		if (letra == 'F' || letra == 'f') {
			System.out.println("Feminino");
		}else if(letra == 'M' || letra == 'm') {
			System.out.println("Masculino");
		}
		else {
			System.out.println("Letra inválida");
		}
		
	}
}
