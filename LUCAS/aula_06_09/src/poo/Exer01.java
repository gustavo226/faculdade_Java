package poo;

import java.util.Scanner;

public class Exer01 {
	static Pessoa[] lista = new Pessoa[10];
	static Scanner tecla = new Scanner(System.in);
	static int index = 0;
	public static void main(String[] args) {
		int op = 0;
		boolean end = false;
		do {
			System.out.println("1 - Inserir Pessoa");
			System.out.println("2 - Listar Pessoas");
			System.out.println("0 - Sair");
			op = tecla.nextInt();
			switch(op) {
				case 1: inserir(); break;
				case 2: imprimir(); break;
				case 0: end = true; break;
				default: System.out.println("Opção inválida!"); break;
			}
		} while (!end);

	}

	public static void inserir() {
		System.out.println("Defina nome:");
		String nome = tecla.next();
		lista[index++] = new Pessoa(nome);
	}
	
	public static void imprimir() {
		for(int i = 0; i < lista.length-1;i++) if(lista[i] != null) System.out.printf("%d - Nome: %s\n", i, lista[i].getNome());
	}
	
}
