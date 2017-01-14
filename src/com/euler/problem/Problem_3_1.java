package com.euler.problem;

/**
 * @author Hasan
 * @version java version "1.8.0_92"
 * @os windows 10
 * @date Jan 6, 2017
 *
 * The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime
 * factor of the number 600851475143 ?
 */
public class Problem_3_1 {

     public static void main(String[] args) {
          Long m = 0L;
          for (long i = 2L; i < 600851475143L; i++) {
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
