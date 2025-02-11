package Test;

public class NumberPiramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  n=5;
		for(int i=0;i<5;i++) {
			
			System.out.println();
			n--;
			
			for(int j=0;j<n;j++) {
				
				System.out.print("  ");

			}
			for(int k=0;k<2*i-1;k++) {
				
				System.out.print("*");
			}
		
		}

	}

}