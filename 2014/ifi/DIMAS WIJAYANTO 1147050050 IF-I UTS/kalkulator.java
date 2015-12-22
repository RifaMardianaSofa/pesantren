import java.util.Scanner; // yang ditambahkan sebelumnya tidak ada
public class kalkulator{
static int d;
	public static void main(String[]args){
	Scanner input = new Scanner(System.in); // Scanner input  seharusnya di tempakan disini 
		int a,s;
		
		kalkulator calc = new kalkulator();
		System.out.print("Masukan Angka pertama : ");//seharusnya menggunakan titik sehabis System
		a = input.nextInt();
		System.out.print("Masukkan angka kedua : ");//seharusnya print bukan prInt
		s = input.nextInt();
		calc.tambah(a,s);
		calc.kali(a,s);// seharusnya menggunakan calc. sebelum kali
		calc.display("Kali");//display bukan Display
	}
	static void tambah(int x, int y){
		d = x + y;
		display("Tambah");
	}
	static int kali(int x, int y){
		return d = x * y;
	}
	static void display(String stat){
		System.out.print("\nHasil "+stat+"\t: "+d);
	}
}