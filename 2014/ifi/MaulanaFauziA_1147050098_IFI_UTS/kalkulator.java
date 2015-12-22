import java.util.Scanner;	// menambahkan import java.util.Scanner;
class kalkulator{
	static int d;
	static void main(String arg[]){		//diubah dari Sting menjadi String dan satic menjadi static
		int a,s;
		Scanner input=new Scanner(System.in);
		kalkulator calc=new kalkulator();
		System.out.print("Masukan angka pertama : " );  //Systemout menjadi System.out
		a=input.nextInt();	//nextInt menjadi nextInt()
		System.out.print("Masukan angka kedua : ");
		s=input.nextInt();
		clac.tambah(a,s);
		kali(a,s);		//kalI menjadi kali dan kali(a,s) menjadi kali(a,s);	
		calc.Display("Kali");
	}
	static void tambah(int x,int y){
		d=x+y;
		display("Tambah");
	}
	static int kali(int x,int y){
		return (d=x*y);	// d=x*y; menjadi  (d=x*y;)
	}
	static void display(String stat){
		System.out.print("\nHasil "stat+"\t: "+d);
	}
}