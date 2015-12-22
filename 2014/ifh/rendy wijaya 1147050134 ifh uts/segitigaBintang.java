import java.util.Scanner;

public class segitigaBintang{

public static void main(String [] args){
Scanner scan = new Scanner(System.in);
System.out.print("masukan angka ganjil:");
int n=scan.nextInt();
						
						
for(int i=1;i<=n;i++){
						
for(int j=n;j>=i;j--){
System.out.println(" ");
}
for(int k=1;k<=i;k++){
System.out.print("*");
						
}						
System.out.print("*");
						

}
}
}