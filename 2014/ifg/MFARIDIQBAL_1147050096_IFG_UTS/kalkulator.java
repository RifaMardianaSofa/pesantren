import java.util.Scanner;								//di soal tidak memakai scanner
class kalkulator{
	static int d;
	public static void main (String arg []){				//tulisan static di soal salah yg bener static.
		int a,s;
		Scanner input = new Scanner(System.in);		//tulisan System salah kurang s nya
		kalkulator calc = new kalkulator();
		System.out.print("Masukkan angka pertama: "); //kurang titik di system.out
		a = input.nextInt();
		System.out.print("Masukkan angka kedua : ");	// I nya malah huruf besar dikata print
		s = input.nextInt();							//disoal nextlnt, seharusnya menggunakan i (I) jadi nextInt
		calc.tambah(a,s);
		kali(a,s);					// pada kata kali disoal i nya huruf besar, itu salah. seharusnya huruf kecil
		calc.display("kali");		// pada kata kali disoal k nya huruf besar, seharusnya huruf kecil
	}
	static void tambah (int x, int y){
	    d = x + y;
		display ("tambah");			//pada kata tambah t nya huruf besar disoal, seharusnya huruf kecil.
	}
	static int kali(int x, int y){
		return d = x * y;
	}
	static void display (String stat){
		System.out.print("\nHasil "+stat+"\t : " + d); // ilegal  kata stat+ kurang + diawal
	}
}
