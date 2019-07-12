package _03_goofy_names;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {

		// 1. Ask the user to enter their name
		String goofyName = JOptionPane.showInputDialog("What is your name?");
		// 2. Print upper case name to the console using .toUpperCase()
		// Run your program to see that this works.
		goofyName.toUpperCase();
		System.out.println(goofyName.toUpperCase());
		// 3. Loop through each character of the name (steps 4 - 6).
		// HINT: Use .length() to determine the number of characters in the String.

		int length = goofyName.length();
		for (int x = 0; x < length; x++) {

			// 4. Create a String variable to store the next character of the name
			// using .substring(start, end)
			// HINT: replace 'start' and 'end' to get String with character at i
			System.out.println(x);
			String s = goofyName.substring(x, x + 1);

			// 5. Use MODULO to set this variable to upper case for EVEN characters
			// and lower case for ODD characters.
			if (x % 2 == 0) {
				s.toUpperCase();
				System.out.print(s.toUpperCase());
				goofyName=goofyName+s.toUpperCase();
			} else {
				s.toLowerCase();
				System.out.print(s.toLowerCase());
				goofyName=goofyName+s.toLowerCase();
			}

			// 6. ADD this String (containing 1 char) to the goofyName String
			goofyName=goofyName+s;
		}

		// 7. Use pop-up to show user their Goofy name
JOptionPane.showMessageDialog(null, "Your goofy name is"+ goofyName);
	}
}
