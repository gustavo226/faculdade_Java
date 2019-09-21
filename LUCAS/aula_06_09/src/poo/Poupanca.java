package poo;

public class Poupanca extends Conta{

	private double rendimento;
	final static double TAXA = .5;
	
	public Poupanca(int numero, double saldo) {
		super(numero, saldo);
		this.rendimento = 0;
	}

	@Override
	public void sacar(double valor) {
		setSaldo(getSaldo() - valor*Conta.TAXA);
	}
	
	@Override
	public void depositar(double valor) {
		this.rendimento += getSaldo() + valor*TAXA;
	}

}
