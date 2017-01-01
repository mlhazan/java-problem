package com.euler.problem;

/**
 * @author Hasan
 * @version java version "1.8.0_92"
 * @os windows 10
 * @date Jan 1, 2017
 */
public class Problem_2_2 {

     public static void main(String[] agrs) {
          int first = 0;
          int second = 1;
          int bound = 4_000_000;
          int evenSum = 0;

          boolean exceed = false; //when fib numbers > bound
          while (!exceed) {
               int newFib = first + second;
               first = second;
               second = newFib;

               if (newFib > bound) {
                    exceed = true;
                    break;
               }

               if (newFib % 2 == 0) {
                    evenSum += newFib;
               }
          }

          System.out.println(evenSum);

     }
}
