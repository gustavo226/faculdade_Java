package questao_08;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Exer08 {
	static Scanner tecla = new Scanner(System.in);
	static SimpleDateFormat FORMATO = new SimpleDateFormat("dd/MM/yyyy");
	
	public static void main(String[] args) throws Exception{
		MetodoToString ss = new MetodoToString();
		Date data = FORMATO.parse(ss.toString());
		Date hoje = new Date();
		hoje = FORMATO.parse(FORMATO.format(hoje));
		System.out.println("Sua data formatada: " + data);
		System.out.println("Data de hoje: " + hoje);
		System.out.println("Comparando o retorno foi: " + compara(data, hoje));
	}
	
	public static int compara(Date data, Date hoje) {
		return data.compareTo(hoje);
	}
	
}
