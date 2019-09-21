import java.util.Scanner;

public class Programa1_selecao {
	static Scanner tecla = new Scanner(System.in);
	public static void main(String[] args) {
		int cod;
		System.out.println("Defina código: ");
		cod = tecla.nextInt();
		switch (cod){
			case 1:
				System.out.println("Sul");
				break;
			case 2:
				System.out.println("Norte");
				break;
			case 3:
				System.out.println("Leste");
				break;
			case 4:
				System.out.println("Oeste");
				break;
			case 5:
				System.out.println("Nordeste");
				break;
			case 6:
				System.out.println("Nordeste");
				break;
			case 7:
				System.out.println("Sudeste");
				break;
			case 8:
				System.out.println("Sudeste");
				break;
			case 9:
				System.out.println("Sudeste");
				break;
			case 10:
				System.out.println("Centro-oeste");
				break;
			case 11:
				System.out.println("Noroeste");
				break;
			default:
				System.out.println("Importado");
		}
	}
}
