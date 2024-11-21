package Fundamentos02;

import java.util.Scanner;

public class MediaFor {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantos alunos tem na sala? ");
		int alunos = entrada.nextInt();
		float notas = 0; float media = 0;
		
		for(int i = 1; <= alunos; i++) {
			System.out.println("Digite a nota do aluno: ");
			notas += entrada.nextFloat();
			alunos++;
			
		}
		media = notas/alunos;
		System.out.println(media);
		
	}

}
