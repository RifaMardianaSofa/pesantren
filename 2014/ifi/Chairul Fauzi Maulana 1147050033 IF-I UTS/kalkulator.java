import java.util.Scanner;
class kalkulator {
	static int d;
		public static void main (String [] args){  // Harus pake public 
			int a,s;
			Scanner input = new Scanner (System.in); //Harus ada import java.util.Scanner;
			kalkulator calc = new kalkulator ();
			System.out.print ("Masukan angka pertama : ");
			a = input.nextInt ();
			System.out.print ("Masukan angka kedua : ");
			s = input.nextInt();
			calc.tambah (a,s);
			kali (a,s); 							//tidak ada titik koma (;)
			calc.display ("Kali");					//D nya harus pake d kecil
			}
			static void tambah (int x, int y) {
			d= x+y;
			display ("Tambah");
			}
			static int kali (int x, int y) {
				return d = x*y;
			}
				static void display (String display) {		// stat nya ganti sama display
					System.out.print("\n Hasil "+display +"\t: "+d); // harus pake +display+
				}
			}
