import java.util.Scanner;

public class Programa2_selecao {
	static Scanner tecla = new Scanner(System.in);
	public static void main(String[] args) {
		double av1 = 0.0, av2 = 0.0, av3 = 0.0, nota = 0.0;
		boolean bv1 = false, bv2 = false, bv3 = false;
		
		while (!bv1) {
			System.out.println("Defina nota AV1: ");
			av1 = tecla.nextDouble();
			if (av1 <= 10.0 && av1 >= 0.0) bv1 = true;
			else System.out.println("Nota inválida!");
		}
		while (!bv2) {
			System.out.println("Defina nota AV2: ");
			av2 = tecla.nextDouble();
			if (av2 <= 10.0 && av2 >= 0.0) bv2 = true;
			else System.out.println("Nota inválida!");
		}
		while (!bv3) {
			System.out.println("Defina nota AV3 (caso não se aplique, defina como '-1'): ");
			av3 = tecla.nextDouble();
			if ((av3 <= 10.0 && av3 >= 0.0) || av3 == -1.0) bv3 = true;
			else System.out.println("Nota inválida!");
		}
		
		
		if (av3 == -1) nota = (av1+av2)/2;
		else {
			if (av1 > av2) av2 = av3;
			else av1 = av3;
			nota = (av1+av2)/2;
		}
		
		if (nota >= 6.0) System.out.println("Aprovado com nota: " + nota);
		else if (nota < 3.0) System.out.println("Reprovado com nota: " + nota);
		else System.out.println("Em exame com nota: " + nota);
	}	

}
