package model;

import java.util.Date;

public class Funcionario {

	private Integer codigo;
	private String nome;
	private Double salario;
	private Date admissao;
	
	/*
	 * Construtor é um metodo com o mesmo nome da classe que é chamado
	 * UMA UNICA VEZ< quando a classe é instanciada
	 * O Construtor tem como função INICIAR elementos da classe
	 * O COnstrutor é um método sem tipo
	 */
	public Funcionario(){
		System.out.println("COnstrutor executado");
		
		setNome("n/d");
		setSalario(800.);
		setAdmissao(new Date());
		//Codigo -- gerar randomico
		//0.715614565645561564564
		//715.614565645561564564
		//(int) 715.614565645561564564 ==> Pegar a parte inteira = 715
		Double cod = Math.random();
		Integer ncod = (int) (cod * 1000);
		setCodigo(ncod);
	}
	
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public Date getAdmissao() {
		return admissao;
	}
	public void setAdmissao(Date admissao) {
		this.admissao = admissao;
	}
	
	public Double calcSalario(){
		if(getSalario() < 2000)
			return getSalario() * 0.91;
		else if(getSalario() < 3800)
			return getSalario() * 0.79;
		else
			return getSalario() * 0.72;
	}
}
