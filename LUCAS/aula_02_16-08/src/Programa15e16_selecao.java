import java.util.Scanner;

public class Programa15e16_selecao {
	static Scanner tecla = new Scanner(System.in);
	public static void main(String[] args) {
		int lad, per;
		double med;
		System.out.println("Defina lados: ");
		lad = tecla.nextInt();
		System.out.println("Defina medida dos lados: ");
		med = tecla.nextDouble();
		
		switch (lad) {
			case 3:
				System.out.println("Triângulo. Perímetro de: " + perimetro(lad,med));
				break;
			case 4:
				System.out.println("Quadrado. Perímetro de: " + perimetro(lad,med));
				break;
			case 5:
				System.out.println("Pentágono. Perímetro de: " + perimetro(lad,med));
				break;
			default:
				if (lad<3) System.out.println("Não é um polígono!");
				else System.out.println("Polígono não identificado!");
		}	
	}
	
	public static double perimetro(int lad, double med) {
		return lad*med;
	}

}
