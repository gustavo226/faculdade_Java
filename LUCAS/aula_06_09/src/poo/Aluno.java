package poo;

public class Aluno extends Pessoa{
	private int matricula;
	private double av1, av2;
	private boolean aprov = false;
	
	public double getAv1() {
		return av1;
	}

	public void setAv1(double av1) {
		this.av1 = av1;
	}

	public double getAv2() {
		return av2;
	}

	public void setAv2(double av2) {
		this.av2 = av2;
	}

	public boolean isAprov() {
		return aprov;
	}

	public void setAprov(boolean aprov) {
		this.aprov = aprov;
	}

	public Aluno(String nome, int matricula) {
		super(nome);
		this.setMatricula(matricula);
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


}
