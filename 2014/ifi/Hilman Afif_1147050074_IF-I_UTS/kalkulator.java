//kurang: import java.util.Scanner;
class kalkulator
{
	static int d;
	satic void main(Sting arg[]) //eharusnya: static void main(String[]args)
	{
		int a,s;
		Scanner input=new Scanner(Sytem.in); //Seharusnya: (System.in)
		kalkulator calc= new kalkulator(); 
		Systemout.print("Masukkan angka pertama :"); //System.out.print
		a=input.nextInt; //seharusnya: a=input.nextInt();
		System.out.print("Masukkan angka kedua : ");
		s=input.nextInt();
		calc.tambah(a,s);
		kalI(a,s) //Seharusnya kali(a,s)
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
		System.out.print("\nHasil "stat+"\t: "+d); 
	}
}