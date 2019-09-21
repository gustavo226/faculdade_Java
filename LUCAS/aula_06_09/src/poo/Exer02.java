package poo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exer02 {

	static Candidato[] lista = new Candidato[10];
	static Scanner tecla = new Scanner(System.in);
	static int index = 0;
	static int ct = 0;
	public static void main(String[] args) {
		int op = 0;
		boolean end = false;
		incluir(123, "Podgorski"); //Cargas iniciais que a preguiça é grande
		incluir(456, "Doria");
		incluir(789, "Mario");
		incluir(135, "Julio");
		incluir(246, "Cotelli");
		do {
			System.out.println("1 - Incluir Candidato");
			System.out.println("2 - Imprimir Candidatos");
			System.out.println("3 - Adcionar votos");
			System.out.println("4 - Carregar votos");
			System.out.println("5 - Contar votos");
			System.out.println("0 - Sair");
			op = tecla.nextInt();
			switch(op) {
				case 1: incluir(); break;
				case 2: imprimir(); break;
				case 3: addVoto(); break;
				case 4: carregaVoto(); break;
				case 5: realizarContagem(); break;
				case 0: end = true; break;
				default: System.out.println("Opção inválida"); break;
			
			}
		} while(!end);

	}
	
	public static void incluir() {
		String nome;
		int numero;
		System.out.println("Defina número:");
		numero = tecla.nextInt();
		System.out.println("Defina nome:");
		nome = tecla.next();
		lista[index++] = new Candidato(nome, numero, 0);
	}
	
	public static void incluir(int numero, String nome) {
		lista[index++] = new Candidato(nome, numero, 0);
	}

	public static void imprimir() {
		for(int i = 0; i < lista.length-1;i++) {
			if(lista[i] != null) System.out.printf("%d - Número: %d - Nome: %s - Votos: %d\n", i, lista[i].getNumero(), lista[i].getNome(), lista[i].getVotos());
	
		}
	}
	
	public static void addVoto() {
		System.out.println("Defina numero a receber voto:");
		int chave = tecla.nextInt();
		for(int i = 0; i < lista.length-1;i++) {
			if(lista[i] != null && chave == lista[i].getNumero()) lista[i].setVotos(1);
		}		
	}
	
	public static void carregaVoto() {
		String carga = "src/votos";
    	String linha = null;
    	try {
    		FileReader fileReader = new FileReader(carga);
    		BufferedReader bufferedReader = new BufferedReader(fileReader);
    		while((linha = bufferedReader.readLine()) != null) {
    			addVoto(linha);
    		}
    		bufferedReader.close();
    		System.out.printf("Votos contados: %d\n", ct);
    	}
    	catch(FileNotFoundException ex) {
    		System.out.println("Arquivo de carga não foi encontrado!");
    	}
    	catch(IOException ex) {
    		System.out.println("Erro de entrada/saída!");
    	}
	}
	
	public static void addVoto(String linha) {
		int chave = Integer.parseInt(linha);
		for(int i = 0; i < lista.length-1;i++) {
			if(lista[i] != null && chave == lista[i].getNumero()) {
				lista[i].setVotos(1);
				ct++;
			}
		}	
	}
	
	public static void realizarContagem() {
		Candidato aux;
		for(int i = 0; i < lista.length-1;i++) {
			for(int j = 0; j < lista.length-1;j++) {
				if(lista[i] != null && lista[j] != null && lista[i].getVotos() > lista[j].getVotos()) {
					aux = lista[i];
					lista[i] = lista[j];
					lista[j] = aux;
				}
			}
		}
		System.out.printf("Vencedor: %s. Com %d votos! Porcentagens seguem:\n", lista[0].getNome(), lista[0].getVotos());
		double per = 0;
		for(int i = 0; i < lista.length-1;i++) {
			if(lista[i] != null) {
				per = (double)(lista[i].getVotos()*100)/ct;
				System.out.printf("%d - Numero: %d - Nome: %s - Votos: %d - Porcentagem: %.1f\n", i, lista[i].getNumero(), lista[i].getNome(), lista[i].getVotos(), per);
			}
		}
		
	}
	
}
