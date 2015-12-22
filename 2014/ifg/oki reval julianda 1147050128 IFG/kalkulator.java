import java.util.Scanner;
class kalkulator{
	static int d;
	public static void main(String[] args) {
	int a,s;
	Scanner input = new Scanner (System.in);
	kalkulator calc = new kalkulator ();
	System.out.print("Masuka angka pertama: ");
	{a= input.nextInt();}
	System.out.print("Masukan anka kedua: ");
	{s = input.nextInt();}
	calc.tambah(a,s);
	kali(a,s);
	calc.display("kali");	
	}
	static void tambah (int a,int s){
		d= a+s;
		display ("tambah");
	}
	static void kali (int a,int s){
		d= a*s;

	}
	static void display (String stat){
		System.out.print("\n Hasil"+stat+"\t: "+d);
	}
	
}