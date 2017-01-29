package com.ctci.array_string;
/**
 * @author Hasan
 * Implement a method to perform basic string compression using the counts
 * of repeated characters. For example, the string aabcccccaaa would become
 * a2blc5a3. If the "compressed" string would not become smaller than the original
 * string, your method should return the original string.
 */
public class Problem_1_5_1 {

     public static int setChar(char[] array, char c, int index, int count) {
          array[index] = c;
          index++;
          char[] cnt = String.valueOf(count).toCharArray();
          for (char x : cnt) {
               array[index] = x;
               index++;
          }
          return index;
     }

     public static String compress(String str) {
          char[] array = new char[str.length()];
          int index = 0;
          char last = str.charAt(0);
          int count = 1;
          for (int i = 1; i < str.length(); i++) {
               if (str.charAt(i) == last) {
                    count++;
               } else {
                    index = setChar(array, last, index, count);
                    last = str.charAt(i);
                    count = 1;
               }
          }
          index = setChar(array, last, index, count);
          return String.valueOf(array);
     }

     public static void main(String[] args) {
          String str = "abbccccccde";
          String str2 = compress(str);

          System.out.println("Old String (length =" + str.trim().length() + "): " + str);
          System.out.println("New String (length =" + str2.trim().length() + "): " + str2);

     }
}
