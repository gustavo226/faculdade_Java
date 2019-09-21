import java.util.Scanner;
//exercício 02 simples
public class Programa02 {
	static Scanner tecla = new Scanner(System.in);
	public static void main(String[] args) {
		double fah, cel;
		System.out.println("Insira graus Fahranheit: ");
		fah = tecla.nextDouble();
		cel = ((fah-32)/9)*5;
		System.out.println("Celsius: " + cel + " Fahrenheit: " + fah);
	}

}
