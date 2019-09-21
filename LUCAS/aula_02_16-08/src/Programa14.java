import java.util.Scanner;

public class Programa14 {

	public static void main(String[] args) {
		int gols_g, gols_i = 0;
		Scanner tecla = new Scanner(System.in);
		System.out.println("Gols do Gremio: ");
		gols_g = tecla.nextInt();
		System.out.println("Gols do Inter: ");
		gols_i = tecla.nextInt();
		if(gols_g > gols_i) {
			System.out.println("GREMIO!!");
		} else {
			if(gols_i > gols_g) {
				System.out.println("INTER!!!");
			} else {
				System.out.println("Empate..");
			}
		}
	}

}
