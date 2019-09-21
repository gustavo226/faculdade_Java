package poo;

public class Candidato extends Pessoa {
	private int numero, votos;
	
	public Candidato(String nome, int numero, int votos) {
		super(nome);
		this.setNumero(numero);
		this.setVotos(votos);
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getVotos() {
		return votos;
	}
	public void setVotos(int votos) {
		this.votos += votos;
	}

}
