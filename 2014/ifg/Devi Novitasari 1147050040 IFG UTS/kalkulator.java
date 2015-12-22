import java.util.Scanner; //menambahkan header 
class kalkulator {
	static int d;
	public static void main(String args[]){ //tambahkan public dan ganti arg menjadi args
		int a, s;
		Scanner input = new Scanner(System.in);
		kalkulator calc = new kalkulator();
		System.out.print("Masukkan angka pertama : "); //tambahkan titik antara System dengan out
		a = input.nextInt(); //tambahkan () pada nextInt
		System.out.print("Masukkan angka kedua : "); //ganti huruf I besar menjadi i kecil pada System.out.print
		s = input.nextInt();
		calc.tambah(a, s);
		kali(a, s); // i pada kali harus menggunakan i kecil sesuai fungsi kali dan menggunakan atau menambahkan ;
		calc.display("Kali"); //huruf D pada display harus menggunakan d kecil karena fungsi nya menggunakan d kecil
	}
	static void tambah(int a, int s){ // ganti variabel x dan y dengan variabel yang dipanggil di atas adalah a dan s
		d = a + s; //ganti variabel x dan y dengan variabel yang dipanggil di atas adalah a dan s
		display("Tambah"); 
	}
	static int kali(int a, int s){ //ganti variabel x dan y dengan variabel yang dipanggil di atas adalah a dan s
		return d = a* s; //ganti variabel x dan y dengan variabel yang dipanggil di atas adalah a dan s
	}
	static void display(String stat){
		System.out.print("\n Hasil "+stat+"\t: "+d); // pada pemanggilan setiap pengapitan ditengah harus menambahkan + 
	}
}