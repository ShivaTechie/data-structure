package queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Challenge {

	public static void main(String[] args) {

		String ididdidi = "i did, did I?";
		String racecar = "Racecar";
		String hello = "Hello";
		String any = " ra^&c^%%e ,,,,,,,,,,,,,,,,,,454 %^&%% C@##$ A (&**r"; // Custom test case

		List<String> list = Arrays.asList(ididdidi, racecar, hello, any);
		int i = 0;
		int j = 0;
		while (list.size() != i) {
			System.out.println(isPalindrome(list.get(i++)) + " --->> " + list.get(j++));
		}

	}

	/**
	 * This method checks if the string is palindrome or not? Ignores cases and
	 * punctuation. Uses both stack and queue.
	 * 
	 * @param value
	 * @author Shiva
	 * @return
	 */
	public static boolean isPalindrome(String str) {

		String value = str.toLowerCase();
		LinkedList<Character> queue = new LinkedList<>();
		LinkedList<Character> stack = new LinkedList<>();
		for (int i = 0; i < value.length(); i++) {
			if (value.charAt(i) >= 'a' && value.charAt(i) <= 'z') {
				queue.add(value.charAt(i));
				stack.push(value.charAt(i));
			}
		}
		while (!queue.isEmpty() && !stack.isEmpty()) {
			if (queue.remove() == stack.pop())
				continue;
			else
				return false;
		}
		return true;
	}
}
