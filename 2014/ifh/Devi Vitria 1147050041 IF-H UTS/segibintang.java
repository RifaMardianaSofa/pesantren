import java.util.Scanner;
public class segibintang {
public static void main (String [] args ){
Scanner input = new Scanner (System.in);
int n = Integer.parseInt (args[0]);

if (n%2==1){

for (int i=1; i<=n; i++){
for (int j=(n-1); j>=i; j--){
System.out.print(" ");
}
for (int k=1; k<=i; k++){
System.out.print("*");
}
for (int l=1; l<=i-l; l++) {
System.out.print("*");
}
System.out.println ();
}
}
else 
{
System.out.print("Anda Harus Memasukan angka genap pada keyboard");
System.out.print ("Masukan panjang bintang : ");
n=input.nextInt();
for (int i=1; i<=n; i++){
for (int j=(n-1); j>=i; j--){
System.out.print(" ");
}
for (int k=1; k<=i; k++){
System.out.print("*");
}
for (int l=1; l<=i-l; l++) {
System.out.print("*");
}
System.out.println ();
}
}
}
}





