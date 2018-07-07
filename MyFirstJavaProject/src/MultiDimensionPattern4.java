//import java.util.Scanner;

public class MultiDimensionPattern4 {

	public static void main(String[] args) {
		//Scanner s = new Scanner(System.in);
		//System.out.print("Enter no. of line to print:");
		//int lno = s.nextInt();
		int m = 5;
		int i,j,k;
		for(i = 1;i <= m; i++){ 
			for(j = 1;j <= m-i; j++){
			System.out.print(" ");
			}
		for(k=1;k<=i;k++){
			System.out.print(k + " ");}
		
		System.out.println(" ");
		}
	}}


