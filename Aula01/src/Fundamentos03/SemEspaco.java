package Fundamentos03;

public class SemEspaco {
	public static void main(String[] args) {
		String str = " texto para retirar espaços no inicio e no fim  ";
		String resultado = str.trim();
		System.out.println(resultado);
	}

}
