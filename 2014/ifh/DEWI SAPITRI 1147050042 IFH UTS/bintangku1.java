import java.util.Scanner;
public class bintangku1{
	public static void main(String[]args){
	int x;
	Scanner input = new Scanner(System.in);
	System.out.print("Masukkan panjang maksimum bintang :");
	x= input.nextInt();
		for(int i=1; i<=x; i++){
			for(int j=(x-1); j>=i; j--){
			System.out.print(" ");
			}
			for(int k=1; k<=i; k++){
			 System.out.print("*");
			}
				
			for(int l=1; l<=i-1; l++){
			System.out.print("*");
			}
			System.out.println();
			}
			}
			}