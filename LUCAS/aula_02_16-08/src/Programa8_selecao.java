import java.util.Scanner;

public class Programa8_selecao {
	static Scanner tecla = new Scanner(System.in);
	public static void main(String[] args) {
		int inp;
		final int ANO = 2019;
		System.out.println("Defina ano: ");
		inp = tecla.nextInt();
		if (ANO - inp >= 16) System.out.println("Pode votar. Idade: " + (ANO-inp));
		else System.out.println("Não pode votar. Idade: " + (ANO-inp));
	}
}
