package poo;
import java.util.Scanner;

public class Exer05 {
	static Aluno lista[] = new Aluno[10];
	static Scanner tecla = new Scanner(System.in);
	static int index = 0;
	
	public static void main(String[] args) {
		int op = 0;
		boolean end = false;
		
		lista[index++] = new Aluno("Cacinbinha",123);
		lista[index++] = new Aluno("Jubertu",456);
		lista[index++] = new Aluno("Pé-de-pano",789);
		
		do {
			System.out.println("1 - Inserir Aluno");
			System.out.println("2 - Retorna Alunos");
			System.out.println("3 - Excluir Aluno");
			System.out.println("4 - Lançar notas");
			System.out.println("0 - Sair");
			op = tecla.nextInt();
			
			switch(op) {
				case 1: inserir(); break;
				case 2: imprimir(); break;
				case 3: excluir(); break;
				case 4: lancaNota(); break;
				case 0: end = true; break;
				default: System.out.println("Opção inválida"); break;
			}
			
		} while(!end);

	}
	
	public static void inserir() {
		System.out.println("Defina nome:");
		String nome = tecla.next();
		System.out.println("Defina matrícula:");
		int mat = tecla.nextInt();
		lista[index++] = new Aluno(nome,mat);
	}
	
	public static void imprimir() {
		for(int i = 0; i < lista.length-1; i++) {
			if(lista[i] != null) {
				System.out.printf("Nome: %s - Matrícula: %d - AV1: %.2f - AV2: %.2f - Média: %.2f - Aprovado: %b\n", 
						lista[i].getNome(), lista[i].getMatricula()
						, lista[i].getAv1(), lista[i].getAv2()
						, (lista[i].getAv1()+lista[i].getAv2())/2, lista[i].isAprov());
			}
		}
	}

	public static void excluir() {
		System.out.println("Defina matrícula:");
		int chave = tecla.nextInt();
		boolean found = false;
		for(int i = 0; i < lista.length-1;i++) {
			if(lista[i] != null && chave == lista[i].getMatricula()) {
				lista[i] = null;
				System.gc();
				found = true;
			}
		}
		if(!found) System.out.println("Aluno não encontrado");
	}
	
	public static void lancaNota() {
		System.out.println("Defina matrícula:");
		int chave = tecla.nextInt();
		System.out.println("Defina av1:");
		double av1 = tecla.nextDouble();
		System.out.println("defina av2:");
		double av2 = tecla.nextDouble();
		boolean found = false;
		
		for(int i = 0; i < lista.length-1; i++) {
			if(lista[i] != null && chave == lista[i].getMatricula()) {
				lista[i].setAv1(av1);
				lista[i].setAv2(av2);
				found = true;
				if((av1+av2)/2 >= 7.0) lista[i].setAprov(true);
			}
		}
		if(!found) System.out.println("Aluno não encontrado");
	}

}
