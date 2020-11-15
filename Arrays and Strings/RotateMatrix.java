
public class RotateMatrix {

	public static void main(String[] args) {

		int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int mat2[][] = new int[mat.length][mat.length];
		int k = mat.length-1;
		int temp = 0;

		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat.length && k >= 0; j++) {

				mat2[j][k] = mat[i][j];

			}
			k--;

		}
		
		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat.length; j++) {

				System.out.print(mat2[i][j] + " ");

			}
			System.out.println("");
		}

	}

}
