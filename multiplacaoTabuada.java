package Manzano;

import java.util.Scanner;

public class multiplacaoTabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero que deseja saber a tabuada: ");

		int numero = sc.nextInt();
		int contadora = 1;
		while (contadora < 11) {
			System.out.println(numero + "X" + contadora + "=" + numero * contadora);
			contadora++;
		}
		sc.close();
	}

}
