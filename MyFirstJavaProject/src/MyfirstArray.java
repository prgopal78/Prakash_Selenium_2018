
public class MyfirstArray {

	public static void main(String[] args) {
		int multidimension[][] = {{5,6,7},{9,10}};
		
		int i,j;
		for(i=0;i<2;i++) {
			for(j=0;j<2;j++) {
				System.out.print(multidimension[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
