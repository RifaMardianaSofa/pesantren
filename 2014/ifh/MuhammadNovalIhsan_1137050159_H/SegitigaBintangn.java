import java.util.Scanner;
public class SegitigaBintangn {
	public static void main(String[] args) {
		int x;
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan panjang maksimum bintang : ");
		x = input.nextInt();
			for(int i=1;i<=x;i++){
				for(int j=1;j<=i;j++){
					System.out.print("*");
				}
				System.out.println();
			}
						for (int j=(x-1);j>=1;j--){
				for(int i=1;i<=j;i++){
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}