import java.util.Scanner;
class matriks_kombinasi{
public static void main(String args[]){
	int pil, x, y, a, b;
    Scanner input = new Scanner(System.in);

System.out.println("Selamat datang di program perhitungan matriks ");
System.out.println("Ketentuan : ");
System.out.println("-Program pengurangan dan penjumlahan matriks apabila baris matriks A=B dan kolom matriks A=B");
System.out.println("-Program hanya bisa mengalikan matriks berordo 2x2 dikali 2x3");
System.out.println("Inputkan pilihan Anda");
System.out.println("1. Operasi penjumlahan matriks");
System.out.println("2. Operasi pengurangan matriks");
System.out.println("3. Operasi perkalian matriks");
System.out.print("Pilihan Anda : ");
pil = input.nextInt();

  System.out.print("Inputkan baris matriks A: ");int baris1 = input.nextInt();
  System.out.print("Inputkan kolom matriks A : ");int kolom1 = input.nextInt();
  System.out.println();
  System.out.print("Inputkan baris matriks B: ");int baris2 = input.nextInt();
  System.out.print("Inputkan kolom matriks B : ");int kolom2 = input.nextInt();
  int[][] matriks1 = new int[baris1][kolom1];
  int[][] matriks2 = new int[baris2][kolom2];
  int[][] matriks3 = new int[3][3];
 
switch(pil){
  case 1:
  if(baris1==baris2 && kolom1==kolom2){
	System.out.println("Anda akan melakukan operasi penjumlahan matriks");
	for(x=0; x<baris1;x++){
		for(y=0; y<kolom1;y++){
		System.out.print("matriks A ["+(x+1)+"]["+(y+1)+"] : ");
		matriks1[x][y]=input.nextInt();
		}
    }
	System.out.println();
	for(x=0; x<baris2;x++){
		for(y=0; y<kolom2;y++){
		System.out.print("matriks B ["+(x+1)+"]["+(y+1)+"] : ");
		matriks2[x][y]=input.nextInt();
		}
    }
	System.out.println();	
	System.out.println("Matriks A");
	for(x=0;x<baris1;x++){
	System.out.print("|");
        for(y=0;y<kolom1;y++){
        System.out.print(+(matriks1[x][y])+ " ");
        }
	System.out.println("|");
    }
	System.out.println();
	System.out.println("Matriks B");
	for(x=0;x<baris2;x++){
	System.out.print("|");
        for(y=0;y<kolom2;y++){
        System.out.print(+(matriks2[x][y])+ " ");
        }
	System.out.println("|");
    }
	System.out.println();
	System.out.println("Step Perhitungan Matriks A+B");
	for (x= 0; x <baris1; x++){
	System.out.print("|");
		for (y = 0; y <kolom1; y++){
		System.out.print(" "+matriks1[x][y]+"+"+matriks2[x][y]+" ");
		}
	System.out.println("|");
    }	
	System.out.println();
	System.out.println("Hasil Perhitungan Matriks A+B");
	for (x= 0; x <baris1; x++){
	System.out.print("|");
		for (y = 0; y <kolom1; y++){
		System.out.print(" "+(matriks1[x][y]+matriks2[x][y])+" ");
		}
	System.out.println("|");
    }	
	}
	else{
	System.out.println("Program tidak dapat dijalankan!!");
	System.out.println("Ordo matriks tidak sesuai ketentuan!!");
	}
    break;
		
  case 2:
	if(kolom1==kolom2 && baris1==baris2){
	System.out.println("Anda akan melakukan operasi pengurangan matriks");
	for(x=0; x<baris1;x++){
		for(y=0; y<kolom1;y++){
		System.out.print("matriks A ["+(x+1)+"]["+(y+1)+"] : ");
		matriks1[x][y]=input.nextInt();
		}
    }
	System.out.println();
	for(x=0; x<baris2;x++){
		for(y=0; y<kolom2;y++){
		System.out.print("matriks B ["+(x+1)+"]["+(y+1)+"] : ");
		matriks2[x][y]=input.nextInt();
		}
    }
	System.out.println();
	System.out.println("Matriks A");
	for(x=0;x<baris1;x++){
	System.out.print("|");
        for(y=0;y<kolom1;y++){
        System.out.print(+(matriks1[x][y])+ " ");
        }
	System.out.println("|");
    }
	System.out.println();
	System.out.println("Matriks B");
	for(x=0;x<baris2;x++){
	System.out.print("|");
        for(y=0;y<kolom2;y++){
        System.out.print(+(matriks2[x][y])+ " ");
        }
	System.out.println("|");
    }
	System.out.println();
	System.out.println("Step Perhitungan Matriks A-B");
	for (x= 0; x <baris1; x++){
	System.out.print("|");
		for (y = 0; y <kolom1; y++){
		System.out.print(" "+matriks1[x][y]+"-"+matriks2[x][y]+" ");
		}
	System.out.println("|");
    }	
	System.out.println();
	System.out.println("Hasil Perhitungan Matriks A-B");
	for (x= 0; x <baris1; x++){
	System.out.print("|");
		for (y = 0; y <kolom1; y++){
		System.out.print(" "+(matriks1[x][y]-matriks2[x][y])+" ");
		}
	System.out.println("|");
    }	
	}
	else{
	System.out.println("Program tidak dapat dijalankan!!");
	System.out.println("Ordo Matriks tidak sesuai ketentuan!!");
	}
	break;
  case 3:
  if(baris1==2 && kolom1==2 && baris2==2 && kolom2==3){
  System.out.println("Anda akan melakukan operasi penjumlahan matriks");
	for(x=0; x<baris1;x++){
		for(y=0; y<kolom1;y++){
		System.out.print("matriks A ["+(x+1)+"]["+(y+1)+"] : ");
		matriks1[x][y]=input.nextInt();
		}
    }
	System.out.println();
	for(x=0; x<baris2;x++){
		for(y=0; y<kolom2;y++){
		System.out.print("matriks B ["+(x+1)+"]["+(y+1)+"] : ");
		matriks2[x][y]=input.nextInt();
		}
    }
	System.out.println();	
	System.out.println("Matriks A");
	for(x=0;x<baris1;x++){
	System.out.print("|");
        for(y=0;y<kolom1;y++){
        System.out.print(+(matriks1[x][y])+ " ");
        }
	System.out.println("|");
    }
	System.out.println();
	System.out.println("Matriks B");
	for(x=0;x<baris2;x++){
	System.out.print("|");
        for(y=0;y<kolom2;y++){
        System.out.print(+(matriks2[x][y])+ " ");
        }
	System.out.println("|");
    }
	System.out.println();
	System.out.println("Step Perhitungan Matriks A+B");
		matriks3[0][0]= matriks1[0][0]*matriks2[0][0]+matriks1[0][1]*matriks2[1][0];
		matriks3[0][1]= matriks1[0][0]*matriks2[0][1]+matriks1[0][1]*matriks2[1][1];
		matriks3[0][2]= matriks1[0][0]*matriks2[0][2]+matriks1[0][1]*matriks2[1][2];
		matriks3[1][0]= matriks1[1][0]*matriks2[0][0]+matriks1[1][1]*matriks2[1][0];
		matriks3[1][1]= matriks1[1][0]*matriks2[0][1]+matriks1[1][1]*matriks2[1][1];
		matriks3[1][2]= matriks1[1][0]*matriks2[0][2]+matriks1[1][1]*matriks2[1][2];
		System.out.println("Matriks (A*B) [0][0] : {"+matriks1[0][0]+"x"+matriks2[0][0]+"} + {"+matriks1[0][1]+"x"+matriks2[1][0]+"}");
		System.out.println("Matriks (A*B) [0][1] : {"+matriks1[0][0]+"x"+matriks2[0][1]+"} + {"+matriks1[0][1]+"x"+matriks2[1][1]+"}");
		System.out.println("Matriks (A*B) [0][2] : {"+matriks1[0][0]+"x"+matriks2[0][2]+"} + {"+matriks1[0][1]+"x"+matriks2[1][2]+"}");
		System.out.println("Matriks (A*B) [1][0] : {"+matriks1[1][0]+"x"+matriks2[0][0]+"} + {"+matriks1[1][1]+"x"+matriks2[1][0]+"}");
		System.out.println("Matriks (A*B) [1][1] : {"+matriks1[1][0]+"x"+matriks2[0][1]+"} + {"+matriks1[1][1]+"x"+matriks2[1][1]+"}");
		System.out.println("Matriks (A*B) [1][2] : {"+matriks1[1][0]+"x"+matriks2[0][2]+"} + {"+matriks1[1][1]+"x"+matriks2[1][2]+"}");
		System.out.println("Hasil Perhitungan Matriks A*B");
		for(x=0; x<2; x++){
		System.out.print("|");
		for(y=0; y<3; y++){
		System.out.print(matriks3[x][y]+"\t");
		}
		System.out.println("|");
		}
	}
	else{
	System.out.println("Program error!!");
	System.out.println("Ordo matriks tidak sesuai ketentuan!!");
	}
    break;
  }
}
}