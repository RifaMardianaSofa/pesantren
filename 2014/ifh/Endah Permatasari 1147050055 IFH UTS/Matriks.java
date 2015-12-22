import java.util.Scanner;
class Matriks{
public static void main(String args[]){
	int inp, x, y, a, b, i, j;
    Scanner scn = new Scanner(System.in);


System.out.println("Untuk Perkalian Hanya bisa ordo 2x2 dan 2x3 dan Pertambahan dan pengurangan ordo matriks A=B");
System.out.println("Pilihan Anda?");
System.out.println("1.Pertambahan matriks");
System.out.println("2. Pengurangan matriks");
System.out.println("3. Perkalian Matriks");
System.out.print("Masukan Pilihan : ");
inp = scn.nextInt();

  System.out.print("Input Baris Matriks A: ");
  int baris1 = scn.nextInt();
  System.out.print("Input Kolom Matriks A : ");int 
  kolom1 = scn.nextInt();
  System.out.println();
  System.out.print("Input Baris Matriks B: ");
  int baris2 = scn.nextInt();
  System.out.print("Masukan kolom Matriks B : ");
  int kolom2 = scn.nextInt();
  int[][] mtrks1 = new int[baris1][kolom1];
  int[][] mtrks2 = new int[baris2][kolom2];
  int[][] mtrks3 = new int[3][3];

switch(inp){
  case 1:
  if(baris1==baris2 && kolom1==kolom2){
	System.out.println("Melakukan Operasi Matriks");
	for(x=0; x<baris1;x++){
		for(y=0; y<kolom1;y++){
		System.out.print("Matriks A ["+(x+1)+"]["+(y+1)+"] : ");
		mtrks1[x][y]=scn.nextInt();
		}
    }
	System.out.println();
	for(x=0; x<baris2;x++){
		for(y=0; y<kolom2;y++){
		System.out.print("Matriks B ["+(x+1)+"]["+(y+1)+"] : ");
		mtrks2[x][y]=scn.nextInt();
		}
    }
	System.out.println();	
	System.out.println("Matriks A");
	for(x=0;x<baris1;x++){
	System.out.print("|");
        for(y=0;y<kolom1;y++){
        System.out.print(+(mtrks1[x][y])+ " ");
        }
	System.out.println("|");
    }
	System.out.println();
	System.out.println("Matriks B");
	for(x=0;x<baris2;x++){
	System.out.print("|");
        for(y=0;y<kolom2;y++){
        System.out.print(+(mtrks2[x][y])+ " ");
        }
	System.out.println("|");
    }
	System.out.println();
	System.out.println("Langkah-langkah Perhitungan Matriks A+B");
	for (x= 0; x <baris1; x++){
	System.out.print("|");
		for (y = 0; y <kolom1; y++){
		System.out.print(" "+mtrks1[x][y]+"+"+mtrks2[x][y]+" ");
		}
	System.out.println("|");
    }	
	System.out.println();
	System.out.println("Hasil Penjumlahan A+B");
	for (x= 0; x <baris1; x++){
	System.out.print("| ");
		for (y = 0; y <kolom1; y++){
		System.out.print(" "+(mtrks1[x][y]+mtrks2[x][y])+" ");
		}
	System.out.println("| ");
    }	
	}
	else{
	System.out.println("ERROR!");
	System.out.println("Ordo Matriks Yang Anda Inputkan Salah!!");
	}
    break;
		
  case 2:
	if(kolom1==kolom2 && baris1==baris2){
	System.out.println("Operasi Pengurangan Matriks");
	for(x=0; x<baris1;x++){
		for(y=0; y<kolom1;y++){
		System.out.print("Matriks A ["+(x+1)+"]["+(y+1)+"] : ");
		mtrks1[x][y]=scn.nextInt();
		}
    }
	System.out.println();
	for(x=0; x<baris2;x++){
		for(y=0; y<kolom2;y++){
		System.out.print("Matriks B ["+(x+1)+"]["+(y+1)+"] : ");
		mtrks2[x][y]=scn.nextInt();
		}
    }
	System.out.println();
	System.out.println("Matriks A");
	for(x=0;x<baris1;x++){
	System.out.print("| ");
        for(y=0;y<kolom1;y++){
        System.out.print(+(mtrks1[x][y])+ " ");
        }
	System.out.println("| ");
    }
	System.out.println();
	System.out.println("Matriks B");
	for(x=0;x<baris2;x++){
	System.out.print("| ");
        for(y=0;y<kolom2;y++){
        System.out.print(+(mtrks2[x][y])+ " ");
        }
	System.out.println("| ");
    }
	System.out.println();
	System.out.println("Langkah proses Pengurangan Matriks A-B");
	for (x= 0; x <baris1; x++){
	System.out.print("| ");
		for (y = 0; y <kolom1; y++){
		System.out.print(" "+mtrks1[x][y]+"-"+mtrks2[x][y]+" ");
		}
	System.out.println("|");
    }	
	System.out.println();
	System.out.println("Hasil Pengurangan Matriks A-B");
	for (x= 0; x <baris1; x++){
	System.out.print("|");
		for (y = 0; y <kolom1; y++){
		System.out.print(" "+(mtrks1[x][y]-mtrks2[x][y])+" ");
		}
	System.out.println("|");
    }	
	}
	else{
	System.out.println("Error!!");
	System.out.println("Anda salah Menginput Nilai Ordo");
	}
	break;
  case 3:
  if(baris1==2 && kolom1==2 && baris2==2 && kolom2==3){
  System.out.println("Melakukan Penjumlahan Matriks");
	for(x=0; x<baris1;x++){
		for(y=0; y<kolom1;y++){
		System.out.print("mtrks A ["+(x+1)+"]["+(y+1)+"] : ");
		mtrks1[x][y]=scn.nextInt();
		}
    }
	System.out.println();
	for(x=0; x<baris2;x++){
		for(y=0; y<kolom2;y++){
		System.out.print("Matriks B ["+(x+1)+"]["+(y+1)+"] : ");
		mtrks2[x][y]=scn.nextInt();
		}
    }
	System.out.println();	
	System.out.println("Matriks A");
	for(x=0;x<baris1;x++){
	System.out.print("|");
        for(y=0;y<kolom1;y++){
        System.out.print(+(mtrks1[x][y])+ " ");
        }
	System.out.println("|");
    }
	System.out.println();
	System.out.println("Matriks B");
	for(x=0;x<baris2;x++){
	System.out.print("|");
        for(y=0;y<kolom2;y++){
        System.out.print(+(mtrks2[x][y])+ " ");
        }
	System.out.println("|");
    }
	System.out.println();
	System.out.println("Langkah Perkalian A*B");
		mtrks3[0][0]= mtrks1[0][0]*mtrks2[0][0]+mtrks1[0][1]*mtrks2[1][0];
		mtrks3[0][1]= mtrks1[0][0]*mtrks2[0][1]+mtrks1[0][1]*mtrks2[1][1];
		mtrks3[0][2]= mtrks1[0][0]*mtrks2[0][2]+mtrks1[0][1]*mtrks2[1][2];
		mtrks3[1][0]= mtrks1[1][0]*mtrks2[0][0]+mtrks1[1][1]*mtrks2[1][0];
		mtrks3[1][1]= mtrks1[1][0]*mtrks2[0][1]+mtrks1[1][1]*mtrks2[1][1];
		mtrks3[1][2]= mtrks1[1][0]*mtrks2[0][2]+mtrks1[1][1]*mtrks2[1][2];
		System.out.println("Matriks (A*B) [0][0] : {"+mtrks1[0][0]+"x"+mtrks2[0][0]+"} + {"+mtrks1[0][1]+"x"+mtrks2[1][0]+"}");
		System.out.println("Matriks (A*B) [0][1] : {"+mtrks1[0][0]+"x"+mtrks2[0][1]+"} + {"+mtrks1[0][1]+"x"+mtrks2[1][1]+"}");
		System.out.println("Matriks (A*B) [0][2] : {"+mtrks1[0][0]+"x"+mtrks2[0][2]+"} + {"+mtrks1[0][1]+"x"+mtrks2[1][2]+"}");
		System.out.println("Matriks (A*B) [1][0] : {"+mtrks1[1][0]+"x"+mtrks2[0][0]+"} + {"+mtrks1[1][1]+"x"+mtrks2[1][0]+"}");
		System.out.println("Matriks (A*B) [1][1] : {"+mtrks1[1][0]+"x"+mtrks2[0][1]+"} + {"+mtrks1[1][1]+"x"+mtrks2[1][1]+"}");
		System.out.println("Matriks (A*B) [1][2] : {"+mtrks1[1][0]+"x"+mtrks2[0][2]+"} + {"+mtrks1[1][1]+"x"+mtrks2[1][2]+"}");
		System.out.println("Hasil Perkalian Matriks A*B");
		for(x=0; x<2; x++){
		System.out.print("|");
		for(y=0; y<3; y++){
		System.out.print(mtrks3[x][y]+"\t");
		}
		System.out.println("|");
		}
	}
	else{
	System.out.println("Error!");
	System.out.println("Anda Salah Menginput Ordo");
	}
    break;
  }
  System.out.println("Terima Kasih Telah Menggunakan Program Matriks INI");
}
}
