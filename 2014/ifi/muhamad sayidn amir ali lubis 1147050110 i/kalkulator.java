import java.util.Scanner;//harus pakai import java.util.Scanner;
public class kalkulator{// harus pakai public 
 static int d;
 static void main(String args[]){//harus static bukan satic dan harus args bukan arg
   int a,s;
   Scanner input = new Scanner(System.in);
   kalkulator calc = new kalkulator ();
   System.out.print("Masukkan angka pertama : ");//harus System.out.print bukan Systemout.prInt
   a=input.nextInt();
   System.out.print("Masukkan angka kedua : ");//di print harus kecil i nya
   s=input.nextInt();//harusnya nextInt bukan nextlnt
   calc.tambah(a,s);
   kali(a,s);
   calc.Display("kali");
 }
 static void tambah(int x,int y){
  d=x+y;
  display("Tambah");
 }
 static int kali(int x,int y){
  return d = x * y;
 }
 static void display(String stat){
  System.out.print("\nHasil ");// jangan digabung "/Hasil" dan "/t:"+d
  System.out.print("\t: "+d);
 }
}