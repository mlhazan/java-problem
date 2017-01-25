package com.ctci.array_string;

/**
 * Given two String, write a method to decide if one is permutation of another
 */
public class Problem_1_3 {

     public static void main(String[] args) {
          String a = "aacaa";
          String b = "aavaa";
         
          System.out.println(permutation(a, b));
     }

     private static boolean permutation(String a, String b) {
          if (a.equals(b)) {
               for (int i = 0; i < a.length(); i++) {
                    for (int j = b.length()-1; j >= 0; j--) {
                         if (a.charAt(i) == b.charAt(j)) {
                              return true;
                         }
                    }
               }
          }
          return false;
     }
}
