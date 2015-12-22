import java.util.Scanner;
public class matrix{
	public static void main(String[]args)
{
		System.out.println();
			Scanner input = new Scanner(System.in);
			int [] []matrixA = new int [2] [2];
			int [] []matrixB = new int [2] [2];
			int [] []jumlahMatrix = new int[2] [2];
			int	[] []perkalian = new int [2] [2];
			int i;
			int j;
			
			System.out.println(" 1. Penjumlahan Matriks ");
			System.out.println(" 2. Pengurangan Matriks ");
			System.out.println(" 3. Perkalian Matriks ");
			int x = input.nextInt();
			if(x==1)
			{
				for(i=0; i<2;	i++)
				{
					for(j=0; j<2; j++)
					{
						System.out.print("Matrix A" + (i) + "." +(j) + "= ");
						matrixA [i] [j] = input.nextInt();
					}
				}
			System.out.println();
				for(i=0; i<2; i++)
				{
					for(j=0; j<2; j++)
					{
					System.out.print("matrix B" + (i) + "."+ (j) + "= ");
					matrixB[i] [j] = input.nextInt();
					}
				}
				for(i=0; i<2; i++)
				{
					for(j=0; j<2; j++)
					{
						jumlahMatrix[i][j] = matrixA[i] [j] + matrixB [i] [j];
					}
				}
			System.out.println("\nMatrix A + Matrix B\n");
				for(i=0; i<2; i++)
				{
					for(j=0; j<2; j++)
					{
						System.out.print(" "+jumlahMatrix[i] [j]);
					}
					System.out.println();
				}
			System.out.println();
			}
			else if (x==2)
			{
			for(i=0; i<2;	i++)
				{
					for(j=0; j<2; j++)
					{
						System.out.print("Matrix A" + (i) + "." +(j) + "= ");
						matrixA [i] [j] = input.nextInt();
					}
				}
			System.out.println();
				for(i=0; i<2; i++)
				{
					for(j=0; j<2; j++)
					{
					System.out.print("matrix B" + (i) + "."+ (j) + "= ");
					matrixB[i] [j] = input.nextInt();
					}
				}
				for(i=0; i<2; i++)
				{
					for(j=0; j<2; j++)
					{
						jumlahMatrix[i][j] = matrixA[i] [j] - matrixB [i] [j];
					}
				}
			System.out.println("\nMatrix A + Matrix B\n");
				for(i=0; i<2; i++)
				{
					for(j=0; j<2; j++)
					{
						System.out.print(" "+jumlahMatrix[i] [j]);
					}
					System.out.println();
				}
			System.out.println();
			}
			
			else if (x==3)
			{
			for(i=0; i<2;	i++)
				{
					for(j=0; j<2; j++)
					{
						System.out.print("Matrix A" + (i) + "." +(j) + "= ");
						matrixA [i] [j] = input.nextInt();
					}
				}
			System.out.println();
				for(i=0; i<2; i++)
				{
					for(j=0; j<2; j++)
					{
					System.out.print("matrix B" + (i) + "."+ (j) + "= ");
					matrixB[i] [j] = input.nextInt();
					}
				}
		perkalian[0] [0] =matrixA[0] [0] * matrixB[0] [0] + matrixA[0] [0] * matrixB[1] [0];
		perkalian[0] [1] =matrixA[0] [0] * matrixB[0] [1] + matrixA[0] [0] * matrixB[1] [1];
		perkalian[1] [0] =matrixA[1] [0] * matrixB[0] [0] + matrixA[0] [1] * matrixB[1] [0];
		perkalian[1] [1] =matrixA[1] [0] * matrixB[0] [1] + matrixA[0] [1] * matrixB[1] [1];
		System.out.println("\nMatrix A * Matrix B \n");
		
				for(i=0; i<2; i++)
				{
					for(j=0; j<2; j++)
					{
						System.out.print(" " + perkalian [i] [j]);
					}
					System.out.println();
				}
		System.out.println();
		}
		else
			System.out.print("Anda salah memasukan Angka ");
		}
	}