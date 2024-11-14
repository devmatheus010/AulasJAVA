package Fundamentos;

import java.util.Scanner;

public class Perguntas {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int cont = 0;

		System.out.print("Telefonou para a vítima? ");
		char resp = entrada.next().charAt(0);
		if (resp == 's' || resp == 'S') {
			cont += 1;
		}
		System.out.print("Esteve no local do crime?");
		resp = entrada.next().charAt(0);
		if (resp == 's' || resp == 'S') {
			cont += 1;
		}
		System.out.print("Mora perto da vítima?");
		resp = entrada.next().charAt(0);
		if (resp== 's' || resp == 'S') {
			cont += 1;
		}
		System.out.print("Devia para a vítima?");
		resp = entrada.next().charAt(0);
		if (resp == 's' || resp == 'S') {
			cont += 1;
		}
		System.out.print("Já trabalhou com a vítima?");
		resp = entrada.next().charAt(0);
		if (resp == 's' || resp == 'S') {
			cont += 1;
		}if (cont == 2) {
			System.out.print("Suspeita");
		}if (cont ==3 && cont ==4) {
			System.out.println("Cúmplice");
		}if (cont ==  5) {
			System.out.print("Culpado");
		}if(cont == 0) {
			System.out.print("Inocente");
		}

	}

}
