import java.util.*;
public class penjumlahanMatriks
{
public static void main(String [] args)
{
Scanner input=new Scanner(System.in);
        int c,d,tampung;
           
int matriks1[][]=new int[2][2];
int matriks2[][]=new int[2][2];
System.out.println("\n matriks A");
for(c=0;c<matriks1.length;c++)
            {
                for(d=0;d<matriks1[c].length;d++)
                {
                System.out.print("elemen matriks A pada baris ke "+(c+1)+" kolom ke "+(d+1)+" : ");
                matriks1[c][d]=input.nextInt();
                }
            }
            System.out.println("\n Output matriks A : ");
            for(c=0;c<matriks1.length;c++)
            {
System.out.print(" [ ");
for(d=0;d<matriks1[c].length;d++)
                {
                System.out.print(" "+matriks1[c][d]);
                }
            System.out.println(" ] ");
            }
            System.out.println("\n matriks B");
            for(c=0;c<matriks1.length;c++)
            {
                for(d=0;d<matriks1[c].length;d++)
                {
                System.out.print("elemen matriks B pada baris ke "+(c+1)+" kolom ke "+(d+1)+" : ");
                matriks2[c][d]=input.nextInt();
                }
            }
                System.out.println("\n Output matriks B : ");
            for(c=0;c<matriks1.length;c++)
            {
                System.out.print(" [ ");
                for(d=0;d<matriks1[c].length;d++)
                {
                System.out.print(" "+matriks2[c][d]);
                }
            System.out.println(" ] ");
            }
            System.out.println("\n Hasil Kali Matriks A dengan matriks B : ");
            int matriksHasil[][]=hasilKaliMatriks(matriks1,matriks2);
            cetakHasil(matriks1,matriks2,matriksHasil,'+');
                }
    public static int[][] hasilKaliMatriks(int [][]matriks1,int [][]matriks2)
        {
            int hasil[][]=new int[matriks1.length][matriks2[0].length];
            for(int i=0;i<hasil.length;i++)
            {
                for(int j=0;j<hasil[0].length;j++)
                {
                    
                        hasil[i][j]+=matriks1[i][j]+matriks2[i][j];
                    }
                }
            
            return (hasil);
        }
        public static void cetakHasil(int[][]matriks1,int matriks2[][],int matriks3[][],char p)
        {
            for(int i=0;i<matriks1.length;i++)
            {
                for(int j=0;j<matriks1[0].length;j++)
                {
                    System.out.print("  "+matriks1[i][j]);
                }
                if(i==matriks1.length/2)
                    System.out.print(" "+p+" ");
                    else
                        System.out.print("   ");
                for(int j=0;j<matriks2[0].length;j++)
                {
                    System.out.print("  "+matriks2[i][j])
;               }
                if(i==matriks1.length/2)
                    System.out.print(" =");
                    else
                        System.out.print("  ");
                for(int j=0;j<matriks3[0].length;j++)
                {
                    System.out.print("  "+matriks3[i][j]);
                }
                System.out.println();
            }
        }
}