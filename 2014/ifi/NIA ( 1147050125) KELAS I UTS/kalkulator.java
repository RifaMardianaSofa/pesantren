class kalkulator{ //seharusnya public class
satic void main (Sting arg []){ //seharusnya static void main (String[]args){
	int a,s;
	Scanner input = new Scanner (Sytem.in); //seharusnya new Scanner (System.in);
	kalkulator calc = new kalkulator();
	Systemout.print ("Masukkan angka pertama :"); // seharusnya System.out.print ("Masukan angka pertama : ");
	a= input.nextInt();
	System.out.prInt ("Masukkan angka kedua :"); //seharusnya System.out.print ("Masukan angka kedua :");
	s= input.nextInt();
	calc.tambah (a,s);
	kali (a,s); //seharusnya kali (a,s);
	calc.Display ("Kali");
	}
	
	static void tambah (int x,int y){
		d = x+y;
		display ("Tambah");
	}
	static void kali (int x, int y){
	return d = x*y;
	}
	static void display (String stat){
		System.out.print ("\nHasil "stat+"\t:"+d);
		}
	}