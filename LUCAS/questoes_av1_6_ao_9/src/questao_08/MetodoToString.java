package questao_08;

public class MetodoToString {
	public String toString() {
		String sData = "";
		System.out.println("Defina dia (em números): ");
		sData += Exer08.tecla.next();
		System.out.println("Defina mês (em números): ");
		sData += "/" + Exer08.tecla.next();
		System.out.println("Defina ano (em números): ");
		sData += "/" + Exer08.tecla.next();
		System.out.println("Você digitou: " + sData);
		return sData;
	}
}
