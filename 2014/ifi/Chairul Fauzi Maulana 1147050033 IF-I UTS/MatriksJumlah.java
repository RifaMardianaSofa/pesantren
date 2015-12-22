import java.util.Scanner;
class MatriksPenjumlahan {
	int n, jumlah,jumlah2, i, j, hasil;
}
//class method
public class MatriksJumlah {
	public static void main(String[] args) {
		Scanner masuk = new Scanner (System.in);
		System.out.print("Masukan Banyak n :  ");
		n =masuk.nextInt();
		System.out.print("Penjumlahan Matriks  :  "+n+"x"+n);
		int	jumlah [][]=new int[n][n];
			int jumlah2 [][]=new int[n][n];
			int hasil [][]=new int[n][n];
			
			System.out.println();
			System.out.println("Masukan Matriks A :  ");
				for (i=0; i<n; i++)
				{
					for (j=0; j<n; j++){
						System.out.print("Matriks A : ["+(i)+"],["+(j)"+]: ");
						jumlah [i][j] = masuk.nextInt();
					}
					System.out.println();
					System.out.println("Masukan Matriks B :  ");
					
						for (i=0; i<n; i++) 
						{
							for (j=0; j<n; j++){
								System.out.print("Matriks B : ["+(i)+"],["+(j)"+]: ");
									jumlah [i][j] = masuk.nextInt();
					}
				}
			//tampilan matriks A
			System.out.println();
			System.out.println("Matriks A :  ");
			for (i=0; i<n; i++)
				{
					for (j=0; j<n; j++){
		System.out.print(jumlah[i][j]+ " ");
					}
		System.out.println();
				}
				
			//tampilan matriks B
			System.out.println();
			System.out.println("Matriks A :  ");
			for (i=0; i<n; i++)
				{
					for (j=0; j<n; j++){
		System.out.print(jumlah2[i][j]+ " ");
					}
		System.out.println();
				}
		// Operasi Penjumlahan 
		for (i=0; i<n; i++)
				{
					for (j=0; j<n; j++){
						hasil [i][j] = (jumlah [i][j]+jumlah2[i][j]);
					}
				}
				System.out.println((hasil[i][j] = (jumlah[i][j]+jumlah2[i][j]))+" ");
		
	}

	