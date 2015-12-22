class matriks{
	public static void main(String[] args) {
	int satu [][] = new int [2][2];
	int dua [][] = new int [2][2];
	int tiga[][]= new int [2][2];
	int j,k,l,m,i,b,c=0,a=0,x=0;
	for(j=1;j<=2;j++){
		for(k=1;k<=2;k++){
			satu[j][k] = c++;
		}
	}	
	for(l=1;l<=2;l++){
		for(m=1;m<=2;m++){
			dua[l][m]= a++;
		}

	}	
	for(j=1;j<=2;j++){
		for(k=1;k<=2;k++){
			System.out.print(satu[j][k] +" ");
		}
			System.out.println();
	}	
	for(l=1;l<=2;l++){
		for(m=1;m<=2;m++){
			System.out.print(dua[l][m]+" ");
		}
			System.out.println();

	}	

System.out.println("pengurangan");
 tiga[0][0]=satu[0][0]-dua[0][0];
 tiga[0][1]=satu[0][1]-dua[0][1];
 tiga[1][0]=satu[1][0]-dua[1][0];
 tiga[1][1]=satu[1][1]-dua[1][1];

System.out.println(tiga[i][b]+ " ");

System.out.println("penjumlahan");
 tiga[0][0]=satu[0][0]+dua[0][0];
 tiga[0][1]=satu[0][1]+dua[0][1];
 tiga[1][0]=satu[1][0]+dua[1][0];
 tiga[1][1]=satu[1][1]+dua[1][1];

System.out.println(tiga[i][b]+ " ");

System.out.println("perkalian");
 tiga[i][b]=(satu[0][0]*dua[0][0])+(satu[0][1]*dua[1][0]);
 tiga[i][b]=(satu[0][1]*dua[0][1])+(satu[1][1]*dua[1][1]);
 tiga[i][b]=x++;
System.out.println(tiga[i][b]+ " ");
	}
	
}