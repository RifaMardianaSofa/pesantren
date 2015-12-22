import java.util.Scanner;											//kurang importnya
class kalkulator{
	static int d;													//di pindahin ke dalem main si static int d; nya
	public static void main(String arg []){							//satic diubah jadi public static, dan Sting jadi String, dan [] kasih spasi, dan arg dikasih spasi sama String
	int a,s;
	Scanner input = new Scanner(System.in);							//Sytem kurang s jadi system
	kalkulator calc = new kalkulator();
	System.out.print("Masukkan angka pertama : ");					//systemout dipisahin titik dan S nya gede
	a = input.nextInt();
	System.out.print("Masukkan angka kedua : ");					//prInt i nya kecilin
	s = input.nextInt();
	calc.tambah(a,s);
	kali(a,s);														//kalI i nya kecil
	calc.display("Kali");											//display D nya kecil
	}	
static void tambah (int x, int y){
	d = x+y;
	display("Tambah");
	}
static int kali (int x, int y){
	return d = x*y;
	}
static void display(String stat){
	System.out.print("\nHasil "+stat+"\t: "+d);						//stat+ nya di pindahin jadi +stat, terus di pindahin posisi titik dua nya("), dan posisi +d nya jadi paling blkng
	}
}