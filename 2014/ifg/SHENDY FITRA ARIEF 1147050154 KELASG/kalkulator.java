import java.util.*;
class kalkulator{
	static int d;
	public static void main(String[]arg){
	int a, s;
	Scanner input = new Scanner(System.in);
	kalkulator calc = new kalkulator();
	System.out.print("Masukan angka pertama : ");
	a = input.nextInt();
	System.out.print("Masukan angka kedua : ");
	s = input.nextInt();
	calc.tambah(a,s);
	kali(a,s);
	calc.display("kali");
	}
	static void tambah(int a,int s){
		d = a+s;
		display("tambah");
	}
	static int kali(int a,int s){
		return d=a*s;
	}	
	static void display(String stat){
		System.out.print("\nHasil "+stat+"\t: "+d);
	}
}	