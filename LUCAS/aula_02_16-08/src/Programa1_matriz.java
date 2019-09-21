public class Programa1_matriz {
	public static void main(String[] args) {
		
		int[][] m = new int[3][4];
		char[][] n = new char[2][2];
		int j = 1;
		
		for(int i = 0;i < 3;i++) {
			m[i][j] = 2;
			m[i][j+2] = 2;
			m[i][j-1] = 1;
			m[i][j+1] = 1;
		}
		for(int i = 0;i < n.length;i++) {
			for(j = 0;j < n[i].length;j++) {
				if(i==j) n[i][j] = 'A';
				else n[i][j] = 'Z';
			}
		}
		
		for(int i = 0;i < m.length;i++) {
			for(j = 0;j < m[i].length;j++) {
				System.out.println(m[i][j]);
			}
		}
		for(int i = 0;i < n.length;i++) {
			for(j = 0;j < n[i].length;j++) {
				System.out.println(n[i][j]);
			}
		}
		
	}
}
