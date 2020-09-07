package stack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author Shiva
 *
 */
public class Challenge {

	public static void main(String[] args) {

		String ididdidi = "i did, did I?";
		String racecar = "Racecar";
		String hello = "Hello";
		String any = " race ,,,,,,,,,,,,,,,,,,454 %^&%% C@##$ A (&**r"; // Custom test case

		List<String> list = Arrays.asList(ididdidi, racecar, hello, any);
		int i = 0;
		int j = 0;
		while (list.size() != i) {
			System.out.println(isPalindrome(list.get(i++).toLowerCase()) + " --->> " + list.get(j++));
		}

	}

	/**
	 * This method checks if the string is palindrome or not? Ignores cases and
	 * punctuation.
	 * 
	 * @param string
	 * @author Shiva
	 * @return
	 */
	public static boolean isPalindrome(String str) {

		String value = str.toLowerCase();
		LinkedList<Character> charList = new LinkedList<>();
		for (int i = 0; i < value.length(); i++) {

			if (value.charAt(i) >= 'a' && value.charAt(i) <= 'z')
				charList.push(value.charAt(i));
		}

		for (int i = 0; i < value.length(); i++) {

			if (value.charAt(i) >= 'a' && value.charAt(i) <= 'z') {
				char poppedValue = charList.pop();
				if (poppedValue == value.charAt(i))
					continue;
				else
					return false;
			}
		}
		return true;
	}
}
