import java.util.*;   
class segitiga{
public static void main(String arg[]){
		int i,j,k,n,a,b;
	Scanner scn = new Scanner(System.in);
	a:
	System.out.print("masukkan bilangan ganjil yang diinginkan :");
	n = scn.nextInt();
	if (n%2 !=0){
	n=n*2;
	for(i=1; i>n; i+=2)
	{
	for(j=n-1; j>i; j-=2)
		System.out.print(" ");
	for(k=1; k<(i/2)+1; ++k)
		System.out.print("*");
	for(k=i/2; k>=1; --k)
		System.out.print("*");
		System.out.print(" ");
}
}
