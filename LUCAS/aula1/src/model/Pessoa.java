//Caminho de pacotes da classe
package model;

/*
 * Imports da classe
 * import java.util.Date;
 */

public class Pessoa {

	/*
	 * Atributos -- Variável
	 * 
	 * Qualificador de acesso + Tipo do atributo + nome do atributo
	 * 
	 * Qualificador de acesso --> Definir a visibilidade do elemento em relação ao seu projeto
	 * 	private				( - ) --> So pode ser utilizado na propria classe
	 * 	protected			( # ) --> So pode ser utilizado na propria classe e nas suas heranças
	 * 	package / default	( ~ ) --> Pode ser utilizada na propria classe e em qualquer classe do mesmo pacote
	 * 	public				( + ) --> pode ser utilizada em qualquer classe
	 * 
	 * Tipo do atributo --> Definir o valor que pode ser adicionado ao atributo
	 * 		char < String -- Tipo de texto
	 * 		byte < short < int < long -- tipo Inteiro
	 * 		float < double -- Tipo real
	 * 		boolean -- Valores true ou false
	 */
	private String nome;
	private int idade;
	private char sexo;	
	
	/*
	 * Métodos -- Função da classe
	 * 
	 * O tipo do método -- Pode ser o tipo dos atributos
	 * porem um metodo pode ser do tipo VOID ---> void é o metodo que NÃO POSSUI NENHUM RETORNO
	 */
	public void ler(String nome, int idade, char sexo){
		this.nome = nome.toUpperCase();
		this.idade = idade;
		this.sexo = sexo;
	}
	
	public String imprimir(){
		return nome + ", " + this.idade + ", " + this.sexo;
	}
	
}
