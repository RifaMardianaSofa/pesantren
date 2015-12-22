class kalkulator{
	static int d;
	static void main (String args[]){
	//kurang huruf "s" pada args
	int a;
	int s;
	//kurang titik koma (;) untuk inisialisasi a
	Scanner input = new Scanner(System.in);
	kalkulator calc = new kalkulator ();
	System.out.print("Masukan angka pertama : ");
	//kurang titik( . ) pada System.out.print
	a = input.nextInt();
	System.out.print("Masukan angka kedua : ");
	s = input.nextInt();
	calc.tambah(a,s);
	kalI(a,s);
	calc.Display("Kali");
	}
	static void tambah (int x, int y){
		d = x + y;
		display("Tambah");
	}
	static int kali (int x, int y){
		return d =x*y;
	}
	static void display(String stat){
		System.out.println("Hasil "stat+"\t: "+d);
		}
	}