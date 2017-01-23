package com.euler.problem;

import java.math.BigInteger;

/**
 * 5. Smallest multiple: 2520 is the smallest number that can be divided by each
 * of the numbers from 1 to 10 without any remainder. What is the smallest
 * positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Problem_5_2 {

     public static void main(String[] args) {
          BigInteger smallest = BigInteger.ONE;
          for (int i = 1; i <= 5; i++) {
               smallest = getLeastCommonMultiples(BigInteger.valueOf(i), smallest);
          }
          System.out.println("Smallest is :" + smallest);
     }

     private static BigInteger getLeastCommonMultiples(BigInteger x, BigInteger y) {

          return x.divide(x.gcd(y).multiply(y));
     }

}
