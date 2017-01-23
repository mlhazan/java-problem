package com.euler.problem;

/**
 * 5. Smallest multiple: 2520 is the smallest number that can be divided by each
 * of the numbers from 1 to 10 without any remainder. What is the smallest
 * positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Problem_5_1 {

     public static void main(String[] args) {
          int smallest = 1;
          while (!checkNumber(smallest)) {
               smallest++;
          }
          System.out.println("Smallest number is :" + smallest);
     }

     public static boolean checkNumber(int n) {
          for (int i = 1; i <= 5; i++) {
               if (n % i != 0) {
                    return false;
               }

          }
          return true;
     }
}
