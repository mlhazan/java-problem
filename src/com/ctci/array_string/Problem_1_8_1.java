package com.ctci.array_string;

import java.util.Arrays;

public class Problem_1_8_1 {

     public static void main(String[] args) {
          String s1 = "waterbottleaa";
          String s2 = "erbottlewat";

          char[] ss1 = s1.toCharArray();
          char[] ss2 = s2.toCharArray();

          Arrays.sort(ss1);
          Arrays.sort(ss2);

          s1 = String.valueOf(ss1);
          s2 = String.valueOf(ss2);
          
          System.out.println(isSubstring(s1, s2));
     }

     private static boolean isSubstring(String ss1, String ss2) {
         
          return ss1.toLowerCase().contains(ss2.toLowerCase());
     }
}
