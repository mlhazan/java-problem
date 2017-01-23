package com.euler.problem;

/**
 * A palindromic number reads the same both ways. The largest palindrome made
 * from the product of two 2-digit numbers is 9009 = 91 × 99. Find the largest
 * palindrome made from the product of two 3-digit numbers.
 */
public class Problem_4_1 {

     public boolean isPalindrome(String s) {
          //if odd length then remove middle character
          if (s.length() % 2 != 0) {
               s = s.substring(0, s.length() / 2) + s.substring((s.length() / 2) + 1);
          }

          return new StringBuffer(s.substring(0, s.length() / 2)).
                  reverse().toString().equals(s.substring(s.length() / 2));
     }

     public static void main(String[] args) {
          Problem_4_1 e = new Problem_4_1();
          long biggest = 0;

          int a = 999, b = 999;
          for (int bb = b; bb > 0; bb--) {
               for (int aa = a; aa > 0; aa--) {
                    if (e.isPalindrome(Integer.toString(aa * bb))) {
                         if (aa * bb > biggest) {
                              biggest = aa * bb;
                         }
                    }
               }
          }

          System.out.println(biggest);
     }
}
