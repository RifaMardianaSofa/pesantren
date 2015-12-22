improt java.util.scanner:\\ harus buat header scanner
class kalkulator{
 static int d;
  public satic void main (string[] arg){ \\ harus ditambahkan public dan tulisan yang salah "Static dan arg" tapi args.
  int a,s;
  scanner input=new scanner(Sytem.in); \\ gak kebaca tadi karen ada header ataw tidak dideklarasiin dan penulisa stym salah harusnya System
  kalkulator calc=new kalkulator();
  system.out.print("masukan angka pertama:"); \\ setelah system harusnya pake tanda titik (.)
  a=input.nextlnt(); \\ gak pake tanda kurung 
  System.out.print("masukan angka kedua:");
  s=input.nextlnt();
  calc.tambah(a,s);
  kali(a,s); harus di tambahkan titk koma (;)
   calc.Display("kali"); \\ tulis Display pada hurup D harusnya kecil d
 }
 static void tambah(int a,int s){ \\ harusnya int (a dan int s) bukan int x dan int y
  d=a+s; \\ harusnya a dan s bukan x, y
  display("tambah");
 }
 static int kali(int a,int s); harusnya (int a dan int s) bkan  intx dan inty
  retrun d=a*s; \\ bukan x,y tapi a,s
 }
 static void display(string stat){
  system.out.print("\nHasil"+stat+"\t:"=d); \\ tulis pada system darusnya besar System. dan kurang tanda +
 }
}
  