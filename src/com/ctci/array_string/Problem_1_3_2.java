
package com.ctci.array_string;

public class Problem_1_3_2  {	
	public static boolean permutation(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		
		int[] letters = new int[128];
		 
		char[] s_array = s.toCharArray();
		for (char c : s_array) { // count number of each char in s.
			letters[c]++;  
		}
		  
        char[] t_array = t.toCharArray();
		for (char c : t_array) { // count number of each char in s.
			 if (--letters[c] < 0) {
		    	return false;
		    }
		}
        
//		for (int i = 0; i < t.length(); i++) {
//			int c = (int) t.charAt(i);
//		    if (--letters[c] < 0) {
//		    	return false;
//		    }
//		}
		  
		return true;
	}
	
	public static void main(String[] args) {
		String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			boolean anagram = permutation(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + anagram);
		}
	}
}