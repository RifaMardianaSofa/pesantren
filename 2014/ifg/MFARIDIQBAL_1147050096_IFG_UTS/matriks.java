import java.util.Scanner;
public class matriks
{
	public static void main(String[]args)
	{
		Scanner masukan=new Scanner(System.in);
		System.out.println("Program Perhitungan Matriks");
		System.out.println("Pilih 1 Untuk Pertambahan");
		System.out.println("Pilih 2 Untuk Pengurangan");
		System.out.println("Pilih 3 untuk Perkalian");
		System.out.print("Pilih Operasi Yang Diinginkan : ");
		int pilih=masukan.nextInt();
		switch(pilih)
		{
			case 1:
			System.out.print("Masukan Ordo Baris Matriks : ");
			int a=masukan.nextInt();
			System.out.print("Masukan Ordo Kolom Matriks : ");
			int b=masukan.nextInt();
			int mat1[][]=new int[a][b];
			int mat2[][]=new int[a][b];
			int mat3[][]=new int[a][b];
			for(int i=0;i<a;i++)
			{
				for(int j=0;j<b;j++)
				{
					System.out.print("Masukan Angka Matriks 1 Baris Ke "+(i+1)+" Kolom Ke "+(j+1)+" : ");
					mat1[i][j]=masukan.nextInt();
				}
				System.out.println();
			}
			for(int i=0;i<a;i++)
			{
				for(int j=0;j<b;j++)
				{
					System.out.print("Masukan Angka Matriks 2 Baris Ke "+(i+1)+" Kolom Ke "+(j+1)+" : ");
					mat2[i][j]=masukan.nextInt();
				}
				System.out.println();
			}
			for(int i=0;i<a;i++)
			{
				for(int j=0;j<b;j++)
				mat3[i][j]=mat1[i][j]+mat2[i][j];
			}
			System.out.println("Maka Hasil Perhitungannya :");
			for(int i=0;i<a;i++)
			{
				for(int j=0;j<b;j++)
				{
					System.out.print(mat1[i][j]+"+"+mat2[i][j]+"="+mat3[i][j]+" ");
				}
				System.out.println();
			}
			for(int i=0;i<a;i++)
			{
				for(int j=0;j<b;j++)
				{
					System.out.print(mat3[i][j]+" ");
				}
				System.out.println();
			}
			break;
			case 2:
			System.out.print("Masukan Ordo Baris Matriks : ");
			int c=masukan.nextInt();
			System.out.print("Masukan Ordo Kolom Matriks : ");
			int d=masukan.nextInt();
			int mat4[][]=new int[c][d];
			int mat5[][]=new int[c][d];
			int mat6[][]=new int[c][d];
			for(int i=0;i<c;i++)
			{
				for(int j=0;j<d;j++)
				{
					System.out.print("Masukan Angka Matriks 1 Baris Ke "+(i+1)+" Kolom Ke "+(j+1)+" : ");
					mat4[i][j]=masukan.nextInt();
				}
				System.out.println();
			}
			for(int i=0;i<c;i++)
			{
				for(int j=0;j<d;j++)
				{
					System.out.print("Masukan Angka Matriks 2 Baris Ke "+(i+1)+" Kolom Ke "+(j+1)+" : ");
					mat5[i][j]=masukan.nextInt();
				}
				System.out.println();
			}
			for(int i=0;i<c;i++)
			{
				for(int j=0;j<d;j++)
				mat6[i][j]=mat4[i][j]-mat5[i][j];
			}
			System.out.println("Maka Hasil Perhitungannya :");
			for(int i=0;i<c;i++)
			{
				for(int j=0;j<d;j++)
				{
					System.out.print(mat4[i][j]+"-"+mat5[i][j]+"="+mat6[i][j]+" ");
				}
				System.out.println();
			}
			for(int i=0;i<c;i++)
			{
				for(int j=0;j<d;j++)
				{
					System.out.print(mat6[i][j]+" ");
				}
				System.out.println();
			}
			break;
			case 3:
			System.out.print("Masukan Ordo Baris Matriks : ");
			int e=masukan.nextInt();
			System.out.print("Masukan Ordo Kolom Matriks : ");
			int f=masukan.nextInt();
			int mat7[][]=new int[e][f];
			int mat8[][]=new int[e][f];
			int mat9[][]=new int[e][f];
			for(int i=0;i<e;i++)
			{
				for(int j=0;j<f;j++)
				{
					System.out.print("Masukan Angka Matriks 1 Baris Ke "+(i+1)+" Kolom Ke "+(j+1)+" : ");
					mat7[i][j]=masukan.nextInt();
				}
				System.out.println();
			}
			for(int i=0;i<e;i++)
			{
				for(int j=0;j<f;j++)
				{
					System.out.print("Masukan Angka Matriks 2 Baris Ke "+(i+1)+" Kolom Ke "+(j+1)+" : ");
					mat8[i][j]=masukan.nextInt();
				}
				System.out.println();
			}
			for(int i=0;i<e;i++)
			{
				for(int k=0;k<e;k++)
				{
					mat9[i][k]=0;
					for(int j=0;j<f;j++)
					{
						mat9[i][k]=mat9[i][k]+(mat7[i][j]*mat8[j][k]);
					}
				}
			}
			System.out.println("Maka Hasil Perhitungannya :");
			for(int i=0;i<e;i++)
			{
				for(int j=0;j<f;j++)
				{
					System.out.print(mat9[i][j]+" ");
				}
				System.out.println();
			}
		}	
	}
}