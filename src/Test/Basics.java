package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Basics {
	
	public static void main(String[] args) {
	
		//user defines two arrays 
		//merge two arrays
	   //find the largest string
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First array size");
		int arrsize=scanner.nextInt();
		
		String[] mylist= new String[arrsize];
		
		
		scanner.nextLine();
		for(int i=0;i<mylist.length;i++) {
			
			System.out.println("Enter the "  + i +  " element\"");
			String items=scanner.nextLine();
			mylist[i]=items;
			
		}
		System.out.println("Enter the size of second array");
		int arrsize2=scanner.nextInt();
		String[] mylist2= new String[arrsize2];
		scanner.nextLine();
		for(int j=0;j<mylist2.length;j++) {
			
			System.out.println("Enter the"  + j + " element");
			String items2=scanner.nextLine();
			mylist2[j]=items2;
		}
		
		List<String> myArray=Arrays.asList(mylist);
	    List<String>myArray2=Arrays.asList(mylist2);
	    
	    
	    
	    List<String> comList= new <String>ArrayList();
	    
	    comList=  Stream.concat(myArray.stream(), myArray2.stream()).collect(Collectors.toList());
//	    System.out.println("This is the filtered array");
//	    comList.stream().distinct().forEach(a->System.out.println(a));
	    
	    //I have an arryList now with  some strings
	    //need to find the largest string
	    
	    String largestString = "";
	    int initialStringLength=0;
	    
	    for(int p=0;p<comList.size();p++) {
	    	
	    	int stringLength=comList.get(p).length();
	    	
	    	if(stringLength>initialStringLength) {
	    		
	    		initialStringLength=stringLength;
	    		largestString=comList.get(p);
	    	}
	    	 
	    }
	    System.out.println(largestString);
	    
		
	     
	 
	 
	 
	 
		
		
	}
}



	
