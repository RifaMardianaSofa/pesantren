import java.util.Scanner;
public class bintang{
    public static void main(String [] args){
        int x;
		Scanner scan= new Scanner(System.in);
		System.out.print("Masukan Jumlah Baris : ");
		x=scan.nextInt();
		if (x%2==0)
			System.out.print("Masukan Angka Ganjil");
        else
		for (int i=1;i<=x;i++){
            for(int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){ 
                System.out.print("*");
            }
            for (int l=1;l<=i-1;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
