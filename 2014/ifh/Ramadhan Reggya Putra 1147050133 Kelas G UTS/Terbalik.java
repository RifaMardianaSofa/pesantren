import java.util.*;
public class Terbalik
{
	public static void main(String[]args)
	{
		Scanner meta= new Scanner(System.in);
		int n;
		int m=Integer.parseInt(args[0]);
		 if (m%2!=0)
		 {
		for (int i=1; i<=m; i++)
		{
			for(int j=1; j<=i; j++)
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
		{
		System.out.println("Tidak boleh genap !!");
		System.out.print("Masukan angka : ");
		n=meta.nextInt();
		for (int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			for (int k=n; k>=i; k--)
			{
				System.out.print(" *");
			}
			System.out.println("");
		}
		}
		
	}
}
				