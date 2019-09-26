package questao_07;

public class Exer07 {

	public static void main(String[] args) {
		Banco[] banco = new Banco[3];
		banco[0] = new Banco("Itaú", 471);
		banco[1] = new Banco("Santander", 589);
		banco[2] = new Banco("Bradesco", 233);
		
		banco[0].criaConta("Juberto");
		banco[0].criaConta("Antônio");
		banco[1].criaConta("Maria");
		banco[2].criaConta("Cacinbinha");
		banco[2].criaConta("Menino Ney");
		banco[1].criaConta("Baianinho da Sinuca");
		banco[2].criaConta("Sobral");
		banco[2].criaConta("Miranha");
		banco[1].criaConta("#ELENAO");
		banco[1].criaConta("Amigurumi");
		banco[2].criaConta("Alex Jones");
		banco[2].criaConta("Torampu-chan");
		banco[0].criaConta("Dinossauro Gamer");
		banco[0].criaConta("Jiraya, uma dádiva dos ninjas");
		
		System.out.println(banco[0].buscaConta(1).getNome());
		System.out.println(banco[0].buscaConta(3).getNome());
		System.out.println(banco[1].buscaConta(0).getNome());
		System.out.println(banco[1].buscaConta(2).getNome());
		System.out.println(banco[2].buscaConta(3).getNome());
		System.out.println(banco[2].buscaConta(5).getNome());
		
		banco[0].buscaConta(1).depositar(300.0);
		banco[0].buscaConta(3).sacar(100.0);
		banco[1].buscaConta(0).sacar(50.5);
		banco[1].buscaConta(2).depositar(23.98);
		banco[2].buscaConta(3).sacar(1200.50);
		banco[2].buscaConta(5).depositar(455.67);
	}

}
