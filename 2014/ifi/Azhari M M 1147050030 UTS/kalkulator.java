import java.util.Scanner;//tambah import Scanner
class kalkulator{
	static int d;
	public static void main(String[]args){// tambah main method (public static) dan satic digannti static
		int a,s;
		Scanner input=new Scanner(System.in);//System.in
		kalkulator calc=new kalkulator();
		System.out.print("Masukkan angka pertama : ");//System.out.print
		a=input.nextInt();//ditambah () 
		System.out.print("Masukkan angka kedua : ");//I pada print tidak kapital
		s= input.nextInt();
		calc.tambah(a,s);
		calc.kali(a,s);//tambah semicolon(;) & objek calc
		calc.display("kali");//huruf d pada display tidak kapital
		
		
	}
	static void tambah(int x, int y){
		d=x+y;
		display("Tambah");
	}
	static int kali(int x,int y){
		
		return d=x*y;
	}
	static void display(String stat){
		System.out.print("\nHasil "+stat+"\t: "+d);//tambah simbol(+) diantara stat (+stat+)
	}
}