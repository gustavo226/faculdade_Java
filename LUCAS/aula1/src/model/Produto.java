package model;

public class Produto {

	/*
	 * >= Java 1.5 --> Wrapper (É uma referencia (classe) a cada um dos 
	 * tipos primitivos)
	 * 
	 * char
	 * Character 
	 * 
	 * byte < short < int < long
	 * Byte < Short < Integer < Long
	 * 
	 * float < double
	 * Float < Double
	 * 
	 * boolean
	 * Boolean
	 */
	private String nome;
	private Integer estoque;
	private Double valor;
	
	/*
	 * Encapsulamento -- Criar atributos PRIVATE
	 * Criar métodos public (SET e GET) para cada atributo
	 * 
	 * ALT + S -- Generated getter and setter
	 * ALT + SHIFT + S -- Generated getter and setter 
	 */
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getEstoque() {
		return estoque;
	}
	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public Double calcTotal(){
		if(getEstoque() == null || getValor() == null){
			return 0.;
		}
		
		return getEstoque() * getValor();
	}
	
}
