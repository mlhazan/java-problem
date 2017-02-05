
package com.ctci.array_string;

public class Problem_1_4 {
     public static void main(String[] args) {
          String s = "Mr John Smith   ";         
          String ss = s.trim();
          String replaceAll = ss.replaceAll("\\s+","%20");
          System.out.println(replaceAll);
     }
}
