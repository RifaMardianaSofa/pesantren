import java.util.Scanner;

public class penjumlahan{
	
	static void tambahan(int n){	
		int[][] matA = matA [n][n];
		int[][] matB = matB [n][n];
		int x,y,z;
		Scanner input = new Scanner (System.in);
		
		System.out.println("MATRIKS A");
		for (x=0;x<n;x++){
			for (y=0;y<n;y++){
				System.out.println("Masukkan baris ke " +(x+1)+ " kolom ke " +(y+1)+ " ");
				matA [x][y] = input.nextInt();
			}
		System.out.println();
		}
		
		System.out.println("MATRIKS B");
		for (x=0;x<n;x++){
			for (y=0;y<n;y++){
				System.out.println("Masukkan baris ke " +(x+1)+ " kolom ke " +(y+1)+ " ");
				matB [x][y] = input.nextInt();
			}
		System.out.println();
		}
		
		for (x=0;x<n;x++){
			for(y=0;y<n;y++){
				System.out.print(matA[x][y]+ "\t");
			}
		}
		for (x=0;x<n;x++){
			for(y=0;y<n;y++){
				System.out.print(matB[x][y]+ "\t");
			}
		}
	}
}