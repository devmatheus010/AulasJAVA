package Fundamentos02;

import java.util.Scanner;

public class MediaArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double notas[] = new double[5];
		double total = 0;
		double media = 0;
		
		
		for(int i = 0; i < notas.length; i++) {
			System.out.print("Digite a nota do aluno: ");
			notas[i] = sc.nextDouble();
			
		}
		for(double x : notas){
			total = total + x;
			System.out.print(x + " | ");
		}
		media = total/notas.length;
		System.out.print("A media é: " + media);
		sc.close();
	}
}

