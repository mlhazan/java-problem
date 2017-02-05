package com.ctci.array_string;

import static java.util.Arrays.sort;

/**
 * Given two String, write a method to decide if one is permutation of another
 */
public class Problem_1_3 {

     public static void main(String[] args) {
          String a = "aaccccccaa";
          String b = "aaccccccca";

          char c[] = a.toCharArray();
          java.util.Arrays.sort(c);

          char d[] = b.toCharArray();
          java.util.Arrays.sort(d);
          System.out.println(permutation(c, d));
     }

     private static boolean permutation(char a[], char b[]) {
          int num = 0;
          if (a.length != b.length) {
               return false;
          }
          else  {
               for (int i = 0; i < a.length; i++) {

                    if (a[i] != b[i]) {
                         num--;
                    }
               }
          }
          return num >= 0;
     }
}
