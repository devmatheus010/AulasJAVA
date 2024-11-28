package Fundamentos03;

public class Maiusculo {
	public static void main(String[] args) {
		String str = "Hello";
		String resultado = str.toUpperCase(); 
		System.out.println(resultado);
		
		String str1 = "Hello";
		String resultado1 = str.toLowerCase();
		System.out.println(resultado1);
		
		String str2 = "Matheus";
		String resultado2 = str2.trim();
		System.out.println(resultado2);
		
		String str3 = "Matheus";
		char c = str3.charAt(4);
		System.out.println(c);
		
		String s1 = "Hello";
		String s2 = "HELLO";
		boolean b1 = s1.equals("Hello");
		boolean b2 = s2.equals(s2);
		boolean b3 = s1.equalsIgnoreCase(s2);
		boolean b4 = s1.equalsIgnoreCase("Azul");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
		String s = "abc";
		int tam = s.length(); 
		System.out.println(tam);
		
		String str4 = "Hello World2";
		int pos = str.indexOf("o");
		System.out.println(pos);
		int pos1 = str.lastIndexOf("H");
		System.out.println(pos1);
		
		String valor = "CDD 4.0 - Java";
		System.out.println(valor.compareTo("CDD 4.0 - Java") == 0 ? true:false);
		System.out.println(valor.compareToIgnoreCase("CDD 4.0 - JAVA") == 0? true:false);
		
		String valor1 = "CDD Java";
		System.out.println(valor.endsWith("Java"));
		System.out.println(valor.startsWith("C"));
		System.out.println(valor.startsWith("DD", 1));
		
		
		
	}
}
