import java.util.Scanner;
public class Kalkulator2
{
	public static int d;
	public static void main(String[]args) 
	{
		int a,s;
		Scanner input=new Scanner(System.in); 
		kalkulator calc= new kalkulator(); 
		System.out.print("Masukkan angka pertama :");
		a=input.nextInt();
		System.out.print("Masukkan angka kedua : ");
		s=input.nextInt();
		calc.tambah(a,s);
		kali(a,s);
		calc.Display("Kali");
	}	
	static void tambah(int x,int y)
	{
		d=x+y;
		display("Tambah");
	}
	static int kali(int x,int y)
	{
		return d=x*y;	
	}
	static void display(String stat)
	{
		System.out.print("\nHasil "+stat+"\t: "+d);
	}
}