import java.util.Scanner;// deklarasi buat Scanner
public class kalkulator{
static int d;
public static void main(String[]args){// seharusnya begini penulisammya
								int a,s;
								Scanner input = new Scanner(System.in);// ga kebaca karna ga di deklarasiin
								kalkulator calc = new kalkulator();
								System.out.print("masukan angka pertama : ");// ga pake titik setelah System
								a= input.nextInt();//ga pake buka tutup kurung biasa
								System.out.print("masukan angka kedua : ");
								s= input.nextInt();
								calc.tambah(a,s);
								kali(a,s);//pakai titik koma
								calc.display("kali");// display nya pake D harus pake d kecil
								
								}
								
								static void tambah(int x, int y){
								d=x+y;
								display("tambah");}
								static int kali(int x,int y){
								return d= x*y;}
								static void display(String stat){
								System.out.print("\nHasil"+stat+"\t: "+d);//stst nya ga pake + dan ga pake titik koma
								}
}