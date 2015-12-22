import java.util.Scanner;
class kalkulator
{
	static int d;
	public static void main (String [] args){			//seharus nya memakai public satic void main dan (String [] args)
	int a,s;
	Scanner input = new Scanner(System.in);
	kalkulator calc = new kalkulator();
	System.out.print("Masukan angka pertama:");
	a=input.nextInt();
	System.out.print("Masukan angka kedua :");
	s= input.nextInt();
	kali(a,s);
	calc.display("kali");
	}
	static void tambah (int x, int y){
	d=x+y;
	display ("Tambah");
	}
	static int kali (int x, int y){
	return d= x*y;
	}
	static void display (String stat){
		System.out.print("\n hasil "+stat);
		System.out.print("\t:"+d);					//untuk memanggil nilai pertambahan atau hasil dari d=x+y
		}
		}
		