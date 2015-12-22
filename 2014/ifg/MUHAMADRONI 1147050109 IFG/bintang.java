import java.util.Scanner;
public class bintang{
	public static void main (String[]args){
	int n;
	int i,j;
	n = Integer.parseInt(args[0]);
		for (i = 1; i<=n; i++){
			for (j = 0; j<=n - i; j++){
				System.out.print(" *");
			}
			for (j = n; j>=2*i; j--){
				System.out.print("  ");
			}
			System.out.println(" ");
		}
	}
}