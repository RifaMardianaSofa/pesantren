import java.util.Scanner; //Karena input maka memakai scanner
class kalkulator{
	static int d;
	static void main(Sting arg[]){ //Mengubah satic menjadi static dan penulisan Sting arg[] seharusnya menjadi String [] args
		int a,s;
		Scanner input=new Scanner (System.in); //System seharusnya menjadi System
		kalkulator calc=new kalkulator();
		System.out.print ("Masukkan angka pertama : "); //Systemout seharusnya ditulis System.out
		a=input.nextInt; //Seharusnya setelah nextInt ada () menjadi nextInt()
		System.out.print ("Masukkan angka kedua : "); //Seharusnya huruf i pada print kecil bukan besar
		s=input.nextInt();
		calc.tambah(a,s);
		kali(a,s); //Ditambahkan tanda ;
		calc.display ("kali"); //Pada Display harus kecil menjadi display dan huruf k pada Kali menjadi kecil
	}
	static void tambah(int a,int s){
		d=a+s;
		display("tambah");
	}
	static int kali(int x,int y){
		return d=a*s;
	}
	static void display(String stat){
		System.out.print ("\nHasil "+stat+"\n: "+d);
	}
}