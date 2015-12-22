import java.util.Scanner;
  public class Matriks 
  {
	public static void main(String[] args)
	{

		//deklarasi data
		Scanner in = new Scanner(System.in);
		
			int i,j,k;
			int[][] matrixA = new int[2][2]; 
			int[][] matrixB = new int[2][2]; 
			int[][] hasilmatrix = new int[2][2];

			//input matrix A
					for(i=0;i<2;i++) 
					{
						for(j=0;j<2;j++) 
						{
							System.out.print("matrix A "+i+" . "+j+" = ");
							matrixA[i][j]=in.nextInt();
						}
					} 
					System.out.println();
			//input matrix B
					for(i=0;i<2;i++)
					{
						for(j=0;j<2;j++)
						{
							System.out.print("matrix B "+i+" . "+j+" = ");
							matrixB[i][j]=in.nextInt();
						}
					}
		System.out.println("Menu");
		System.out.println("1. Penjumlahan");
		System.out.println("2. Perkalian");
		System.out.println("Pilihan : ");
		int pil = in.nextInt();
		switch(pil)
		{	
			//penjumlahan matrix		
			case 1 :
					for(i=0;i<2;i++)
					{
						for(j=0;j<2;j++)
						{ 
							hasilmatrix[i][j] = matrixA[i][j] + matrixB[i][j];
						}
					}
					System.out.println("\nmatrix A + matrix B\n");
					break;
			//perkalian matrix
			case 2:	
					for(i=0;i<2;i++)
					{
						for(j=0;j<2;j++)
						{ 
							for (k=0; k<2; k++)
							{
								hasilmatrix[i][j] = matrixA[i][k] * matrixB[k][j];
							}
						}
					}
					System.out.println("\nmatrix A x matrix B\n");
					break;
			default : System.out.println("Input yang ada aja coy!!!");
								
		}
		
		//tampilan
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(" "+ hasilmatrix[i][j]);
			}
			System.out.println();
		}	
    }
  }
