import java.util.Scanner; //ditambah 
class kalkulator{
static int d;
//harusnya static
	public static void main(String[] args){
		int a, s;
		Scanner input = new Scanner(System.in);
		kalkulator calc = new kalkulator();
		System.out.print("Masukan angka pertama : ");
		a = input.nextInt();
		System.out.print("Masukan angka kedua : ");
		s = input.nextInt();
		calc.tambah(a,s);
		//harusnya dalam kali i nya hurup kecil
		kali(a,s);
		calc.display("kali"); //harusnya d nya kecil
	}	
	static void tambah(int a,int s){ 		//asalnya x,y duiganti jadi a,s
	d=a+s;													//diganti jadi a,s
	display("tambah");
	}
	static int kali(int a, int s){				//diganti jadi a,s
		return d = a * s;						//diganti jadi a,s
	}
	static void display(String stat){
		System.out.println("\nHasil "+stat+"\t : "+d);
	}
}
