import java.util.*;  //Harus memakai import //
class kalkulator{
	static int d;


	public static void main (String arg[]) { //kurang public//
		int a,s;
		Scanner input = new Scanner (System.in);
		kalkulator calc = new kalkulator();
		System.out.print("Masukkan angka pertama :");
		 a = input.nextInt() ; //kurang tanda kurung setelah nextI //
		System.out.print("Masukkan angka kedua   :");
		s = input.nextInt();
         calc.tambah(a,s);
         kali(a,s);//kurang titik koma pada akhir//
         calc.Display("Kali");
     }
     static void tambah (int x,int y) {
     	d= x+y ;
     	Display(" Tambah ");

     }
     static int kali (int x, int y ){
     	return d = x * y ;

     }
     static void Display (String stat){
     	System.out.print("Hasil " +stat  +d);//tanda + pasa stat di pindah ke depan //
     
	}
}