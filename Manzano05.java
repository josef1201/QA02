package Manzano;

public class Manzano05 {

	public static void main(String[] args) {
		int somatorio = 0;
		for(int i = 1; i < 501; i++) {
			if(i % 2 == 0) {
				somatorio = somatorio + i;	
				System.out.println("O valor total da soma :" +somatorio);
			}
		}
	}
}
