package com.ctci.array_string;

import java.util.Scanner;

/**
 * @author Hasan Implement an algorithm to determine if a string has all unique
 * character. what if you cannot use additional data structure
 */
public class Problem_1_1 {

     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          String s = scanner.nextLine();
          char c[] = s.toCharArray();

          if (unique(c)) {
               System.out.println("Unique");
          } else {
               System.out.println("Not Unique");
          }
     }

     private static boolean unique(char[] c) {
          int m = c.length;
          for (int i = 0; i < m; i++) {
               for (int j = i + 1; j < m; j++) {
                    if (c[i] == c[j]) {
                         return false;
                    }
               }
          }
          return true;
     }
}
