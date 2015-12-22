import java.util.Scanner;
public class SegitigaN{
	public static void main(String[]args){
	Scanner masuk= new Scanner(System.in);
	int b, s, bin, n;
	
	System.out.print("Masukkan jumlah baris bintang : ");
	n=masuk.nextInt();
	
	for (b=0; b<=n; b++)
	{
		for (bin=0; bin<=b; b++)
		{
			System.out.println(" * ");
		}
	System.out.print("\n");

	}
	
	System.out.print("\n");
}
}