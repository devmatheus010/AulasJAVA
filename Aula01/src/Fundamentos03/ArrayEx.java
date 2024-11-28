package Fundamentos03;

public class ArrayEx {
	public static void main(String[] args) {
		String[] a = {"a", "vida", "é", "bela"};
		String texto = new String();
		
		for(int i = a.length -1; i >= 0; i--) {
			texto+= a[i].toUpperCase() + " ";
		}
		
		System.out.println(texto);
		
	}
}