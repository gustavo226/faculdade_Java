package questao_06;
import java.util.Scanner;

public class Exer06 {
	static Scanner tecla = new Scanner(System.in);
	
	public static void main(String[] args) {
		//INICIA OBJETOS E ADICIONA PRODUTOS AO ARRAY DE PRODUTOS
		Mochila mochila = new Mochila(20.6);
		Pessoa pessoa = new Pessoa(12.5, 10.2, mochila);
		Produto arroz = new Produto(0,5.5,5.0,"Arroz");
		Produto feijao = new Produto(1,6.5,1.0,"Feijão");
		Produto carneMoida = new Produto(2,11.99,0.5,"Carne Moída");
		Produto chocolate = new Produto(3,2.5,.3,"Barra de Chocolate");
		Produto[] arr_prod = new Produto[4];
		for(int i = 0; i <= arr_prod.length-1;i++) {
			switch (i) {
				case 0: arr_prod[i] = arroz; break;
				case 1: arr_prod[i] = feijao; break;
				case 2:	arr_prod[i] = carneMoida; break;
				case 3: arr_prod[i] = chocolate; break;
			}
		}
		//INICIA LOOP PRINCIPAL
		boolean end = false;
		int opt = 0;
		do {
			System.out.println("Defina uma opção:");
			System.out.println("1 - Ver produtos");
			System.out.println("2 - Ver mochila e limites");
			System.out.println("3 - Ver apenas os limites");
			System.out.println("4 - Adicionar produto na mochila");
			System.out.println("5 - Retirar produto da mochila");
			System.out.println("0 - Sair");
			opt = tecla.nextInt();
			switch (opt) {
				case 1: verProdutos(arr_prod); break;
				case 2: pessoa.verMochila(); break;
				case 3: pessoa.verLimites(); break;
				case 4: escolheProduto(arr_prod); break;
				case 5: pessoa.retiraProduto(); break;
				case 0: end = true; break;
				default: System.out.println("Opção inválida!");  break;
			}
		} while (!end);
		
		
	}
	
	//METODOS
	
	public static void verProdutos(Produto[] arr_prod) { //IMPRIME PRODUTOS DO ARRAY DE PRODUTOS
		System.out.println("Produtos na prateleira:");
		for(int i = 0; i <= arr_prod.length-1; i++) {
			if(arr_prod[i] != null) {
				System.out.printf("Código: %d | Nome: %s | Preço: R$%.2f | Peso: %.3f gramas\n",
						arr_prod[i].getCod(), arr_prod[i].getNome(), 
						arr_prod[i].getPreco(), arr_prod[i].getPeso());
			}
		}
	}
	
	public static void escolheProduto(Produto[] arr_prod) { //USUARIO ESCOLHE PRODUTO
		verProdutos(arr_prod);
		System.out.println("Digite o código do produto a ser adicionado à mochila:");
		int cod = tecla.nextInt();
		Produto prodSelect = getProduto(arr_prod, cod);
		try { //TENTA O PRODUTO PARA VER SE É NULL OU NAO
			System.out.println(prodSelect.getNome() + " selecionado");
		}
		catch (NullPointerException e) {
			System.out.println("Produto não encontrado!");
		}
		Pessoa.addProduto(prodSelect);
	}
	
	public static Produto getProduto(Produto[] arr_prod, int chave) { //PEGA PRODUTO DA PRATELEIRA (ARRAY DE PRODUTOS)
		for(int i = 0; i <= arr_prod.length-1; i++) {
			if(arr_prod[i] != null && chave == arr_prod[i].getCod()) {
				return arr_prod[i];
			}
		}
		return null;	
	}

}
