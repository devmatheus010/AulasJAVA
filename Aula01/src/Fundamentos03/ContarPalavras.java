package Fundamentos03;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ContarPalavras {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite alguma frase");
		StringTokenizer exemplo = new StringTokenizer(sc.nextLine());
		System.out.println(exemplo.countTokens());
		
	}
}
