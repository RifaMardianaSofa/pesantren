import java.util.Scanner;
public class matrik{
public static void main(String [] args){
		Scanner scan=new Scanner (System.in);
		int i;
		int j;
		
		int [][] matrikA= new int [2][2];
		int [][] matrikB= new int [2][2];
		int [][] matrikjumlah= new int [2][2];
		int [][] matrikkurang= new int [2][2];
		
		for (i=0; i<2; i++)
		{
			for (j=0; j<2; j++)
			{
			System.out.print("matrik A"+i+ "." +j+"=");
			matrikA [i][j]= scan.nextInt();
			}
		}
		System.out.println();
		
		for (i=0; i<2; i++)
		{
			for (j=0;j<2;j++)
			{
				System.out.print("matrik B"+i+ "." +j+"=");
				matrikB [i][j]= scan.nextInt();
			}
		}
		for (i=0; i<2; i++)
		{
			for (j=0; j<2; j++)
			{
			matrikjumlah [i][j]= matrikA[i][j]+matrikB [i][j];
			}
		}
		System.out.println("\n matrik A + matrik B\n");
			for (i=0; i<2; i++)
			{
				for (j=0; j<2; j++)
				{
					System.out.print(" "+matrikjumlah [i][j]);
				}
				System.out.println();
				
		for (i=0; i<2; i++)
		{
			for (j=0; j<2; j++)
			{
			matrikkurang [i][j]= matrikA[i][j]-matrikB [i][j];
			}
		}
		System.out.println("\n matrik A - matrik B\n");
			for (i=0; i<2; i++)
			{
				for (j=0; j<2; j++)
				{
					System.out.print(" "+matrikkurang [i][j]);
				}
				System.out.println();
				}
			}
			}
		}