package questao_06;

public class Pessoa {
	static private Mochila mochila;
	private static double orcamento;
	static private double gasto;
	static private double limiteCarga;
	
	public Pessoa(double orcamento, double limiteCarga, Mochila mochila) {
		Pessoa.orcamento = orcamento;
		Pessoa.limiteCarga = limiteCarga;
		Pessoa.mochila = mochila;
		Pessoa.gasto = 0;
	}
	
	public static void addProduto(Produto produto) {
		for(int i = 0; i <= mochila.inv.length-1;i++) {
			if(mochila.inv[i] == null) {
				if(mochila.getPesoAtual() + produto.getPeso() > mochila.getLimitePeso()) {
					System.out.println("Limite de peso da mochila excedido! Produto não adicionado!"); break;
				} else if (gasto + produto.getPreco() > orcamento) { 
					System.out.println("Orçamento excedido! Produto não adicionado!"); break;
				} else if (mochila.getPesoAtual() + produto.getPeso() > limiteCarga) {
					System.out.println("Não posso carregar mais peso que isso! Produto não adicionado!"); break;
				} else if (mochila.getVolumeAtual()+1 > mochila.inv.length-1) {
					System.out.println("Volume da mochila excedido! Produto não adicionado!"); break;
				} else {
					mochila.inv[i] = produto; 
					mochila.setPesoAtual(produto.getPeso());
					gasto += produto.getPreco();
					mochila.setVolumeAtual(1);
					System.out.println(produto.getNome() + " adicionado à mochila");
					break;
				}
			}
		}
	}
	
	public void verMochila() {
		boolean vazia = true;
		System.out.println("Na mochila tenho:");
		for(int i = 0; i < mochila.inv.length-1; i++) {
			if(mochila.inv[i] != null) {
				System.out.printf("Índice: %d | Código: %d | Nome: %s | Preço: %f | Peso: %f\n"
						, i, mochila.inv[i].getCod(), mochila.inv[i].getNome(), 
						mochila.inv[i].getPreco(), mochila.inv[i].getPeso());
				vazia = false;
			}
		}
		if(vazia) System.out.println("Absolutamente nada!");
		else verLimites();
	}
	
	public void verLimites() {
		System.out.println("Meus limites:");
		System.out.printf("Orçamento: %.2f / %.2f reais\n", Pessoa.gasto, Pessoa.orcamento);
		System.out.printf("Meu limite de peso: %.3f / %.3f gramas\n", mochila.getPesoAtual(), Pessoa.limiteCarga);
		System.out.printf("Limite de peso da mochila: %.3f / %.3f gramas\n", mochila.getPesoAtual(), mochila.getLimitePeso());
		System.out.printf("Limite de volumes da mochila: %d / %d volumes\n", mochila.getVolumeAtual(), mochila.inv.length);
	}
	
	public void retiraProduto() {
		verMochila();
		System.out.println("Digite o índice do produto a ser retirado:");
		int prod = Exer06.tecla.nextInt();
		boolean found = false;
		for(int i = 0; i < mochila.inv.length-1; i++) {
			if(mochila.inv[i] != null && prod == i) {
				System.out.println("Produto " + mochila.inv[i].getNome() + " sendo retirado...");
				mochila.setPesoAtual(-mochila.inv[i].getPeso());
				gasto -= mochila.inv[i].getPreco();
				mochila.setVolumeAtual(-1);
				mochila.inv[i] = null;
				System.gc();
				System.out.println("Produto retirado com sucesso!");
				found = true;
			}
		}
		if(!found) System.out.println("Produto não encontrado!");
		
	}

}
