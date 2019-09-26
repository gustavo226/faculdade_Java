package questao_07;

public class Conta {
	private String nome;
	private double saldo;
	private Banco banco;
	private int cod;
	
	public Conta(String nome, int cod, Banco banco, double saldo) {
		this.nome = nome;
		this.cod = cod;
		this.banco = banco;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public Banco getBanco() {
		return banco;
	}

	public int getCod() {
		return cod;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
		System.out.printf("Depósito feito. Novo saldo: %.2f\n", this.saldo);
	}
	
	public void sacar(double valor) {
		this.saldo -= valor;
		System.out.printf("Saque feito. Novo saldo: %.2f\n", this.saldo);
	}

}
