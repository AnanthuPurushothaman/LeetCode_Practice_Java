package Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		
		//get a string  containing just the characters '(', ')', '{', '}', '[' and ']'
		//
		
		
		Stack<Character> charStack = new Stack<>();
		Stack<Character> charStack2 = new Stack<>();
		 Map<String,String>map1 =new HashMap();
		 map1.put("(", ")");
		 map1.put("[", "]");
		 map1.put("{", "}");
   
        Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String value");
		String romanInput = scanner.nextLine();
		
		for(int i=0;i<romanInput.length();i++) {
			
			charStack.push(romanInput.charAt(i)) ;
		}

		 for(int j=0;j<charStack.size();j++) {
			 
			 if(charStack.get(j) == '{' |charStack.get(j) == '[' |charStack.get(j) == '(') {
				 
				 charStack2.push(charStack.get(j)); 
				  
			 }
			 
			 for(String key:map1.keySet()) {
				 
				 if(map1.get(key)==String.valueOf(charStack.get(j))) {
					 
					 charStack2.pop(); 
					  
				 }
			 }
		 }
		
			
		 
		 
		 System.out.println("Stack1"+""+charStack);
		 System.out.println("Stack2"+""+charStack2);
	
		
	}

}
