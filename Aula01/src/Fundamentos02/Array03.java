package Fundamentos02;

import java.util.Scanner;

public class Array03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arrayUm[] = new int[4];
		int arrayDois[] = new int[4];
		int arrayTres[] = new int[4];
		int arrayQuatro[] = new int[4];
		
		for (int i = 0; i < arrayUm.length; i++) {
			System.out.print("Digite um numero para o array: ");
			arrayUm[i] = sc.nextInt();
			
		}
		for(int j = 0; j < arrayUm.length; j++) { //for(int j : ArrayUm){
														//System.out.println(j+" ");
			System.out.println(arrayUm[j]);
		}
		for(int x = 0; x < arrayDois.length; x++) {
			System.out.print("Digite um numero para o array: ");
			arrayDois[x] = sc.nextInt();
		}
		for (int n = 0; n < arrayDois.length; n++) {
			System.out.println(arrayDois[n]);
		}
	}
}
