import java.util.Scanner;
public class kalkulator{
	static int d;
	public static void main(String args[]){
		int a, s;
		Scanner input = new Scanner (System.in);
		kalkulator calc = new kalkulator();
		System.out.print("Masukan angka pertama : ");
		a=input.nextInt();
		System.out.print("Masukan angka kedua :");
		s=input.nextInt();
		tambah(a,s);
		kali (a,s);
		calc.display("Kali");
		}
		static void tambah (int x, int y){
			d=x+y;
			display("Tambah");
		}
		static int kali(int x, int y){
			return d=x*y;
		}
		static void display(String stat){
			System.out.print("\nHasil "+stat+"\t: "+d);
		}
}