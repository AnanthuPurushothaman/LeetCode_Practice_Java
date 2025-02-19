package Test;

public class FirstOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String hatstack="java,sceleniun,TestNg,Maven";
		
		
	   String[]parts=	hatstack.split(",",4);
		
	   for(int i=0;i<parts.length;i++) {
		   
		   System.out.println(parts[i]);
	   }
		
//		for(int i=0; i< hatstack.length();i++) {
//			
//		
//		   String name1=String.valueOf(hatstack.charAt(i));
//		   
//		  if(name1.equals(",")) {
//			  
//			int index=  hatstack.indexOf(i);
//			
//			hatstack.trim().charAt(index);
//		  }
//		   
//		   
//		}
		

	}

}
