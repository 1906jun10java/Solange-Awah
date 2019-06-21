import java.util.Scanner;

public class Thursday {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Thursday object = new Thursday();
		
		System.out.println("PLease enter the number of rows of the triangle: ");
		int numRows = sc.nextInt();
		System.out.println("Number of bocks in the triangle: "+object.triangle(numRows));
		sc.close();
	}
	
	public int triangle (int numRows) {
		if(numRows == 1) {
			return 1;
		}else {
			return numRows = numRows+triangle(numRows-1);
		}
	}
}
