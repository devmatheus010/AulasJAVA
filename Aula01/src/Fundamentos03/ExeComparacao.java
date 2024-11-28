package Fundamentos03;

public class ExeComparacao {
	public static void main(String[] args) {
		String texto01 = "Será que os textos são iguais";
		String texto02 = "Será que os textos são iguais";
		
		if (texto01.equals(texto02)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
}
