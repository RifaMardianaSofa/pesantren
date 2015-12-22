import java.util.Scanner;
	public class Perkalian {
		public static void main (String[]args) {
		Scanner input = new Scanner (System.in);
		System.out.print ("Masukan jumlah ordo :");
		int ordo = input.nextInt();
		int [][] array1=new int [ordo][ordo];
		int [][] array2=new int [ordo][ordo];
		int [][] hasil=new int [ordo][ordo];
		
		System.out.println ("Penjumlahan");
		
		for (int i=0; i<ordo; i++) {
		for (int j=0; j<ordo; j++) {
		System.out.print ("Masukan nilai matriks ["+i+"],["+j+"]");
		array1[i][j]=input.nextInt();
		}
		System.out.println();
		}
		
		
		for (int i=0; i<ordo; i++) {
		for (int j=0; j<ordo; j++) {
		System.out.print ("Masukan nilai matriks ["+i+"],["+j+"]");
		array2[i][j]=input.nextInt();
		}
		System.out.println ();
		}
		
		for (int i=0; i<ordo; i++) {
		for (int j=0; j<ordo; j++) {
		hasil[i][j]= array1[i][j]*array2[i][j];
		}
		}
		
		for (int i=0; i<ordo; i++) {
		for (int j=0; j<ordo; j++) {
		System.out.print (hasil[i][j]+"\t");
		}
		System.out.println();
		}
		}
		}
		