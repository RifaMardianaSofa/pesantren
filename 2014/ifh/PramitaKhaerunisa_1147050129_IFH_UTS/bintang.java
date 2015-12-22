import java.util.Scanner;

public class bintang{
public static void main(String [] args){
						Scanner input = new Scanner(System.in);
						System.out.print("Masukan angka ganjil:");
						int n=input.nextInt();
						for(int i=1;i<=n;i++){
						
						for(int j=n;j>=i;j--){
							System.out.println("*");
						}
											for(int j=(x-1);j>=1;j--){
											for(int i=1;i<=j;i++){
												System.out.print("*");
											}
						System.out.print(" ");
						}
					}
				}