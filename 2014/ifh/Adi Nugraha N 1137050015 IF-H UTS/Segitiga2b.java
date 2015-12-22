import java.util.*;
public class Segitiga2b
{
	public static void main(String[]args)
	{
		Scanner meta= new Scanner(System.in);
		int m=Integer.parseInt(args[0]);
		 if (b%2!=0)
		 {
		for (int i=1; i<=m; i++)
		{
			for(int j=1; j<=i-1; j--)
			{
				System.out.print(" ");
			}
			for (int k=m; k>=i; k--)
			{
				System.out.print(" *");
			}
			System.out.println("");
		}
		}
		else
		System.out.print("Bilangan yang anda masukkan genap, Silahkan masukkan kembali");
	}
}
				