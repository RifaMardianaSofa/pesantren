import java.util.Scanner;

public class matriks{
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		int n;
		penjumlahan jumlah = new penjumlahan();
		
		System.out.println("PILIH MENU");
		System.out.println("1. Penjumlahan");
		System.out.println("2. Pengurangan");
		System.out.println("3. Perkalian");
		int menu = input.nextInt();
		
		switch (menu){
			case 1: 
				System.out.println("MATRIKS PENJUMLAHAN");
				System.out.print("Masukkan ordo : ");
				jumlah.tambahan(n) = input.nextInt();
		}
	}
}