package questao_07;

public class Banco {
	private String nome;
	private int cod;
	private Conta[] contas;
	
	public Banco(String nome, int cod) {
		this.nome = nome;
		this.cod = cod;
		this.contas = new Conta[8];
	}
	
	public Conta criaConta(String nome) {
		boolean created = false;
		for(int i = 0; i <= contas.length-1;i++) {
			if (contas[i] == null) {
				String gencod = String.valueOf(this.cod)
								+ String.valueOf(i)
								+ String.valueOf(this.cod%(100+(i+1)));
				int newcod = Integer.parseInt(gencod);
				contas[i] = new Conta(nome, newcod, this, 500.0);
				created = true;
				System.out.printf("Criado: %d %s %.2f %s\n"  
									, contas[i].getCod() , contas[i].getNome()
									, contas[i].getSaldo() , contas[i].getBanco().getNome());
				return contas[i];
			}
		}
		if (!created) System.out.println("Limite máximo de contas alcançado!");
		return null;
	}
	
	public Conta buscaConta(int chave) {
		boolean found = false;
		for(int i = 0; i <= contas.length-1; i++) {
			if(contas[i] != null && chave == i) {
				found = true;
				return contas[i];
			}
		}
		if(!found) System.out.println("Conta não encontrada!");
		return null;
	}

	public String getNome() {
		return nome;
	}

	public int getCod() {
		return cod;
	}
}
