import java.util.Scanner;

public class hitungmatriks{
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		
		int x,y,z;
		
		System.out.print("Masukkan jumlah ordo : ");
		int m = input.nextInt();
		tambah(m);
		kurang(m);
	}
	
	public static void tambah (int m){
		int[][] matA = new int [m][m];
		int[][] matB = new int [m][m];
		int[][] jumlahMat = new int [m][m];
		
		System.out.println("MATRIKS A");
		for (x=0;x<m;x++){
			for (y=0;y<m;y++){
				System.out.print("Masukkan baris ke " +(x+1)+ " kolom ke " +(y+1)+ " ");
				matA [x][y] = input.nextInt();
			}
		System.out.println();
		}
		
		System.out.println("MATRIKS B");
		for (x=0;x<m;x++){
			for (y=0;y<m;y++){
				System.out.print("Masukkan baris ke " +(x+1)+ " kolom ke " +(y+1)+ " ");
				matB [x][y] = input.nextInt();
			}
		System.out.println();
		}
		
		for (x=0;x<m;x++){
			for(y=0;y<m;y++){
				System.out.print(matA[x][y]+ "\t");
			}
			System.out.println();
		}
		System.out.println();
		for (x=0;x<m;x++){
			for(y=0;y<m;y++){
				System.out.print(matB[x][y]+ "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Penjumnlahan matriks A+B");
		for (x=0;x<m;x++){
			for(y=0;y<m;y++){
				jumlahMat[x][y] = matA[x][y] + matB[x][y];
			}
		}
		for (x=0;x<m;x++){
			for(y=0;y<m;y++){
				System.out.print(jumlahMat[x][y]+ "\t");
			}
			System.out.println();
		}
	}
	
	public static void kurang (int m){
			//System.out.print("Masukkan jumlah ordo : ");
			//int m = input.nextInt();
			int[][] matriksA = new int [m][m];
			int[][] matriksB = new int [m][m];
			int[][] jumlahMatriks = new int [m][m];
			
			System.out.println("MATRIKS A");
			for (x=0;x<m;x++){
				for (y=0;y<m;y++){
					System.out.print("Masukkan baris ke " +(x+1)+ " kolom ke " +(y+1)+ " ");
					matriksA [x][y] = input.nextInt();
				}
			System.out.println();
			}
			
			System.out.println("MATRIKS B");
			for (x=0;x<m;x++){
				for (y=0;y<m;y++){
					System.out.print("Masukkan baris ke " +(x+1)+ " kolom ke " +(y+1)+ " ");
					matriksB [x][y] = input.nextInt();
				}
			System.out.println();
			}
			
			for (x=0;x<m;x++){
				for(y=0;y<m;y++){
					System.out.print(matriksA[x][y]+ "\t");
				}
				System.out.println();
			}
			System.out.println();
			for (x=0;x<m;x++){
				for(y=0;y<m;y++){
					System.out.print(matriksB[x][y]+ "\t");
				}
				System.out.println();
			}
			
			System.out.println();
			System.out.println("Penjumnlahan matriks A+B");
			for (x=0;x<m;x++){
				for(y=0;y<m;y++){
					jumlahMatriks[x][y] = matriksA[x][y] - matriksB[x][y];
				}
			}
			for (x=0;x<m;x++){
				for(y=0;y<m;y++){
					System.out.print(jumlahMatriks[x][y]+ "\t");
				}
				System.out.println();
			}
	}
}
