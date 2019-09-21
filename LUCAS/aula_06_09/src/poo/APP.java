
package poo;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

import java.io.*;

public class APP {
    
    //Constante
    static final int MAXCONTA = 20;
   
    //variável comum
    static int index = 0;
    
    //Lista de contas
    static Conta[] lista = new Conta[MAXCONTA];
    
    static Scanner tecla = new Scanner(System.in);

    public static void main(String[] args) {
        int op;
        boolean end = false;
        lerCarga();
        do {                
            System.out.println("*** MENU PRINCIPAL ***");
            System.out.println("1-Incluir conta corrente");
            System.out.println("2-Sacar");
            System.out.println("3-Depositar");
            System.out.println("4-Listar saldo das Contas");
            System.out.println("5-Excluir conta");
            System.out.println("6-Realizar transferência");
            System.out.println("7-Incluir Poupança");
            System.out.println("0-Sair");
            System.out.println("Digite sua opção: ");
            op = tecla.nextInt(); 
            switch(op){
                case 1: incluirConta(); break;
                case 2: sacarValor(); break;
                case 3: depositarValor(); break;    
                case 4: listarContas(); break;
                case 5: excluirConta(); break;
                case 6: transferencia(); break;
                case 7: incluirPoupanca(); break;
                case 0: end = true; break;
                default: System.out.println("Opção inválida!"); break;
            }
        } while (!end);       
    }
    
    
    public static void incluirConta(){
        //Entrada
        System.out.println("Digite o número da conta:");
        int num = tecla.nextInt();
        System.out.println("Digite o saldo da conta:");
        double saldo = tecla.nextDouble();
        System.out.println("Digite o limite:");
        double limite = tecla.nextDouble();
        //Criar o objeto e inserir na lista
        lista[index++] = new Corrente(num, saldo, limite);
        System.out.println("Conta cadastrada com sucesso!");
    }
    
    public static void sacarValor(){
        //Entrada
        System.out.println("Digite o número da conta:");
        int num = tecla.nextInt();
        System.out.println("Digite o valor do saque:");
        double valor = tecla.nextDouble();
        
        //Procurar a conta na lista
        for (int i = 0; i < lista.length-1; i++) {
            if (num == lista[i].getNumero()){
                lista[i].sacar(valor);
                break;
            }
        }
    }
    
    public static void depositarValor(){
        //Entrada
        System.out.println("Digite o número da conta:");
        int num = tecla.nextInt();
        System.out.println("Digite o valor do depósito:");
        double valor = tecla.nextDouble();
        
        //Procurar a conta na lista
        for (int i = 0; i < lista.length-1; i++) {
            if (num == lista[i].getNumero()){
                lista[i].depositar(valor);
                break;
            }
        }
    }
    
    public static void listarContas(){
        double total = 0;
        System.out.println("Nº Conta:........ SALDO:");
        for (int i = 0; i < lista.length-1; i++) {
            if (lista[i] != null){
                System.out.println(lista[i].getNumero()
                                   + "........" +
                                   lista[i].getSaldo());
                //total += lista[i].getSaldo();
                total = total + lista[i].getSaldo();
            }
        }
        System.out.println("Total:........" + total);
    }
    
    public static void excluirConta() {
    	int chave;
    	boolean confirma = false;
    	System.out.println("Defina número da conta: ");
    	chave = tecla.nextInt();
    	for(int i = 0;i < lista.length-1;i++) { //length-1 pode ser substituido por .size ?????
			if (lista[i] != null && chave == lista[i].getNumero()) {
				System.out.printf("Conta %d encontrada e excluída\n", lista[i].getNumero());
				lista[i] = null;
				System.gc();
				confirma = true;
			}
    	}
    	if(!confirma) System.out.printf("Conta %d não foi encontrada\n", chave);
    }
    
    public static void lerCarga() {
    	File carga = new File("src/carga.csv");
    	int num = 0, ct = 0;
    	double saldo = 0.0;
    	try {
    		Scanner sc = new Scanner(carga);
    		System.out.printf("Contas lidas: ");
    		
    		while(sc.hasNextLine()) {	
    			String str = sc.nextLine();
    			parseLine(str);
    		}
    		System.out.println();
    	}
    	catch(FileNotFoundException ex) {
    		System.out.println("Arquivo de carga não foi encontrado!");
    	}
    	catch(IOException exp) {
    		System.out.println("Erro de entrada/saída!");
    	}
    }
    
    public static void parseLine(String str) {
    	String conta, valor;
		Scanner sc = new Scanner(str);
		sc.useDelimiter(";");
		while(sc.hasNext()) {
			conta = sc.next();
			valor = sc.next();
			incluirConta(Integer.parseInt(conta),Double.parseDouble(valor));
		}
    }
    
    public static void incluirConta(int num, double saldo){
        //Criar o objeto e inserir na lista
        lista[index++] = new Conta(num, saldo);
        System.out.printf("%d cadastrado ", num);
    }
    
    public static void transferencia() {
    	int transf, favorecido;
    	double quantia;
    	System.out.println("Defina conta do transferidor:");
    	transf = tecla.nextInt();
    	System.out.println("Defina conta do favorecido:");
    	favorecido = tecla.nextInt();
    	System.out.println("Defina quantia:");
    	quantia = tecla.nextDouble();
    	sacarValor(transf, quantia);
    	depositarValor(favorecido, quantia);
    }
    
    public static void sacarValor(int transf, double quantia){
        //Procurar a conta na lista
        for (int i = 0; i < lista.length-1; i++) {
            if (transf == lista[i].getNumero()){
                lista[i].sacar(quantia);
                break;
            }
        }
    }
    
    public static void depositarValor(int favorecido, double quantia){
    	//Procurar a conta na lista
        for (int i = 0; i < lista.length-1; i++) {
            if (favorecido == lista[i].getNumero()){
                lista[i].depositar(quantia);
                break;
            }
        }
    }
    
    public static void incluirPoupanca() {
    	//Entrada
        System.out.println("Digite o número da conta:");
        int num = tecla.nextInt();
        System.out.println("Digite o saldo da conta:");
        double saldo = tecla.nextDouble();
        //Criar o objeto e inserir na lista
        lista[index++] = new Poupanca(num, saldo);
        System.out.println("Conta cadastrada com sucesso!");
    }
    
    /* questões java prog av1 e av2 : 1, 3, 4, 5, */
    
}