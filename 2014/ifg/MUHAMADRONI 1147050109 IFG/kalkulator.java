import java.util.Scanner;								//tidak memakai class Scanner pada class ini
class kalkulator{
	static int d;
	public static void main(String args[]){				//tidak ada "public" dan kata static kurang "t" kata String kurang "r", dan args kurang "s".
			int a,s;
			Scanner input = new Scanner(System.in);			//kurang "s" pada System.in
			kalkulator calc = new kalkulator();
			System.out.print("masukkan angka pertama : ");	//tidak ada "." dalam System.out.print
			a = input.nextInt();							//tidak ada "()" pada nextInt.
			System.out.print("masukkan angka kedua : ");
			s = input.nextInt();
			calc.tambah(a,s);
			kali(a,s);										//"kalI" tidak memakai huruf kapital dikata int,dan tidak memakai ";" pada akhir kali(a,s)
			calc.display("kali");							//kata "Display" itu method bukan variable.
		}
		static void tambah (int x,int y){
			d = x+y;
			display("tambah");
		}
		static int kali (int x,int y){
			return d = x * y;
		}
		static void display(String stat){
		System.out.print("\nHasil "+stat+"\t: "+d);		//illegal kata "n\Hasil" dan "stat+".
	}
}