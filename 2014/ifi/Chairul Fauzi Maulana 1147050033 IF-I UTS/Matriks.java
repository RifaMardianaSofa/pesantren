class Matriks {
	public static void main (String[] args) {
		int jumlah [][] = new int [2][2];
		int i, j, k = 0;
		//masukan  nilai ke array
		for (i=0;i<2; i++)
			for (j=0; j<2; j++)
				jumlah[i][j] = k++;
		// tampilkan array
		for (i=0; i<2; i++) {
			for (j=0; j<2; j++){
				System.out.print (jumlah[i][j] + " ");
				}
				System.out.println ();
			}
	}
}