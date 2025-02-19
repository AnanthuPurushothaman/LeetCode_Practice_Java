package Test;

public class NumTriangle {

	public static void main(String[] args) {
		
		int row=3;
		int num=0;//1
		
		for(int i=row;i>0;i--) {
			
			for( int j=0;j<i;j++) {
				
				System.out.print(num);
				num++;
			}
			System.out.println("");
		}
	}
}
//1 2 3 4 
//5 6 7 
//8 9
//10

//1
//2 3
//4 5 6
//7 8 9 10