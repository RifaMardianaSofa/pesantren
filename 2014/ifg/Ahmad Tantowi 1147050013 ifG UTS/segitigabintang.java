import java.util.Scanner;

public class segitigabintang{
	public static void main(String[]args){
		int a,b,c,n,tanya;
		Scanner input = new Scanner (System.in);
		System.out.print("Masukkan banyaknya baris bintang : ");
		n = input.nextInt();
		
		if (n%2==1){
			for (a=0;a<=n;a++){
				for (b=0;b<=a;b++){
					System.out.print(" ");
				}
				for (c=n;c>a;c--){
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		else{
			System.out.println("Angka yang Anda masukkan genap. Ulangi lagi? [1=y/2=n]");
			tanya = input.nextInt();
		}

	}
}