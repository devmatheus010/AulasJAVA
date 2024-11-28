package Fundamentos03;

import java.util.Scanner;

public class ContarMaiusculas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String resultado = sc.nextLine();
		System.out.println(resultado.toUpperCase());
	}
}
