import java.util.Scanner; 								// Ditambahkan import java.util.Scanner
class kalkulator{
 public static int d; 									// Ditambahkan Public
 public static void main (String arg[]){				//static > Static dan arg > args
	int a,s;
	Scanner input=new Scanner (System.in); 				//Sytem > System 
	kalkulator calc = new kalkulator();
	System.out.print ("Masukkan angka pertama :"); 		// Systemout.print > System.out.print 
	a=input.nextInt();
	System.out.print ("Masukkan angka pertama :");		//System.out.prInt > System.out.print
	s=input.nextInt();
	calc.tambah(a,s);
	calc.kali(a,s);										// kalI > kali ditambah 
	calc.display ("kali"); 								// 
	}
	
	static void tambah (int x, int y){
	d= x+y;
	display ("Tambah");
	}
	
	static int kali (int x, int y){
	return d= x*y;
	}
	
	static void display (String stat){
	System.out.print("\n Hasil " +stat + "\t: " + d);	// ("\n Hasil "stat + "\t: " + d = >) ("\n Hasil " +stat + "\t: " + d)
	}
}