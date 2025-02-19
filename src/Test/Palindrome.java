package Test;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x=121;
		
		String t= Integer.toString(x);
		
		List<String> st = new <String>ArrayList();
		List<String> sv = new <String>ArrayList();
		
		for(int i=0;i<t.length();i++) {
			
			
			String h= String.valueOf(t.charAt(i));
			st.add(h);
			
		}
		
		for(int j=t.length()-1;j>=0;j--) {
			
			String k=String.valueOf(t.charAt(j));
			sv.add(k);
			
		}
		
		st.stream().forEach(a->System.out.println(a));
		sv.stream().forEach(b->System.out.println(b));
		
		boolean sg=st.equals(sv);
		 System.out.println("Palindrom " + sg);
	}

}
