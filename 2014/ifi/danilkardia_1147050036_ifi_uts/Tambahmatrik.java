public class Tambahmatrik{
	public static void main (string [] args)
	{
	// untuk memasukan data 
	Scanner input = new Scanner (System.in);
	int i;
	int j;
	int [] [] matrik A= new int [2][2];
	int [] [] matrik B= new int [2][2];
	int [] [] jumlah matrik = new int [2][2];
	// input matrik A
	for (i=0; i<2; i++)
	{
		for (j=0; j<2; j++)
		{
			System.out.print ("matrik A"+i+"."+j+"=");
			matrik A [i][j] = input.nextInt();
			}
			}
	// input matrik B
	for (i=0; i<2; i++)
	{
		for(j=0; j<2; j++)
		{
			System.out.print ("matrik B"+i+"."+j+"=");
			matrik B [i][j] = input.nextInt();
			}
			}
	//penjumlahan matrik 
	for (i=0; i<2; i++)
	{
		for(j=0; j<2; j++)
		{
		jumlah matrik [i][j] = matrik A [i][j] + matrik B [i][j] ;		// rumus penjumlahan matrik
		}
		}
	// tampil jumlah matrik
		System.out.println ("\n matrik A + matrik B \n");
		for( i=0; i<2; i++)
		{
			for(j=0; j<2; j++)
			{
				System.out.print (" "+jumlah matrik [i][j] );
				}
				System.out.println();
				}
				}
				}
	