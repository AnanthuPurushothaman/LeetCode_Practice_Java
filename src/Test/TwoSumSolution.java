package Test;

import java.util.Arrays;

public class TwoSumSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int target =9;
		int[] num = {1, 2, 3, 4,7};

		TwoSum ts= new TwoSum();
		
		int [] result=ts.twoSum(num, target);
		
		System.out.println("Indices: " + Arrays.toString(result));
		

	}
	

}
