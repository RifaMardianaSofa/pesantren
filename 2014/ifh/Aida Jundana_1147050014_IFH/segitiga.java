import java.util.*;
public class segitiga
{
	public static void main(String[]args)
	{
		Scanner meta= new Scanner(System.in);
		int m=Integer.parseInt(args[1]);
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
		System.out.print("Tidak boleh genap, tolong ulangi kembali");
	}
}
				