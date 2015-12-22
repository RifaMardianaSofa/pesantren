import java.util.Scanner;  //deklarasi
class kalkulator{
	static int d;
	public static void main (String args[]){  //sting pake (r), arg (s)
		int a, s;
		Scanner input = new Scanner(System.in); //space
		kalkulator calc = new kalkulator(); // space
		System.out.print("Masukan angka pertama : "); //m Kapital (M),stelah system pake (.), system (S)
		a = input.nextInt(); // tambah
		System.out.print("Masukan angka kedua : "); //m Kapital (M), system (S)
		s = input.nextInt();
		calc.tambah(a,s);
		kali(a,s); //
		calc.display("Kali");
	}
	static void tambah (int a, int s){ //T kecil t
		d = a + s;
		display("Tambah");
	}
	static int kali (int a, int s){
		return d = a * s;  // ganti S
	}
	static void display(String stat){
		System.out.print("\n hasil "+stat+"\t: "+d); //space H di ganti kecil(h)
	}
}