import java.util.Scanner; //perbaikan header
class kalkulator{
	static int d;
	public static void main(String args[]){ //perbaikan ditambah public dan arg menjadi args
		int a, s;
		Scanner input = new Scanner(System.in);
		kalkulator calc = new kalkulator();
		System.out.print("Masukkan angka pertama : "); //perbaikan antara System dan out harus ada titik dan i pada print menggunakan huruf kecil
		a = input.nextInt(); //perbaikan menggunakan () setelah nextInt
		System.out.print("Masukkan angka kedua : "); //perbaikan i pada print menggunakan huruf kecil
		s = input.nextInt();
		calc.tambah(a, s);
		kali(a, s); //perbaikan i pada kali harus menggunakan i kecil sesuai fungsi kali dan menggunakan ;
		calc.display("Kali"); //perbaikan display karena fungsi nya menggunakan d kecil
	}
	static void tambah(int a, int s){ //perbaikan karena variabel yang dipanggil di atas adalah a dan s
		d = a + s; //perbaikan karena variabel yang akan dipanggil a dan s
		display("Tambah"); 
	}
	static int kali(int a, int s){ //perbaikan karena variabel yang akan dipanggil a dan s
		return d = a* s; //perbaikan karena variabel yang akan dipanggil a dan s
	}
	static void display(String stat){
		System.out.print("\n Hasil "+stat+"\t: "+d); //perbaikan pada pemanggilan di tengah harus menggunakan + untuk setiap pengapitan
	}
}