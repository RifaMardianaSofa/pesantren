import java.util.Scanner;
public class PenjumlahanMatrixAjah{
	public static void main(String[] args){

	int i, j, n, m,pil;
	Scanner scan = new Scanner(System.in);
	
	System.out.println("=====================");
	System.out.println("---PROGRAM MATRIXS---");
	System.out.println("=====================\n");
	System.out.println("Masukan Ordo N x M\n");
	System.out.print("Masukan Ordo N : ");
	n = scan.nextInt();
	System.out.print("Masukan Ordo M : ");
	m = scan.nextInt();
	System.out.print("\n");

	int[][] matrixA = new int[n][m];
	int[][] matrixB = new int[n][m];
	int[][] jumlahMatrix = new int[n][m];
	int[][] kurangMatrix = new int[n][m];
	
	System.out.println("Pilih jenis perhitungan : ");
	System.out.println("1. Penjumlahan");
	System.out.println("2. Pengurangan");
	System.out.println("3. Perkalian");
	pil = scan.nextInt();
	System.out.println("Masukkan pilihan: "+pil);
	
	
		for(i = 0; i < n; i++){

			for(j = 0; j < m; j++){

				System.out.print("Matrix A " + i + " = ");
				matrixA[i][j] = scan.nextInt();
			}
		}
	
	System.out.println();

		for(i = 0; i < n; i++){

			for(j = 0; j < m; j++){

				System.out.print("Matrix B " + i + " = ");
				matrixB[i][j] = scan.nextInt();
			}
		}

	System.out.println("Nilai Matrix A : ");

		for(i = 0; i < n; i++){

			for(j = 0; j < m; j++){

				System.out.print(matrixA[i][j] + " ");
			}

			System.out.println(" ");
		}

	System.out.println("\nNilai Matrix B : ");

		for(i = 0; i < n; i++){

			for(j = 0; j < m; j++){

				System.out.print(matrixB[i][j] + " ");
			}

			System.out.println(" ");
		}

		for(i = 0; i < n; i++){

			for(j = 0; j < m; j++){

				jumlahMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
			}

		}

	System.out.println("\nMatrix A + Matrix B\n");

		for(i = 0; i < n; i++){

			for(j = 0; j < m; j++){

				System.out.print(" " + jumlahMatrix[i][j]);
			}

			System.out.println();
		}
	}
}
