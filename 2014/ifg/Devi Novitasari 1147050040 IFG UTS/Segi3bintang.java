import java.util.Scanner;
public class segi3bintang{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int x= Integer.parseInt(args[0]);
		if(x%2==1){
			for(int k=1; k<=x; k++){
				for(int l=1; l<=k; l++){
				System.out.print(" ");
				}
			for(int i=x; i>=k; i--){
				System.out.print(" *");
				}
				System.out.println("");
				}
				}
		else {
		System.out.println("Angka yang diinputkan salah karena angka yang diinputkan harus ganjil");
		System.out.println("Inputkan angka kembali : ");
		x = input.nextInt();
		for(int k=1; k<=x; k++){
				for(int l=1; l<=k; l++){
				System.out.print(" ");
				}
			for(int i=x; i>=k; i--){
				System.out.print(" *");
				}
				System.out.println("");
				}
				}
	}
}