class Kalkulator{
static void main(String args[]) {
int a,s;
Scanner input = new scanner  (System.in);
kalkulator calc = new kalkulator();
System.out.print(Masukkan angka pertama : ");
a = input.nextint; harusnya nextnya huruf kavital(Nextint)
System.out.print(Masukkan angka kedua : ");
s = input.nextint();
calc.tambah(a,s);
kali(a,s)
calc.Display("Kali");
}
static void tambah(int x,int y){
d = x + y;
display("Tambah");
}
static void kali(int x,int y,){
return d = x * y;
}
static void display(String stat){
System.out.print("\nHasil "stat+"\t:"+d);
 }
}