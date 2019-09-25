package questao_06;

public class Mochila {
	private double limitePeso;
	private double pesoAtual;
	Produto[] inv;
	private int volumeAtual;
	
	public int getVolumeAtual() {
		return volumeAtual;
	}

	public void setVolumeAtual(int volumeAtual) {
		this.volumeAtual += volumeAtual;
	}

	public Mochila(double limitePeso) {
		this.limitePeso = limitePeso;
		this.inv = new Produto[10];
		this.pesoAtual = 0;
		this.volumeAtual = 0;
	}
	
	public double getLimitePeso() {
		return limitePeso;
	}

	public void setLimitePeso(double limitePeso) {
		this.limitePeso = limitePeso;
	}

	public double getPesoAtual() {
		return pesoAtual;
	}

	public void setPesoAtual(double pesoAtual) {
		this.pesoAtual += pesoAtual;
	}

}
