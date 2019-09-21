package poo;

public class Corrente extends Conta{

	private double limite;
	static double ini_limite;
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public Corrente(int numero, double saldo, double limite) {
		super(numero, saldo); //SUPER CHAMA O CONSTRUTOR DA SUPERCLASSE DO KPTA
		this.limite = limite;
		ini_limite = this.limite;
	} //sobrescrita métodos de mesmo nome em classes diferentes
	
	@Override
	public void sacar(double valor) {
		if(valor <= getSaldo()) setSaldo(getSaldo()-valor);
		else if (valor <= limite) this.limite -= valor;
	}

	@Override
	public void depositar(double valor) {
		if(getSaldo() < 0) this.limite += valor;
		else if(this.limite > 0) setSaldo(getSaldo()+valor); 
	}
	
}
