import java.util.Scanner;// deklarasi buat header Scanner
public class kalkulator{
static int d;
public static void main (String args[]){//harusnya ditambah public dan tulisannya salah"satic" harusnya static dan"arg" harusnya args{
int a,s;
Scanner input=new Scanner(System.in);// tadi gak kebaca karena gak ada header atau gak di deklarasiin dan penulisan "sytem" salah harusnya System
kalkulator calc=new kalkulator();
System.out.print("Masukan angka pertama:");//setelah System harusnya pake tanda titik (.) sebelum out di soal gak pake
a=input.nextInt();//gak pake kurung buka dan kurung tutup () setelah next.Int
System.out.print("Masukan Angka Kedua:");
s=input.nextInt();
calc.tambah(a,s);
kali(a,s);//di soal gak pake titik koma hyarusnya pake buat menutup perintah dan huruf I nya kecil i bukan besar
calc.display("kali");//pada tulisan Display harusnya d nya kecil bukan besar
}
static  void tambah(int a,int s)
{
d=a+s;//harusnya bukan x+y tetapi a+s
display("Tambah");
}
static int kali (int a, int s)//bukan ina x dan int y tetapi harusnya int a, int s
{
return d=a*s ;//  bukan x*y tetapi a*s
}
static void display(String stat){
System.out.println("\n hasil "+stat+"\t: "+d);// stat nya masih kurang tanda + didepan nya
}
}
