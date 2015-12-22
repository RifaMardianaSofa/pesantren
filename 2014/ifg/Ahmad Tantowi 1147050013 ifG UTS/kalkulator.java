import java.util.Scanner;

class kalkulator{
	static int d;
	public static void main (String args[]){			// method main tidak menggunakan "public" di awal method | tidak ada t (satic) dalam static | tidak ada s (arg) dalam arg
		int a, s;
		Scanner input = new Scanner(System.in);
		kalkulator calc = new kalkulator();				// penulisan new calculator yg benar adalah new kalkulator, sesuai dengan nama kelas yg dibuat
		System.out.print("Masukkan angka pertama : ");	// tidak ada tanda titik "." setelah System
		a = input.nextInt();							// tidak ada "()" setelah penulisan input.nextInt 
		System.out.print("Masukkan angka kedua   : ");	// huruf i dalam print sebelumnya menggunakan huruf kapital	
		s = input.nextInt();
		calc.tambah(a,s);
		kali(a,s);										// penulisan untuk memanggil method kali salah, seharusnya menggunakan huruf kecil semua | tidak ada titik koma ";" pada akhir pemggilan method
		calc.display("Kali");							// penulisan display harus dengan huruf kecil semua
	}
	static void tambah(int x, int y){
		d = x + y;
		display("Tambah");
	}
	static int kali (int x, int y){
		return d = x * y;
	}
	static void display(String stat){
		System.out.print("\nHasil " +stat+ "\t: " +d);	//tidak ada "+" sebelum pemanggilan stat
	}
} 