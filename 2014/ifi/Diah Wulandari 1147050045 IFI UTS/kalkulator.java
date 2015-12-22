import java.util.Scanner;
class kalkulator{
	static int d;
	
	public static void main (String args[]){ //kurang public, seharusnya static bukan satic, String bukan Sting dan args bukan arg
	int a,s;
	Scanner input = new Scanner(System.in);//seharusnya System bukan Sytem
	kalkulator calc = new kalkulator();
	System.out.print("Masukkan angka pertama : ");//seharusnya System.out.print bukan Systemout.print
	a = input.nextInt();//kurang tanda kurung()
	System.out.print("Masukkan angka kedua : ");//huruf I pada prInt tidak besar, yg benar print
	s= input.nextInt();
	calc.tambah (a,s);
	kali(a,s);//kali seharusnya menggunakan huruf kecil semua dengan titik koma
	calc.display("Kali");//display huruf kecil
}
static void tambah (int x,int y){
	d= x + y;
	display("Tambah");
	}
static int kali ( int x, int y){
	return d = x*y;
	}
static void display(String stat){
	System.out.print("\nHasil"+stat);// terlalu banyak perintah, jadi output dipindah ke bawah
	System.out.print("\t: "+d);
	}
}