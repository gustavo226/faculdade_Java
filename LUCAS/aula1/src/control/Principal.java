package control;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import model.Funcionario;
import model.Pessoa;
import model.Produto;

public class Principal {

	//main + ctrl + espaço
	public static void main(String[] args) {
		//syso + ctrl + espaço
		System.out.println("Aula 1 JAVA");
		
		//Instanciar a classe Pessoa --- Alocar na memoria
		Pessoa p = new Pessoa();
		
		p.ler("Ana", 30, 'F');
		
		System.out.println("Pessoa: " + p.imprimir());
		
		Locale lc = new Locale("pt", "br");
		NumberFormat nf = NumberFormat.getCurrencyInstance(lc);
		
		Produto prod = new Produto();
		//Adicionar os valores -- Entrada de dados
		prod.setNome("Camisa");
		prod.setEstoque(100);
		prod.setValor(75.);
		
		System.out.println("Produto: " + prod.getNome());
		System.out.println("Estoque: " + prod.getEstoque());
		System.out.println("Valor: " + nf.format(prod.getValor()));
		System.out.println("Total: " + nf.format(prod.calcTotal()));
		
		System.out.println("-----------------------");
		
		/*
		 * new --- Chamando o construtor da classe
		 */
		Funcionario f1 = new Funcionario();
		
		f1.setNome("Jose");
		f1.setSalario(3500.);
		
		GregorianCalendar cal = new GregorianCalendar();
		//o mes vai de 0 ate 11
		cal.set(2015, 8 - 1, 20);
		
		f1.setAdmissao(cal.getTime());
		
		/*
		 * O Valr padrão de QUALQUER CLASSE É NULL
		 */
		
		//Formatar a saida da data
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Nome: " + f1.getNome());
		System.out.println("Codigo: " + f1.getCodigo());
		System.out.println("Salário: "+ nf.format(f1.getSalario()));
		System.out.println("Admissao: " + sdf.format(f1.getAdmissao()));
		System.out.println("Salario Liquido: " + nf.format(f1.calcSalario()));
		
		
	}
	
}
