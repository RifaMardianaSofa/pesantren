import java.util.Scanner; //harus pake import java.util.Scanner;
public class kalkulator { //harusnya pake kata public terelebih dahulu
	static int d;
	public static void main(String arg[]){  ///harusnya pake kata public terelebih dahulu
	int a,s;
	Scanner input=new Scanner (System.in);
	kalkulator calc=new kalkulator();
	System.out.print("Masukan angka pertama:");
	a=input.nextInt(); //harus pake tanda kurung
	System.out.print("Masukan angka kedua:");
	s=input.nextInt();
	calc.tambah(a,s);
	kali(a,s); //harus ada titik koma
	calc.Display("Kali");
	}
	static void tambah(int x,int y){
		d=x+y;
		Display("Tambah");  //coba huruf awal display di ganti jadi Display
	}
	static int kali (int x,int y){
		return d=x*y;
	}
	static void Display(String stat){ //coba huruf awal display di ganti jadi Display
		System.out.println("\nhasil "+stat+"\t:"+d); //yang tdnya System.out.println("\nhasil "stat+"\t:"+d); di ganti jadi System.out.println("\nhasil "+stat+"\t:"+d); di tambah tanda + nya
	}
}
