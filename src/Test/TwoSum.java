package Test;

public class TwoSum{
	
	
	

	public int[] twoSum(int[] num, int target) {
		// TODO Auto-generated method stub
		
		//create a smaple array to store the selected elements.
		//loop through the array and add consicutive elements.
		//int[] num = {1, 2, 3, 4,7};
		
		int loc[]= new int[2];
		
		for(int i=0;i<num.length;i++) {
			
//			System.out.println(num[i]);
			
			
			
			for(int k=i;k<num.length;k++) {
				
				
				
				if(num[i]+num[k]==target) {
					
					loc[0]=i;
					loc[1]=k;
				}
				
			}
			
			
		}
		
		return loc;
		
		
	}
	
	

	
	
	
	}


