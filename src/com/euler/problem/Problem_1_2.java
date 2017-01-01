package com.euler.problem;

/**
 * @author Hasan
 * @version java version "1.8.0_92"
 * @os windows 10
 * @date Jan 1, 2017
 * 
 * formula: n*(n+1)/2
 */
public class Problem_1_2 {

     public static void main(String[] args) {
          int nr = 1000;
          nr--;
          int x3 = nr / 3;
          int x5 = nr / 5;
          int x15 = nr / 15;

          long sum1 = 3 * x3 * (x3 + 1)/2;
          long sum2 = 5 * x5 * (x5 + 1)/2;
          long sum3 = 15 * x15 * (x15 + 1)/2;

          long sum = (sum1 + sum2 - sum3);
          System.out.println(sum);
     }
}
