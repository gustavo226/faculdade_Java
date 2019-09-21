import java.util.Scanner;
// exercício 4 simples
public class Programa4 {
	static Scanner tecla = new Scanner(System.in);
	public static void main(String[] args) {
		// VARS
		int pot, lam;//potencia, lampadas necessárias
		double lar, com, met, pto; // largura, comprimento, metro quadrado, potencia total
		final int POTBASE = 18; // potencia base
		// INPUT
		System.out.println("Defina potência: ");
		pot = tecla.nextInt();
		System.out.println("Defina largura: ");
		lar = tecla.nextDouble();
		System.out.println("Defina comprimento: ");
		com = tecla.nextDouble();
		// PROCESS
		met = lar * com;
		pto = met * POTBASE;
		lam = (int)pto/pot;
		if (lam == 0) lam = 1;
		// RESULT
		System.out.println("Você precisará de " + lam + " lâmpadas");
	}

}
