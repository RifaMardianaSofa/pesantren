import java.util.Scanner;
class bintangg{
	public static void main(String[] args) {
	int n;	
	Scanner myScan  = new Scanner(System.in);

	System.out.print("Masukan Banyaknya pengulangan: ");
	{n = myScan.nextInt(); }
	if(n%2!=0){
    for(int i=1;i<=n;i++){
			for(int j=n;j>i;j--){
				System.out.print(" ");
			}
			for(int k=2;k<=i*2;k++){
				System.out.print("*");
			}
			for(int l=n;l>i;l--){
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		}
	else 
	 System.out.print("Silakan Masukan Angka Ganjil !! ");

	}
}