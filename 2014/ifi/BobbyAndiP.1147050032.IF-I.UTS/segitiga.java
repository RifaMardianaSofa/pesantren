import java.util.Scanner;
 public class segitiga{
  public static void main (String [] args){
  
  Scanner input=new Scanner (System.in);
  System.out.println("SegitigaBintang");
  int n=Integer.parseInt(args[0]);
  if (n%2==0){
  System.out.print("Masukkan Angka lain");
  }
  else
  
  for (int i=n; i>=1; i--)
  {
  for (int j=5; j>i; j--)
  {
  System.out.print(" ");
  }
  for (int k=i; k>=1; k--)
  {
  System.out.print("*"+" ");
  }
  System.out.println();
  }
}
}