import java.util.Scanner;
public class bintang {
	public static void main(String[] args){
	int x;
	x = Integer.parseInt(args [0]);
	Scanner input = new Scanner(System.in);
	if (x%2==0){
		System.out.println("Maaf, angka yang anda inputkan salah. masukkan angka ganjil!!");
		System.out.print("Masukkan angka : ");
		x =input.nextInt();
		for(int i=1; i<x; i++){
		for(int j=(x-1); j>=i; j--){
			System.out.print(" ");
		}
		for(int k=1; k<=i; k++){
			System.out.print("*");
			}
		for (int l=1; l<=(i-1); l++){
			System.out.print("*");	
		}
	System.out.println();
	}
		}
	else{
	for(int i=1; i<x; i++){
		for(int j=(x-1); j>=i; j--){
			System.out.print(" ");
		}
		for(int k=1; k<=i; k++){
			System.out.print("*");
			}
		for (int l=1; l<=(i-1) ; l++){
			System.out.print("*");
			
		}
	System.out.println();
	}
	}
}
}
		