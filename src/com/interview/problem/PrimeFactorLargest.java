package com.interview.problem;

/**
 * @author Hasan
 * @version java version "1.8.0_92"
 * @os windows 10
 * @date Jan 6, 2017
 */
public class PrimeFactorLargest {

     public static void main(String[] args) {
          int m = 0, n = 0;
          for (int i = 2; i < 18; i++) {
               int a = 0;

               for (int j = 1; j < i; j++) {
                    if (i % j == 0) {
                         a++;
                         m = i;
                    }
               }
               if (a == 1) {
                    System.out.print(i + " ");
               }

          }
          System.out.println("\nThe largest Factoer is " + m);
     }
}
