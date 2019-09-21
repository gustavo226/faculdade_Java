package test_java;

public class teste {
	public static int dobra(int num) {
		return num*2;
	}
	
	public static void main(String args[]) {
		System.out.println("Hello World!");
		System.out.println("Teste 2 do Bitbucket");
		System.out.println("COMPLIANCE 1.8");
		int test = 6;
		int i = 0;
		if (test >= 5) System.out.println("HIT");
		else System.out.println("NOHIT");
		for (i=1;i<=test;i++) System.out.println("i= " + i);
		int d = dobra(test);
		System.out.println("dobra �... " + d);
	}
}
