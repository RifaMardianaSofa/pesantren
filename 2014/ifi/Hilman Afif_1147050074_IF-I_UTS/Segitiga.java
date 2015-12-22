public class Segitiga
{
	public static void main(String[]args)
	{
		int i,j,k,l;
		System.out.println("Masukkan tinggi segitiga (harus angka ganjil) : ");
		int n=Integer.parseInt(args[0]);
		if(n%2==0)
		{
		System.out.println("Maaf anda harus memasukkan angka ganjil!");
		}
		else
		for(i=1;i<=n;i++)
		{
			for(j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for(l=1;l<=i-1;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*
public class Nilai{
	public static void main(String[] args){
	String HM;
	int NA = Integer.parseInt(args[2]);
	if (NA >= 81 && NA <= 100)
	HM="A";
	else
	HM="E";
	System.out.println("Nama Anda = " + args[0]+ " Kelas = " +args[1]);
	System.out.println("Nilai huruf = " +HM);
	}
}
*/