import java.util.Scanner;
public class OperasiMatrik
{
	public static void main(String[] args){

	int i, j, n, m,pil;
	Scanner scan = new Scanner(System.in);
	
	int[][] matrixA = new int[2][2];
	int[][] matrixB = new int[2][2];
	int[][] jumlahMatrix = new int[2][2];
	int[][] kurangMatrix = new int[2][2];
	
	System.out.println("Pilih jenis perhitungan : ");
	System.out.println("1. Penjumlahan");
	System.out.println("2. Pengurangan");
	System.out.println("3. Perkalian");
	System.out.println();
	System.out.print("Pilihan : ");
	Scanner no = new Scanner(System.in);
	pil = no.nextInt();
	System.out.println();
	switch(pil){
		case 1 : 
	
		for(i = 0; i < 2; i++){

			for(j = 0; j < 2; j++){

				System.out.print("Matrik A kolom ke-" + i + " baris ke-"+j+" = ");
				matrixA[i][j] = scan.nextInt();
			}
		}
	
	System.out.println();

		for(i = 0; i < 2; i++){

			for(j = 0; j < 2; j++){

				System.out.print("Matrik B kolom ke-" + i + " baris ke"+j+" = ");
				matrixB[i][j] = scan.nextInt();
			}
		}

	System.out.println("Nilai Matrik A : ");

		for(i = 0; i < 2; i++){

			for(j = 0; j < 2; j++){

				System.out.print(matrixA[i][j] + " ");
			}

			System.out.println(" ");
		}

	System.out.println("\nNilai Matrik B : ");

		for(i = 0; i < 2; i++){

			for(j = 0; j < 2; j++){

				System.out.print(matrixB[i][j] + " ");
			}

			System.out.println(" ");
		}

		for(i = 0; i < 2; i++){

			for(j = 0; j < 2; j++){

				jumlahMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
			}

		}

		System.out.println("\nMatrik A + Matrik B\n");

		for(i = 0; i < 2; i++){

			for(j = 0; j < 2; j++){

				System.out.print(" " + jumlahMatrix[i][j]);
			}

			System.out.println();
			break;
		}
	
		break;
	
		case 2 :
			for(i = 0; i < 2; i++){
			
				for(j = 0; j < 2; j++){

				System.out.print("Matrik A baris ke-" + i+"Kolom ke"+j+ " = ");
				matrixA[i][j] = scan.nextInt();
				}
			}
	
			System.out.println();

			for(i = 0; i < 2; i++){

				for(j = 0; j < 2; j++){

				System.out.print("Matrik B baris ke-" + i+"Kolom ke"+j+ " = ");
				matrixB[i][j] = scan.nextInt();
				}
			}

		System.out.println("Nilai Matrik A : ");

			for(i = 0; i < 2; i++){
	
				for(j = 0; j < 2; j++){

				System.out.print(matrixA[i][j] + " ");
				}

			System.out.println(" ");
			}

		System.out.println("\nNilai Matrik B : ");

			for(i = 0; i < 2; i++){
	
				for(j = 0; j < 2; j++){

				System.out.print(matrixB[i][j] + " ");
			}

			System.out.println(" ");
		}

			for(i = 0; i < 2; i++){

				for(j = 0; j < 2; j++){

				jumlahMatrix[i][j] = matrixA[i][j] - matrixB[i][j];
				}

			}	

		System.out.println("\nMatrik A - Matrik B\n");

			for(i = 0; i < 2; i++){

				for(j = 0; j < 2; j++){

				System.out.print(" " + jumlahMatrix[i][j]);
				}

			System.out.println();
			break;
			}
		break;			

		case 3 :
				for(i = 0; i < 2; i++){
			
				for(j = 0; j < 2; j++){

				System.out.print("Matrik A baris ke-" + i+"Kolom ke"+j+ " = ");
				matrixA[i][j] = scan.nextInt();
				}
			}
	
			System.out.println();

			for(i = 0; i < 2; i++){

				for(j = 0; j < 2; j++){

				System.out.print("Matrik B baris ke-" + i+"Kolom ke"+j+ " = ");
				matrixB[i][j] = scan.nextInt();
				}
			}

		System.out.println("Nilai Matrik A : ");

			for(i = 0; i < 2; i++){
	
				for(j = 0; j < 2; j++){

				System.out.print(matrixA[i][j] + " ");
				}

			System.out.println(" ");
			}

		System.out.println("\nNilai Matrik B : ");

			for(i = 0; i < 2; i++){
	
				for(j = 0; j < 2; j++){

				System.out.print(matrixB[i][j] + " ");
			}

			System.out.println(" ");
		}

			for(i = 0; i < 2; i++){

				for(j = 0; j < 2; j++){

				jumlahMatrix[i][j] = matrixA[i][j] * matrixB[i][j];
				}

			}	

		System.out.println("\nMatrik A * Matrik B\n");

			for(i = 0; i < 2; i++){

				for(j = 0; j < 2; j++){

				System.out.print(" " + jumlahMatrix[i][j]);
				}

			System.out.println();
			break;
			}
		break;	
		
		default : System.out.println("Tidak ada dalam pilihan");
		}
	}
}