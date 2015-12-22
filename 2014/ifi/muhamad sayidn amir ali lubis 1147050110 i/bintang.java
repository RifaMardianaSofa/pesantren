import java.util.Scanner;
public class bintang{
public static void main (String[]args){
Scanner scn = new Scanner(System.in);
int n;
System.out.println("masukkan n =");
n=scn.nextInt();
if (n%2 !=0)
for(int i=1; i<=n;i++){
for(int j=n-1; j>=i;j--){
System.out.print(" ");
}
for(int k=1;k<=i;k++){
System.out.print(" * ");
}
for (int l=1;l<=i-1;l++){
System.out.print(" * ");
}
System.out.print();

}
else
{
System.out.print("inputkan nilai baru harus ganjil");	
}
}
}
