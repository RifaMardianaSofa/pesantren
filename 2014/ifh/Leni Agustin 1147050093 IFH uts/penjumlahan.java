import java.util.Scanner;
public class penjumlahan{
		public static void main(String[] args){
		Scanner masuk = new Scanner(System.in);
		int nilai1[][] = new int[2][2];
		int nilai2[][] = new int [2][2];
		int hasil[][] = new int[2][2];
		System.out.println("Masukan nilai matriks A : ");
		for(int i = 0; i<2; i++){
		for(int j= 0; j<2; j++){
			System.out.print("("+(i+1)+","(j+1)+"):");
			nilai1[][] = masuk.nextInt();
		}
		}
		System.out.println("Masukan nilai matriks B : ");
		for(int k=0; k<2;k++){
		for(int l=0; l<2; l++){
			System.out.print("("+(k+1)+","(l+1)+"):");
			nilai2[k][l]=masuk.next.Int();
		}
		System.out.println("Matriks A");
			for(int i=0; i<2;i++{
			for(int j=0;j<2;j++)
		System.out.println("Matriks B");
		for(int k=0;k<2;k++){
		for(int l=0;l<2;l++)
			System.out.print(nilai2[k][l]+" ");
			System.out.println();}
			for(int x=0; x<2;x++){
			for(int y=0;y<2;y++){
			hasil[x][y]=nilai1[x][y]+nilai2[x][y];
		}
	}