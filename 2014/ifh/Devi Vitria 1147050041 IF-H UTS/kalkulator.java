import java.util.Scanner; //pada header ada import java.util.Scanner
class  kalkulator  {
static int d;
public static void main (String args []){ //harusnya String bukan sting dan args bukan arg dan harusny ada public
int a, s;
Scanner input = new Scanner (System.in);
kalkulator calc = new kalkulator ();
System.out.print ("Masukan angka pertama : "); //perbaikan pada Systemout.print
a = input.nextInt ();//harusnya ada () 
System.out.print ("Masukan angka kedua : " ); //perbaikan pada System.out.prInt
s = input.nextInt ();
calc.tambah(a,s);
kali (a,s); //perbaikan harusnya kali bukan kall
calc.display("kali"); //perbaikan harusnya display menggunakan huruf kecil bukan kapital
}
static void tambah(int a, int s) { //perbaikan harusnya int a danint s bukan int x dan int y
d = a + s; //perbaikan harusnya a dan s bukan x dan y
display ("Tambah"); 
}
static int kali (int a, int s){ //perbiakan harusnya int a dan int s bukanint x dan int y
return d = a* s; //perbaikan d = a*s bukan x*y
}
static void display (String stat){
System.out.print ("\nHasil "+stat+"\t: "+d); // perbaikan System.out.print ("\nHasil "+stat+"\t: "+d);
}
}

