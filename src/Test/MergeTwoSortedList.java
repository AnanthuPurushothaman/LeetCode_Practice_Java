package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoSortedList {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		List<Integer> list1 = new <Integer>ArrayList();

		list1.add(1);
		list1.add(2);
		list1.add(4);
		list1.add(3);
		list1.add(5);

		List<Integer> list2 = new <Integer>ArrayList();

		list2.add(1);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(1);
		list2.add(6);
		
		List<Integer> list3 = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
		
		list3.stream().sorted().forEach(a->System.out.println(a));
		
		
		

	}

}
