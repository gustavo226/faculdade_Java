public class Conta {
	//ATRIBS DE INSTANCIA
	//via de regra ( mas com exceções): recomenda-se que quando se cria uma classe
	//todos os atribs sejam privados
	private int numero;
	private double saldo;
	private String cliente;
	private boolean isAtivo;
	
	static final double taxa = 1.5; //AQUI È PUBLIC, PODE SER ACESSADO POR OBJETO, POR CLASSE POR TUDO
									//É STATIC ENTÂO NÂO PRECISA SER INSTANCIADA PRA USAR
									//FINAL = CONSTANTE
	public boolean isAtivo() {
		return isAtivo;
	}
	public void setAtivo(boolean isAtivo) {
		this.isAtivo = isAtivo;
	}
	
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		System.out.println("Adicionado: " + saldo);
		System.out.println("Quantia antiga: " + this.saldo);
		this.saldo = this.saldo + saldo;
		System.out.println("Novo total: " + this.saldo);
	}
	
	public void Sacar(double numero) {
		if (numero > this.saldo) System.out.println("SEM SALDO");
		else this.saldo -= numero;
	}
	
	public void Depositar(double numero) {
		this.saldo += numero;
	}
	
	//CONSTRUCTOR
	public Conta(int numero, double saldo) {
		this.setNumero(numero);
		this.setSaldo(saldo);
	}
	
	public Conta(int numero, double saldo, String nome) {
		this.setNumero(numero);
		this.setSaldo(saldo);
		this.setCliente(nome);
	}
	
	public Conta(int numero, double saldo, String nome, boolean isAtivo) {
		this.setNumero(numero);
		this.setSaldo(saldo);
		this.setCliente(nome);
		this.setAtivo(isAtivo);
	}
}
