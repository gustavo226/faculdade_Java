
public class Programa1e2_vetores {
	public static void main(String[] args) {
		int[] arr_num = new int[10];
		int[] arr_num2 = new int[10];
		for (int i = 0;i < arr_num.length;i++) arr_num[i] = i+1;
		for (int i = 0;i < arr_num.length;i++) System.out.println(arr_num[i]);
		for (int i = 0;i < arr_num2.length;i++) arr_num2[i] = 30;
		for (int i = 0;i < arr_num2.length;i++) System.out.println(arr_num2[i]);
	}
}
