package com.ctci.array_string;

public class Problem_1_4_2 {
     // Assume string has sufficient free space at the end

     public static void replaceSpaces(char[] str, int length) {
          int spaceCount = 0, index, i;
          for (i = 0; i < length; i++) {
               if (str[i] == ' ') {
                    spaceCount++;
               }
          }
          index = length + spaceCount * 2;
          str[index] = '\0';
          for (i = length - 1; i >= 0; i--) {
               if (str[i] == ' ') {
                    str[index - 1] = '0';
                    str[index - 2] = '2';
                    str[index - 3] = '%';
                    index = index - 3;
               } else {
                    str[index - 1] = str[i];
                    index--;
               }
          }
     }

     public static void main(String[] args) {
          String str = "Mr  John Smith  ";
          String s = str.trim();
          char[] arr = new char[s.length() * 2];
          for (int i = 0; i < s.length(); i++) {
               arr[i] = s.charAt(i);
          }
          replaceSpaces(arr, str.length());
          System.out.println(charArrayToString(arr));
     }

     public static String charArrayToString(char[] array) {
          StringBuilder buffer = new StringBuilder(array.length);
          for (char c : array) {
               if (c == 0) {
                    break;
               }
               buffer.append(c);
          }
          return buffer.toString();
     }
}
