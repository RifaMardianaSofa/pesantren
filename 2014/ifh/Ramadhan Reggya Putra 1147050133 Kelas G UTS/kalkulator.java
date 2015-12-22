class kalkulator{ / harus ada public class
	static int d;
	static void main(String args[]){ / public static void main (String[]args)
		int a, s;
		Scanner input = new Scanner (Sytem.in);/(System.in) dan kalau ada ini harus ada class import java.util.Scanner;
		kalkulator calc = new kalkulator();
		Systemout.print("Masukan angka pertama : "); /seharusnya System.out.print
		a=input.nextInt; /harusnya a=input.nextInt();
		System.out.prInt("Masukan angka kedua :"); / seharusnya System.out.print
		s=input.nextInt();
		calc.tambah(a,s); / tidak perlu ada calc.
		kalI (a,s) / harusnya kali "I" nya jadi "i"
		calc.Display("Kali"); /huruf "D" nya seharusnya huruf kecil "d" 
		}
		static void tambah (int x, int y){
			d=x+y;
			display("Tambah");
		}
		static int kali(int x, int y){
			return d=x*y;
		}
		static void display(String stat){
			System.out.print("\nHasil "stat+"\t: "+d); /harusnya "+stat+"
		}
}