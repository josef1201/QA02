package Manzano;

import java.util.Scanner;

public class Manzano02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero para saber a tabuada");
		int valor = sc.nextInt();
		for (int i = 1; i < 11; i++) {
			System.out.println(valor + "X" + i + "=" + valor * i);
			sc.close();
		}
	}
}
