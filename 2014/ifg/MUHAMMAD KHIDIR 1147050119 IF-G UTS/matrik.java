import java.util.*;
class matrik{
	public static void main(String [] args)
{
	int n ;
	Scanner a = new Scanner (System.in);
	
	int [][] matrika =new int [2][2];
	int [][] matrikb =new int [2][2];
	int [][] matrikc =new int [2][2];
	int [][] matrikd =new int [2][2];
System.out.println("Matrik A");
	 for (int i =0; i<2; i++){
	 	 for (int j =0; j<2; j++) {
	 	 System.out.print("elemen ["+(i+1)+","+(j+1)+"]");
	 	 matrika[i][j] =a.nextInt();	
	 	 }}

	 	 System.out.println("Matrik B");
	 for (int i =0; i<2; i++){
	 	 for (int j =0; j<2; j++) {
	 	 System.out.print("elemen ["+(i+1)+","+(j+1)+"]");
	 	 matrikb[i][j] =a.nextInt();	
	 	 }}

	 	System.out.println("Matrik A");
	 	 for (int i = 0; i<2; i++){
            System.out.println(" |");

	 	 for (int j =0; j<2; j++) {
	 	 	System.out.println(" " +matrika[2][2]+ " ");
	 	 }
	 	  System.out.println(" |");
	 	}
	 		System.out.println();

	 	System.out.println("Matrik B");
	 	 for (int i =0; i<2; i++){
            System.out.println(" |");

	 	 for (int j =0; j<2; j++) {
	 	 	System.out.println(" " +matrika[2][2]+ " ");
	 	 }
	 	  System.out.println(" |");
	 	}

	 	System.out.println();

	 	System.out.println("pejumlahan");

	 	 for (int i =0; i<2; i++){
            System.out.println(" |");

	 	 for (int j =0; j<2; j++) {
	 	 	matrikc [i][j] = matrika [i][j] + matrikb [i][j] ;

	 	 }
	 	  System.out.println(" |");
	 	}
	 	System.out.println();

	 	 for (int i =0; i<2; i++){
            System.out.println(" |");

	 	 for (int j =0; j<2; j++) {
	 	 	matrikc [i][j] = matrika [i][j] + matrikb [i][j] ;
	 	 System.out.println("" +matrikc[i][j]+ " ");
	 	 }
	 	 System.out.println(" |");
	 	}




	 		System.out.println("pengurangan");

	 	 for (int i =0; i<2; i++){
            System.out.println(" |");

	 	 for (int j =0; j<2; j++) {
	 	 	matrikc [i][j] = matrika [i][j] - matrikb [i][j] ;

	 	 }
	 	  System.out.println(" |");
	 	}
	 	System.out.println();

	 	 for (int i =0; i<2; i++){
            System.out.println(" |");

	 	 for (int j =0; j<2; j++) {
	 	 	matrikc [i][j] = matrika [i][j] - matrikb [i][j] ;
	 	 System.out.println("" +matrikc[i][j]+ " ");
	 	 }
	 	 System.out.println(" |");
	 	}

	 		System.out.println("perkalian ");

	 	 for (int i =0; i<2; i++){
            System.out.println(" |");

	 	 for (int j =0; j<2; j++) {
	 	 	matrikd[i][j] =0 ;
	 	 	for (int k = 0; k<3; k++) {
	 	 	matrikd[i][j] =0 ;


	 	 	matrikd [i][j] = matrikd [i][j] + (matrika [i][k] * matrikb [k][j]) ;

	 	 }
	 	  System.out.println(" |");
	 	}}
	 	System.out.println();

	 	for (int i =0; i<2; i++){
            System.out.println(" |");

	 	 for (int j =0; j<2; j++) {
	 	 	matrikd[i][j] =0 ;
	 	 	for (int k = 0; k<2; k++) {
	 	 	matrikd[i][j] =0 ;
	 	 	matrikd [i][j] = matrikd [i][j] + (matrika [i][k] * matrikb [k][j]) ;
	 	 System.out.println("" +matrikd[i][j]+ " ");
	 	 }
	 	 System.out.println("|");
}   }  } }