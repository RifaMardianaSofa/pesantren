import java.util.Scanner;
 public class matriks{
  public static void main (String [] args){
  Scanner input=new Scanner (System.in);
  int [][] MatriksA = new int [2][2];
  int [][] MatriksB = new int [2][2];
  int [][] MatriksC = new int [2][2];
  System.out.println ("Penjumlahan Perkalian Pengurangan Matriks");
  System.out.print ("1.Penjumlahan\n 2. Pengurangan\n 3. Perkalian\n");
  int pil=input.nextInt();
  switch(pil)
  {
  case 1:
  System.out.print (" Penjumlahan Matriks");
  System.out.print (" Input Matriks");
  for (int i=0; i<2; i++){
  for (int j=0; i<2; j++){
  System.out.print ("Matriks A [" + i + "] [" + j + "] =");
  int isiMatriks=input.nextInt();
  
  MatriksA[i][j]=isiMatriks;
  }
  }
  for (int i=0; i<2; i++){
  for (int j=0; i<2; j++){
  System.out.print ("Matriks B [" + i + "] [" + j + "] =");
  int isiMatriks=input.nextInt();
  
  MatriksB[i][j]=isiMatriks;
  }
  }
  
  System.out.print ("Matriks A");
  for (int i=0; i<2; i++){
  for (int j=0; i<2; j++){
  System.out.print (MatriksA[i][j] +" ");
  }
  System.out.println();
  }
 System.out.print ("Matriks B");
  for (int i=0; i<2; i++){
  for (int j=0; i<2; j++){
  System.out.print (MatriksB[i][j] +" ");
  }
  System.out.println();
  }
 
 for (int i=0; i<2; i++){
  for (int j=0; i<2; j++){
  MatriksC [i][j]= MatriksA [i][j]+MatriksB [i][j];
  }
 }
 System.out.print ("Hasil Penjumlahan");
 for (int i=0; i<2; i++){
  for (int j=0; i<2; j++){
  System.out.print (MatriksC  [i][j] +" ");
  }
  System.out.println();
  }
  break;
case 2:
  System.out.print (" Pengurangan Matriks");
  System.out.print (" Input Matriks");
  for (int i=0; i<2; i++){
  for (int j=0; i<2; j++){
  System.out.print ("Matriks A [" + i + "] [" + j + "] =");
  int isiMatriks=input.nextInt();
  
  MatriksA[i][j]=isiMatriks;
  }
  }
  for (int i=0; i<2; i++){
  for (int j=0; i<2; j++){
  System.out.print ("Matriks B [" + i + "] [" + j + "] =");
  int isiMatriks=input.nextInt();
  
  MatriksB[i][j]=isiMatriks;
  }
  }
  
  System.out.print ("Matriks A");
  for (int i=0; i<2; i++){
  for (int j=0; i<2; j++){
  System.out.print (MatriksA[i][j] +" ");
  }
  System.out.println();
  }
 System.out.print ("Matriks B");
  for (int i=0; i<2; i++){
  for (int j=0; i<2; j++){
  System.out.print (MatriksB[i][j] +" ");
  }
  System.out.println();
  }
 
 for (int i=0; i<2; i++){
  for (int j=0; i<2; j++){
  MatriksC [i][j]= MatriksA [i][j]+MatriksB [i][j];
  }
 }
 System.out.print ("Hasil Penjumlahan");
 for (int i=0; i<2; i++){
  for (int j=0; i<2; j++){
  System.out.print (MatriksC [i][j] +" ");
  }
  System.out.println();
  }
  break;
case 3:
  System.out.print (" Perkalian Matriks");
  System.out.print (" Input Matriks");
  for (int i=0; i<2; i++){
  for (int j=0; i<2; j++){
  System.out.print ("Matriks A [" + i + "] [" + j + "] =");
  int isiMatriks=input.nextInt();
  
  MatriksA[i][j]=isiMatriks;
  }
  }
  for (int i=0; i<2; i++){
  for (int j=0; i<2; j++){
  System.out.print ("Matriks B [" + i + "] [" + j + "] =");
  int isiMatriks=input.nextInt();
  
  MatriksB[i][j]=isiMatriks;
  }
  }
  
  System.out.print ("Matriks A");
  for (int i=0; i<2; i++){
  for (int j=0; i<2; j++){
  System.out.print (MatriksA[i][j] +" ");
  }
  System.out.println();
  }
 System.out.print ("Matriks B");
  for (int i=0; i<2; i++){
  for (int j=0; i<2; j++){
  System.out.print (MatriksB[i][j] +" ");
  }
  System.out.println();
  }
 
 for (int i=0; i<2; i++){
  for (int j=0; i<2; j++){
  MatriksC [i][j]= MatriksA[i][j]+MatriksB[i][j];
  }
 }
 System.out.print ("Hasil Penjumlahan");
 for (int i=0; i<2; i++){
  for (int j=0; i<2; j++){
  System.out.print (MatriksC [i][j] +" ");
  }
  System.out.println();
  }
  break;
  default :
System.out.println("Program Eror");
break;
}
}
}