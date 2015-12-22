public class bintang{
	public static void main(String[]args){
		System.out.println("Masukkan banyaknya N [harus angka ganjil]  ");
		int n=Integer.parseInt(args[0]);
		if(n%2==1){
			for (int i=1;i<=n;i++){
				for(int j=n;j>=i;j--){ 
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
		else
		{
			System.out.println("Maaf seharusnya anda menginputkan angka ganjil !!! ");
		}
		
		
		
	}
}