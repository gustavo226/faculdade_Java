package poo;
import java.util.Scanner;

public class Estoque {
	static Scanner tecla = new Scanner(System.in);
	static Produto lista[] = new Produto[10];
	static int index = 0;
	
	public static void main(String[] args) {
		int op = 0;
		boolean end = false;
		
		lista[index++] = new Produto("Mouse",15.0,60); // Carga inicial
		lista[index++] = new Produto("Teclado",45.0,20);
		lista[index++] = new Produto("Monitor",250.0,50);
		
		do {
			System.out.println("1 - Incluir produto");
			System.out.println("2 - Imprimir produtos");
			System.out.println("3 - Verificar reposições");
			System.out.println("4 - Atualizar estoque");
			System.out.println("5 - Quantia em estoque");
			System.out.println("0 - Sair");
			op = tecla.nextInt();
			
			switch(op) {
				case 1: incluir(); break;
				case 2: imprimir(); break;
				case 3: verificarRepo(); break;
				case 4: updateEst(); break;
				case 5: totalEst(); break;
				case 0: end = true; break;
				default: System.out.println("Opção inválida"); break;
			}
		} while(!end);

	}

	public static void incluir() {
		String nome;
		double preco;
		int qtd;
		System.out.println("Defina nome do produto:");
		nome = tecla.next();
		System.out.println("Defina preço do produto:");
		preco = tecla.nextDouble();
		System.out.println("Defina quantidade do produto:");
		qtd = tecla.nextInt();
		lista[index++] = new Produto(nome,preco,qtd);
	}
	
	public static void imprimir() {
		for(int i = 0; i < lista.length-1; i++) {
			if(lista[i] != null) System.out.printf("%d - Nome: %s - Preço: %.2f - Qtd: %d\n", i, lista[i].getNome(), lista[i].getPreco(), lista[i].getQtd());
		}
	}
	
	public static void verificarRepo() {
		System.out.println("Produtos a serem repostos:");
		for(int i = 0; i < lista.length-1; i++) {
			if(lista[i] != null && lista[i].getQtd() < 50) { //toma como regra que qualquer produto com qtd < 50 precisa de reposição
				System.out.printf("%d - Nome: %s - Qtd: %d\n", i, lista[i].getNome(), lista[i].getQtd());
			}
		}
	}
	
	public static void updateEst() {
		System.out.println("Defina produto a ser atualizado:");
		String chave = tecla.next();
		System.out.println("Defina quantidade:");
		int ret = tecla.nextInt();
		System.out.println("1 - para retirar ou 2 - para acrescentar:");
		int op = tecla.nextInt();
		boolean found = false;
		
		for(int i = 0; i < lista.length-1; i++) {
			if(lista[i] != null && chave.equals(lista[i].getNome())) {
				switch(op) {
					case 1: lista[i].setQtd(ret*(-1)); found = true; break;
					case 2: lista[i].setQtd(ret); found = true; break;
					default: System.out.println("Opção inválida"); break;
				}
			}
		}
		if(!found) System.out.println("Produto não encontrado");
	}
	
	public static void totalEst() {
		double total = 0.0;
		for(int i = 0; i < lista.length-1;i++) {
			if(lista[i] != null) {
				total += lista[i].getQtd()*lista[i].getPreco();
				System.out.printf("Nome: %s - Preço: %.2f - Qtd: %d - Total: %.2f\n", lista[i].getNome(), lista[i].getPreco(), lista[i].getQtd(), lista[i].getPreco()*lista[i].getQtd());
			}
		}
		System.out.printf("Total em estoque: %.2f\n", total);
	}
}
