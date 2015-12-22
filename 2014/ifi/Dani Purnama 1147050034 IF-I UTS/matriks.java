import java.util.Scanner;
	public class matriks{
		public static void main (String[]args){
		Scanner masuk = new Scanner (System.in);
		int n=2;
		int m=2;
		System.out.println ("penjumlahan 2x2");
		int matrikA[][] = new int [n][m];
		int matrikB[][] = new int [n][m];
		int i,j;
		int hasil[][] = new int [n][m];
		
		//pemasukkan angka
		for (i=0; i<n; i++)
		{
			for (j=0; j<m; j++)
			{
				System.out.print ("Matrik A [" +i+ "],["+j+"] : ");
				matrikA[i][j] = masuk.nextInt();
			}
			System.out.println();
		}
		// tampilan angka
		System.out.println ("tampilan matrik A");
		for (i=0; i<n; i++)
		{
			for (j=0; j<m; j++)
			{
				System.out.print (matrikA[i][j] +" ");
			}
			System.out.println();
		}
		
		//pemasukkan angka
		for (i=0; i<n; i++)
		{
			for (j=0; j<m; j++)
			{
				System.out.print ("Matrik B [" +i+ "],["+j+"] : ");
				matrikB[i][j] = masuk.nextInt();
			}
			System.out.println();
		}
		// tampilan angka
		System.out.println ("tampilan matrik B");
		for (i=0; i<n; i++)
		{
			for (j=0; j<m; j++)
			{
				System.out.print (matrikB[i][j] +" ");
			}
			System.out.println();
		}
		//penjumlahan
		for (i=0; i<n; i++)
		{
			for (j=0; j<m; j++)
			{
				hasil[i][j] = matrikA[i][j] + matrikB[i][j];
			}
		}
		// tampilan angka
		System.out.println ("tampilan hasil penjumlahan");
		for (i=0; i<n; i++)
		{
			for (j=0; j<m; j++)
			{
				System.out.print (hasil[i][j] +" ");
			}
			System.out.println();
		}
		
		//pengurangan
		for (i=0; i<n; i++)
		{
			for (j=0; j<m; j++)
			{
				hasil[i][j] = matrikA[i][j] - matrikB[i][j];
			}
		}
		// tampilan angka
		System.out.println ("tampilan hasil pengurangan");
		for (i=0; i<n; i++)
		{
			for (j=0; j<m; j++)
			{
				System.out.print (hasil[i][j] +" ");
			}
			System.out.println();
		}
		
		//perkalian
		for (i=0; i<n; i++)
		{
			for (j=0; j<m; j++)
			{
				hasil[i][j] = matrikA[i][j] * matrikB[i][j];
			}
		}
		// tampilan angka
		System.out.println ("tampilan hasil perkalian");
		for (i=0; i<n; i++)
		{
			for (j=0; j<m; j++)
			{
				System.out.print (hasil[i][j] +" ");
			}
			System.out.println();
		}
		}
	}
		
		