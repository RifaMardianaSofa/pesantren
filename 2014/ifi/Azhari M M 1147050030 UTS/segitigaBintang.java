import java.util.Scanner;
public class segitigaBintang{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		int n=Integer.parseInt(args[0]);
		if(n%2==0){
			System.out.print("Tidak bisa angka genap! Masukkan bilangan lain : ");
			n=input.nextInt();
		}
		for(int i=1;i<(n+1);i++){
			for(int j=1;j<(n+1)-i;j++){
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--){
				System.out.print("*");
			}
			for(int k=2;k<=i;k++){
				System.out.print("*");
			}
		System.out.println();
		}
		
	}
}