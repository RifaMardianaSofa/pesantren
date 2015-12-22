import java.util.Scanner;
public class bintang{
	public static void main(String[]args){
	Scanner scn = new Scanner(System.in);
	int n;
	System.out.print("Masukkan jumlah n : ");
	n= scn.nextInt();
	
	if (n%2!=0)
	for (int i=1; i<=n; i++){
		for (int j=n-1; j>=i; j--){//untuk spasi
			System.out.print(" ");
			}
			for (int k=1; k<=i;k++){//bintang
				System.out.print("*");
				}
				for (int l=1; l<=i-1; l++){
					System.out.print("*");
					}
					System.out.println();
				}

	else
		{
		System.out.print("n harus ganjil, masukkan lagi!");
		}	
		}
	}