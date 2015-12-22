  import java.util.Scanner;
public class matriks{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("Masukkan ordo matriks : ");
		int ordo=input.nextInt();
		int[][]matriks1=new int[ordo][ordo];
		int[][]matriks2=new int[ordo][ordo];
		System.out.println("MATRIKS A");
		
		for(int i=0;i<matriks1.length;i++)
			for(int j=0;j<matriks1[i].length;j++){
				int indeksBaris=i+1;
				int indeksKolom=j+1;
				System.out.print("masukkan elemen baris ke "+indeksBaris+" kolom ke "+indeksKolom);
				matriks1[i][j]=input.nextInt();
			}
			System.out.println();
		System.out.println("MATRIKS B");
		for(int i=0;i<matriks1.length;i++)
			for(int j=0;j<matriks1[i].length;j++){
				int indeksbaris=i+1;
				int indeksKolom=j+1;
				System.out.print("masukkan elemen baris ke "+indeksbaris+" kolom ke "+indeksKolom);
				matriks2[i][j]=input.nextInt();
			}
		int[][] matriksHasil= jumlahMatriks(matriks1,matriks2);
		System.out.println("Penjumlahan Matriks :");
		cetakHasil(matriks1, matriks1, matriksHasil, '+');
		int[][] matriksHasil= kurangMatriks(matriks1,matriks2);
		System.out.println("Perkurangan Matriks :");
		cetakHasil(matriks1, matriks1, matriksHasil, '-');
		int[][] matriksHasil=kaliMatriks(matriks1,matriks2);
		System.out.println("Perkalian Matriks ");
		cetakHasil(matriks1, matriks2, matriksHasil, 'x');
		
	}
}
public static int[][] jumlahMatriks(int[][] matriks1, int[][] matriks2){
	int[][] hasil=new int[matriks1.length][matriks[0].length];
	for(int i=0;i<hasil.length;i++)
		for(int j=0;j<hasil[0].length;j++)
			hasil[i][j]=matriks1[i][j]+matriks2[i][j];
		return hasil;
}
public static int[][] kurangMatriks(int[][] matriks1, int[][] matriks2){
	int[][] hasil=new int[matriks1.length][matriks[0].length];
	for(int i=0;i<hasil.length;i++)
		for(int j=0;j<hasil[0].length;j++)
			hasil[i][j]=matriks1[i][j]-matriks2[i][j];
		return hasil;
}
public static int[][] kaliMatriks(int[][] matriks1, int[][] matriks2){
	int[][] hasil=new int[matriks1.length][matriks[0].length];
	for(int i=0;i<hasil.length;i++)
		for(int j=0;j<hasil[0].length;j++)
			hasil[i][j]=matriks1[i][j]*matriks2[i][j];
		return hasil;
}
public static void cetakHasil(
	int[][] matriks1, int[][]matriks2, int[][] matriks3, char op)
	{
		for(int=0;i<matriks1.length;i++)
		{
			for(int j=0;j<matriks[0].length;j++)
		}
	}
}



