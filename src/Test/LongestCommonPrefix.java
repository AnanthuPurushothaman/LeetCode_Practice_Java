package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] firstSet=new String[3];
		firstSet[0]="flower";
		firstSet[1]="flow";
		firstSet[2]="flight";
		
		//get the first two value of the 0th element
		//"fl" compare it with 1st and 2nd element.
		
		
		int i=0;
		List<String> splitedElements=new <String>ArrayList();;
		
		for(i=0;i<firstSet.length;i++) {
			
			String t= firstSet[i];
			for(int j=0;j<t.length()-1;j++) {
				
			String splitedElement=t.substring(j,j+2);
			splitedElements.add(splitedElement);
			
			}
			
				
			}
		
		//splitedElements.stream().forEach(a->System.out.println(a));
			
		List<Entry<String, Long>>list3=	splitedElements.stream().collect(Collectors.groupingBy(item->item,Collectors.counting())).entrySet().stream().collect(Collectors.toList());
		
		Optional<Object> output =list3.stream().max((entry1,entry2)->entry1.getValue().compareTo(entry2.getValue())).map(entry->entry.getKey().toString());
//	.stream().max((entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue())) // Find max by count
//       .map(Map.Entry::getKey) // Get the item with the highest count
//       .orElse("No duplicates found");

		System.out.println(output);
		
		
		}
		
		

	

}
