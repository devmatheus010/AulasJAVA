package Fundamentos02;

public class Array {
	public static void main(String[] args) {
		int arrayUm[] = {12,3,5,68,9,6,73,44,456,65,321};
		int arrayDois[] = {43,42,8,4,55,21,2,45};
		
		if(arrayDois.length > 8) {
			System.out.println("Tamanho do arrayDois - maior que 8");
		}else {
			System.out.println("Tamanho do arrayDois - menor que 8");
		}
		System.out.println("\nTamanho do arrayUm = "+arrayUm.length);
	}
	
}