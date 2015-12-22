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
			int mat1[][]=new int[2][2];
			int mat2[][]=new int[2][2];
			int mat3[][]=new int[2][2];
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					System.out.print("Masukan Angka Matriks 1 Baris Ke "+(i+1)+" Kolom Ke "+(j+1)+" : ");
					mat1[i][j]=masukan.nextInt();
				}
				System.out.println();
			}
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					System.out.print("Masukan Angka Matriks 2 Baris Ke "+(i+1)+" Kolom Ke "+(j+1)+" : ");
					mat2[i][j]=masukan.nextInt();
				}
				System.out.println();
			}
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				mat3[i][j]=mat1[i][j]+mat2[i][j];
			}
			System.out.println("Maka Hasil Perhitungannya :");
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					System.out.print(mat1[i][j]+"+"+mat2[i][j]+"="+mat3[i][j]+" ");
				}
				System.out.println();
			}
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					System.out.print(mat3[i][j]+" ");
				}
				System.out.println();
			}
			break;
			case 2:
			int mat4[][]=new int[2][2];
			int mat5[][]=new int[2][2];
			int mat6[][]=new int[2][2];
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					System.out.print("Masukan Angka Matriks 1 Baris Ke "+(i+1)+" Kolom Ke "+(j+1)+" : ");
					mat4[i][j]=masukan.nextInt();
				}
				System.out.println();
			}
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					System.out.print("Masukan Angka Matriks 2 Baris Ke "+(i+1)+" Kolom Ke "+(j+1)+" : ");
					mat5[i][j]=masukan.nextInt();
				}
				System.out.println();
			}
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				mat6[i][j]=mat4[i][j]-mat5[i][j];
			}
			System.out.println("Maka Hasil Perhitungannya :");
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					System.out.print(mat4[i][j]+"-"+mat5[i][j]+"="+mat6[i][j]+" ");
				}
				System.out.println();
			}
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					System.out.print(mat6[i][j]+" ");
				}
				System.out.println();
			}
			break;
			case 3:
			int mat7[][]=new int[2][2];
			int mat8[][]=new int[2][2];
			int mat9[][]=new int[2][2];
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					System.out.print("Masukan Angka Matriks 1 Baris Ke "+(i+1)+" Kolom Ke "+(j+1)+" : ");
					mat7[i][j]=masukan.nextInt();
				}
				System.out.println();
			}
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					System.out.print("Masukan Angka Matriks 2 Baris Ke "+(i+1)+" Kolom Ke "+(j+1)+" : ");
					mat8[i][j]=masukan.nextInt();
				}
				System.out.println();
			}
			for(int i=0;i<2;i++)
			{
				for(int k=0;k<2;k++)
				{
					mat9[i][k]=0;
					for(int j=0;j<2;j++)
					{
						mat9[i][k]=mat9[i][k]+(mat7[i][j]*mat8[j][k]);
					}
				}
			}
			System.out.println("Maka Hasil Perhitungannya :");
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					System.out.print(mat9[i][j]+" ");
				}
				System.out.println();
			}
		}	
	}
}