import java.util.*;   //harus memakai import//
class kalkulator{
static int d;

public static void main(String arg[]){   //kurang publik//
int a,s;
Scanner input = new Scanner(System.in);
kalkulator calc = new kalkulator();
System.out.print("masukKan angka pertama:");
a = input.nextInt();   // kurang tanda kurung setelah nextI //
System.out.print("masukkan angka kedua:");
s = input.nextInt(); 
calc.tambah(a,s);
kali(a,s);  // kurang titik koma pada akhir //
calc.display("kali");
}
static void tambah (int x, int y){
  d=x+y;
  display("Tambah");
}
static int kali(int x, int y){
 return d= x * y;
}
static void display(String stat){
System.out.print("hasil"+ stat +d); 
}
}