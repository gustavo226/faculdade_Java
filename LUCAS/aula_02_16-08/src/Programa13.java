import java.util.Scanner;

public class Programa13 {

	public static void main(String[] args) {
		int num = 0;
		Scanner tecla = new Scanner(System.in);
		System.out.println("Digite um número: ");
		num = tecla.nextInt();
		if (num % 2 == 0) {
			System.out.println("Número é PAR");
		} else {
			System.out.println("Número é IMPAR");
		}
	}

}
