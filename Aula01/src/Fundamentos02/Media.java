package Fundamentos02;

import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int cont = 0;
		System.out.print("Quantos alunos tem na sala? ");
		int alunos = entrada.nextInt();
		float media = 0;
		float notas = 0;
		
		while (cont < alunos) {
			System.out.println("Digite a nota do aluno");
			notas += entrada.nextFloat();
			cont ++;
		}
		
		media = notas/alunos;
		System.out.println("A média dos alunos é: " + media);
		
	}
}