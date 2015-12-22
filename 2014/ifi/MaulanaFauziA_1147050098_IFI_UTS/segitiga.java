import java.util.Scanner;
public class segitiga
{
	public static void main(String[]args)
	{
		int t,a;
		Scanner masuk=new Scanner(System.in);
		do
		{
		System.out.print("Masukan Tinggi segitiga (angka ganjil) :");
		t=masuk.nextInt();
		a=t%2;
		}
		while(a==0);
		for(int j=1;j<=t;j++)
		{
			for(int k=t;k>j;k--)
			{
				System.out.print(" ");
			}
			for(int i=0;i<j;i++)
			{
				System.out.print("*");
			}
			for(int i=1;i<j;i++)
			{
					System.out.print("*");
			}
			System.out.println();	
		}
	}
}