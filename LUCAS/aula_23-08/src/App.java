
public class App {

	static double area;	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		double test = calcular(2.52); //Para ter vizibilidade dentro da propria classe funcao deve ser sempre STATIC
	}
	//SOBRECARGA - Métodos com mesmo nome desenvolvido na mesma classe. Diferencia pela assinatura.
	/**
	 * 
	 * @param raio (double)
	 * @return raio calculado (double)
	 */
	public static double calcular(double raio) {
		return Math.PI*Math.pow(raio, 2);
	}

	public static double calcular(int raio) {
		return Math.PI*Math.pow(raio, 2);
	}
	
	public static void calcular(float raio) { //NÂO È FUNCAO!! Pq não retorna nada (VOID)
		area = Math.PI*Math.pow(raio, 2);
	}
	
}
