
public class Aplicativo {

	public static void main(String[] args) {
		//ENTRADA DE DADOS
		Conta c1 = new Conta(123456, 580.00);
		Conta c2 = new Conta(987765, 1243.00, "John Doe");
		Conta c3 = new Conta(987765, 1243.00, "Mary Doe", true);
		
		/*c1.setNumero(123);
		c1.setSaldo(23000.00);*/
		System.out.println("-------------------");
		System.out.println(c1.getNumero());
		System.out.println(c1.getSaldo());
		System.out.println(c1.getCliente());
		System.out.println(c2.isAtivo());
		System.out.println("-------------------");
		System.out.println(c2.getNumero());
		System.out.println(c2.getSaldo());
		System.out.println(c2.getCliente());
		System.out.println(c2.isAtivo());
		System.out.println("-------------------");
		System.out.println(c3.getNumero());
		System.out.println(c3.getSaldo());
		System.out.println(c3.getCliente());
		System.out.println(c3.isAtivo());
		System.out.println("-------------------");
		c1.setSaldo(300.0);
		c1.setSaldo(-100.0);
		c1.Sacar(50.0);
		System.out.println(c1.getSaldo());
		c1.Depositar(50.0);
		System.out.println(c1.getSaldo());
		c1.Sacar(500000.0);
		System.out.println(c1.getSaldo());
		
	}

}
