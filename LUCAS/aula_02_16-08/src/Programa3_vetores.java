public class Programa3_vetores {
	public static void main(String[] args) {
		int[] arr_num = new int[10];
		for(int i = 0; i < arr_num.length;i++) {
			if(i%2 == 0) arr_num[i] = 1;
			else arr_num[i] = 0;
		}
		for(int i = 0; i < arr_num.length;i++) System.out.println(arr_num[i]);
	}
}