import java.util.Scanner;
public class segitigabintang{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(args[0]);
		if(n%2==1){
			for(int k=1; k<=n; k++){
				for(int l=1; l<=k; l++){
				System.out.print(" ");
				}
			for(int i=n; i>=k; i--){
				System.out.print(" *");
				}
				System.out.println("");
				}
				}
		else {
		System.out.println("Anda salah memasukkan angka!! angka harus ganjil!!");
		System.out.println("Masukkan angka lagi : ");
		n = input.nextInt();
		for(int k=1; k<=n; k++){
				for(int l=1; l<=k; l++){
				System.out.print(" ");
				}
			for(int i=n; i>=k; i--){
				System.out.print(" *");
				}
				System.out.println("");
				}
				}
	}
}