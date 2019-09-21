
public class App2 {

	public static void main(String[] args) { //F3 aponta para método sendo utilizado
		int arr[] = {1,2,3};
		double vari = App.calcular(2);		//CTRL + O busca métodos dentro da classe
		int fac = 0;						//CTRL + H busca palavras dentro dos arquivos do projeto
		int matriz[][] = new int[4][4];
		
		for (int i=0;i<arr.length;i++) {
			vari = App.calcular(arr[i]);
			System.out.println("Arr: " + vari);
		}
		
		for (int i=0;i<arr.length;i++) {
			fac = fac + arr[i];
		}
		System.out.println("Factorial: " + fac);
		
		for(int i=1;i<=3;i++) {
			for (int j=1;j<=3;j++) {
				matriz[i][j] = i+j;
				System.out.println("Linha: " + i + " Coluna: " + j + " Soma: " + matriz[i][j]);
			}
		}
		
		boolean doriaNoMaraca = true;
		if (doriaNoMaraca) System.out.println("Mengão ganha");
		else System.out.println("Mengão ganha do mesmo jeito porra!");
		
		String nome = "Mengão campeão da libertadores 2019";
		
		if (nome.contains("Mengão")) System.out.println("SIM");
		else System.out.println("NAO");
		
	}

}
