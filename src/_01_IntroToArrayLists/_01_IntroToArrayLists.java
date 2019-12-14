package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList class
		ArrayList<String> strings = new ArrayList<String>();
		// 2. Add five Strings to your list
		strings.add("a");
		strings.add("b");
		strings.add("c");
		strings.add("d");
		strings.add("e");
		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < strings.size(); i++) {
			String s = strings.get(i);
			System.out.println(s);
		}
		System.out.println(" ");
		// 4. Print all the Strings using a for-each loop
		for (String st : strings) {
			System.out.println(st);
		}
		System.out.println(" ");
		// 5. Print only the even numbered elements in the list.
		for (int i = 0; i < strings.size(); i++) {
			if (i % 2 == 1) {
				String str = strings.get(i);
				System.out.println(str);
			}
		}
		System.out.println(" ");
		// 6. Print all the Strings in reverse order.
		for (int i = strings.size()-1;i >= 0; i--) {
			String stri = strings.get(i);
			System.out.println(stri);
		}
		System.out.println(" ");
		// 7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < strings.size(); i++) {
			String strin = strings.get(i);
			if (strin.contains("e")) {
				System.out.println(strin);
			}
		}
	}
}
