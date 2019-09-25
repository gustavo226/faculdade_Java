package questao_06;

public class Produto {
	private int cod;
	private double preco;
	private double peso;
	private String nome;
	
	public Produto(int cod, double preco, double peso, String nome) {
		this.cod = cod;
		this.preco = preco;
		this.peso = peso;
		this.nome = nome;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
