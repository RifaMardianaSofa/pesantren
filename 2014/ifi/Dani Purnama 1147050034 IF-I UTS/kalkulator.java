// perbaikan import java.util.Scanner;
class kalkulator{
	static int d;
	satic void main (String arg[]){ //perbaikan public static void main (String []args){
		int a,s;
		Scanner input = new Scanner (System.in);
		kalkulator calc = new kalkulator();
		Systemout.print ("Masukkan angka pertama : "); //perbaikan System.out.print ("Masukkan angka pertama : ");
		a = input.nextInt; // a = input.nextInt();
		System.out.prInt ("Masukkan angka kedua : "); //perbaikan System.out.print ("Masukkan angka kedua : ");
		s = input.nextlnt(); // perbaikan s = input.nextInt();
		calc.tambah (a,s);
		kalI (a,s) // perbaikan kali (a,s);
		calc.Display ("Kali"); // perbaikan calc.display ("Kali");
	}
	static void tambah (int x, int y){
		d = x + y;
		display ("Tambah");
	}
	static int kali (int x, int y){
		return d = x * y;
	}
	static void display (String stat){
		System.out.print ("\nHasil "stat+"\t: "+d);//perbaikan System.out.print ("\nHasil "+stat+"\t: "+d);
	}
}