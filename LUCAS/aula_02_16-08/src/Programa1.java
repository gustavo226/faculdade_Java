import java.util.Scanner;
// exercício 01 simples
public class Programa1 {
	//static final double PI = 3.1416;
	static Scanner tecla = new Scanner(System.in);
	public static void main(String[] args) {
		/*LOCAl VARS*/
		double raio, area = 0.0;
		boolean x = false, y = true;
		/*DATA INPUT*/
		System.out.println("Informe o raio do círculo:");
		raio = tecla.nextDouble();
		/*PROCESSING*/ //STATIC = não precisa criar objeto para usar os métodos
		area = calcularArea(raio);
		/*DATA OUTPUT*/
		System.out.println("Área é: " + area);
		if (x && y) {
			System.out.println("HIT");
		} else {
			System.out.println("NOHIT");
		}
	}
	public static double calcularArea(double raio) {
		/**
		 * @Lucas
		 * @param raio
		 * @return
		 */
		return Math.PI * Math.sqrt(raio);
	}
}
