import java.util.Scanner;
// exercício 5 simples
public class Programa5 {
	static Scanner tecla = new Scanner(System.in);
	public static void main(String[] args) {
		// VARS
		double lar, com, alt, met; //largura, comprimento, altura, metragem total
		final double AZU = 1.5; // constante da metragem de caixa de azulejo
		long res; //resultado (long int para suportar math.round()
		// INPUT
		System.out.println("Defina largura: ");
		lar = tecla.nextDouble();
		System.out.println("Defina comprimento: ");
		com = tecla.nextDouble();
		System.out.println("Defina altura: ");
		alt = tecla.nextDouble();
		// PROCESS
		met = 2*(alt*lar) + 2*(alt*com);
		res = Math.round(met/AZU);
		// RESULT
		System.out.println("Caixas de azulejo necessárias: " + res);
	}
}
