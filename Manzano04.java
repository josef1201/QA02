package Manzano;

public class Manzano04 {

	public static void main(String[] args) {
		String[] carro = { "Gol", "Santana", "Fusca", "Puma" };
		System.out.println(carro[0]);
		carro[3] = "Marea";
		System.out.println(carro[3]);

		int[] numero = { 12, 3, 5, 6, 7 };
		System.out.println(numero[4]);
		System.out.println(numero.length);

		String[] nome = { "Jailson", "Rafael", "Daniel", "Maria" };
		for (int i = 0; i < nome.length; i++) {
			System.out.println(nome[i]);

			String[] nome1 = { "Jailson", "Andre", "Rafael", "Daniel", "Maria", "Erick", "Socorro" };
			for (String i1 : nome1) {
				System.out.println(i1);
			}
		}
	}
}
