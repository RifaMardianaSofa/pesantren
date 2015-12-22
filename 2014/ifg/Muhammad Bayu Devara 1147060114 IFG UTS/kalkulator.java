import java.util.Scanner; //Untuk Metode Masukan//
class kalkulator{
	static int d;
	public static void main(String[] args) {
		int a,s;
		Scanner input = new Scanner (System.in);
		kalkulator calc = new kalkulator(); //Untuk Fungsi Nama Kelas//
		System.out.print(" Masukkan Angka Pertama : ");
		a = input.nextInt(); //Inputan Angka Pertama//
		System.out.print(" Masukkan Angka Kedua : ");
		s = input.nextInt(); //Inputan Angka Kedua//
		calc.tambah (a,s); //Angka Pertama dan Angka Kedua Dimasukkan ke Fungsi Tambah//
		calc.kali(a,s); //Angka Pertama dan Angka Kedua Dimasukkan ke Fungsi Kali//
	}
	static void tambah(int x,int y){
		d = x + y;
		display("Tambah");
	} 								//Fungsi tambah//
	static void kali(int x,int y){
		d = x*y;
		display("Kali");				
	}								//Fungsi Kali//
	static void display(String stat){
		System.out.print("\nHasil  "+stat+"\t: "+d);
	} 								//Fungsi Output//
}