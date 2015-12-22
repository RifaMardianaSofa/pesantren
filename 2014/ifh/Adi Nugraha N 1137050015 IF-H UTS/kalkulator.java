import java.util.Scanner; /* tidak memakai (import java) */
class kalkulator{
static int d;
public static void main(String[]args){			/* penulisan sebelumnya dengan (satic void main(sting arg[])) tidak dengan argument(args) dan String*/
int a, s;
Scanner input= new Scanner(System.in);
kalkulator calc = new kalkulator();
System.out.print("Masukkan angka pertama : ");		/* penulisan tidak benar yaitu (Systemout) */
a= input.nextInt();
System.out.print("Masukkan angka kedua : ");
s= input.nextInt();
calc.display("kali");		/* penulisan sebelumnya Display */
}
public static void tambah(int x, int y){
d= x+y;
display("Tambah");
}
public static int kali (int x, int y){
	return d= x*y;
	}
	public static void display(String stat){
	System.out.print("\nHasil "+stat+"+\t: "+d);
	}
	}