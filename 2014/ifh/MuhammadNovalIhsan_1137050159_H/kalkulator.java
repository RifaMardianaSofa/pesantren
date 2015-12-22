import java.util.Scanner;   /* tidak memakai (import java) */
class kalkulator{
	public static int d;
	public static void main(String[]args){   /* penulisan sebelumnya dengan (satic void main(sting arg[])) tidak dengan argument(args) dan String*/
		int a, s;
		Scanner input = new Scanner (System.in);
		kalkulator calc = new kalculator ();
		System.out.print("Masukkan angka pertama : ");   /* penulisan tidak benar yaitu (Systemout) */
		a = input.nextInt();
		System.out.print("Masukkan angka kedua : ");
		s = input.nextInt();
		calc.tambah(a,s);
		kalI(a,s);
		calc.Display("Kali");   /* penulisan sebelumnya Display */
	}
	static void tambah(int x, int y){
		d = x+y;
		display("Tambah");
	}
	static int kali (int x, int y) {
		return d = x * y;
	}
	static void display(String stat) {
		System.out.print("\nHasil "+stat+"+\t: "+d);
	}
}