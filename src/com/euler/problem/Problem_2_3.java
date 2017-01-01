package com.euler.problem;

/**
 * @author Hasan
 * @version java version "1.8.0_92"
 * @os windows 10
 * @date Jan 1, 2017
 */
public class Problem_2_3 {

     public static void main(String[] args) {
          int b = 1;
          int c = 2, d;
          long sum = 0;
          while (c < 4000000) {
               sum += c;
               d = b + (c << 0x01);
               c = d + b + c;
               b = d;
          }
          System.out.println(sum);
     }
}
