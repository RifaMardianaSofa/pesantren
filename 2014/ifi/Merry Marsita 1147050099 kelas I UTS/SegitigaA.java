import java.util.Scanner;
public class SegitigaA{
	public static void main(String[]args){
		int n;
		Scanner scn=new Scanner(System.in);
		System.out.print("Masukan angka:");
		n=scn.nextInt();
		n=Integer.parseInt(args[0]);

		if(n%2==1){
			for(int i=1; i<=n; i++)
		{
			for(int j=n; j>=i; j--)
				{ 
				System.out.print(" ");
				}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			for(int l=1; l<=i-1; l++){
				System.out.print("*");
			}
		System.out.print("\n");
		}
	}
	else
	{
		System.out.print("maaf seharusnya angka ganjil");
	}
}
}