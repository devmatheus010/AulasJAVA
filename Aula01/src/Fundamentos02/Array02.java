package Fundamentos02;

public class Array02 {
	public static void main(String[] args) {
		int arrayNum[] = {1,68,52,5,49,83,12,64};
		int total = 0;
		
		for(int i : arrayNum)
			total +=i;
			System.out.printf("Soma dos elementos arrayNum: %d\n", total);
	}
}