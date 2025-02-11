package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> roman = new HashMap();
		roman.put("I", 1);
		roman.put("V", 5);
		roman.put("X", 10);
		roman.put("L", 50);
		roman.put("C", 100);
		roman.put("D", 500);
		roman.put("M", 1000); //

		roman.put("IV", 4);
		roman.put("IX", 9);
		roman.put("XL", 40);
		roman.put("XC", 90);
		roman.put("CD", 400);
		roman.put("CM", 900);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Romen value");
		String romanInput = scanner.nextLine();
		
		String rom3 = "";// Contains MC
		String rom1 = "";// contains M
		int result = 0;
		int romSum = 0;

		List<String> splitedRoman = new <String>ArrayList();

		for (int i = 0; i < romanInput.length(); i++) {// M CM X CV I

			// I is taken

			rom1 = String.valueOf(romanInput.charAt(i));
			if (i == romanInput.length() - 1) {
				splitedRoman.add(rom1);

			}

			for (int k = i + 1; k < romanInput.length(); k++) {// K=nothing available

				String rom2 = String.valueOf(romanInput.charAt(k));
				rom3 = rom1.concat(rom2); // CV

				if (roman.containsKey(rom3)) {

					splitedRoman.add(rom3);// CV in the list
					i++;

				} else {

					splitedRoman.add(rom1);// so M is added to the split list

				}

				break;

			}

		}

		splitedRoman.stream().forEach(a -> System.out.println(a));

		for (int g = 0; g < splitedRoman.size(); g++) {

			String SingleRomen = splitedRoman.get(g);

			for (String key : roman.keySet()) {

				if (key.equals(SingleRomen)) {

					romSum = romSum + roman.get(key);
				}

			}
		}
		System.out.println("The int output is" + ":" + romSum);

	}

}
