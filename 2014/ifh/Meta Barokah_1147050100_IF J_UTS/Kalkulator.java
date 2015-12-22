import java.util.Scanner; //tidak ada import
public class Kalkulator //tidak ada public & huruf "k" seharusnya besar 
{
 static int d;
public static void main (String[]args)//tidak ada public
{
	int a, s;
	Scanner input = new Scanner(System.in);
	Kalkulator calc = new Kalkulator();
	System.out.print("Masukan Angka Pertama : ");//tidak ada titik
	a=input.nextInt();
	System.out.print("Masukan angka kedua : ");// huruf "i" di print seharusnya besar
	s= input.nextInt();//huruf "i" di Int seharusnya besar
	calc.tambah(a,s);
	kali(a,s);
	calc.display("Kali");//huruf "d" seharusnya kecil
}
public static void tambah(int x, int y){
	d=x+y;
	display("Tambah");
	}
public static int kali(int x, int y){
	return d= x*y;
	}
public static void display(String stat){
	System.out.print("\nhasil "+stat+"\t:"+d);
	}
}
	