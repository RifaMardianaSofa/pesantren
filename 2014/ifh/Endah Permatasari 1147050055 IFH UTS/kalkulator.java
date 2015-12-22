import java.util.Scanner;
class kalkulator{
	static int d;
	public static void main (String args[]){//penambahan pada arg menjadi args
		int a, s;
		Scanner input = new Scanner(System.in);
		kalkulator calc = new kalkulator();
		System.out.print("Masukan angka pertama : ");//perbaikan pada System dan out harus ada titik dan ; dan print menggunakan huruf kecil
		a = input.nextInt();//penambahan pada () setelah nextInt;
		System.out.print("Masukan angka kedua : ");//perbaikan pada print menggunakan huruf kecil
		s = input.nextInt();
		calc.tambah(a,s);
		kali(a,s);//perbaikan pada i kecil
		calc.display("Kali");//perbaikan pada penulisan Display menjadi display
	}
	static void tambah (int a, int s){
		d = a + s;//perbaikan pada variable yang akan dipanggil a dan s
		display("Tambah");
	}
	static int kali (int a, int s){//perbaikan pada variabel yang akan dipanggil a dan s
		return d = a * s;//perbaikan pada variabel yang akan dipanggil a dan s
	}
	static void display(String stat){
		System.out.print("\n hasil "+stat+"\t: "+d);//pemanggilan harus menggunakan + pada setiap inputan
	}
}