package com.euler.problem;

/**
 * @author Hasan
 * @version java version "1.8.0_92"
 * @os windows 10
 * @date Jan 1, 2017
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we
 * get 3, 5, 6 and 9. The sum of these multiples is 23. Find the sum of all the
 * multiples of 3 or 5 below 1000.
 */
public class Problem_1_1 {

     public static void main(String[] args) {
          int m = 0, n = 0, o = 0;
          for (int i = 1; i < 1000; i++) {
               if (i % 3 == 0) {
                    m = m + i;
               }
               if (i % 5 == 0) {
                    n = n + i;
               }
               if (i % 15 == 0) {
                    o = o + i;
               }

          }
          int total = m + n - o;
          System.out.println(total);

          int result = 0;
          for (int i = 1; i < 1000; i++) {
               if (((i % 3) == 0) || ((i % 5) == 0)) {
                    result += i;
               }
          }
          System.out.println(result);
     }
}
