import java.util.Scanner;     						//penambahan header dengan menggunakan Scanner
 class kalkulator{
	static int d;
	public static void main(String[]args){			//penambahan method public
	int a, s;
	Scanner input = new Scanner(System.in);
	kalkulator calc = new kalkulator();
	System.out.print("Masukkan angka pertama : ");
	a = input.nextInt();							//penambahan ()
	System.out.print("Masukkan angka kedua : ");
	s = input.nextInt();
	calc.tambah(a,s);
    kali(a,s);
	calc.display("kali");							//perubahan dari Display("Kali") menjadi display("kali)
	}
	static void tambah(int a, int s){				//variabel x dan y diganti menjadi a dan s
		d = a + s;									//mengganti variabel x dan y menjadi a dan s
		display("Tambah");
	}
	static int kali(int a, int s){					//mengganti variabel x dan y menjadi a dan s
		return d = a* s;							// variabel x dan y diganti menjadi a dan s
	}
	static void display(String stat){
		System.out.print("\n hasil "+stat+"\t: "+d);	//pake space setelah \n dan penambahan + sebelum stat
		
	}
	}