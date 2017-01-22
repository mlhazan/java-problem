package com.interview.problem;

public class PrimeNumberRecursive {

     public static void main(String[] args) {
          for (int i = 2; i < 18; i++) {
               if (isPrime(i, i - 1)) {
                    System.out.print(i + " ");
               }
          }
     }

     public static boolean isPrime(int number, int divisor) {
          if (divisor == 1) {
               return true;
          }
          if (number % divisor == 0) {
               return false;
          }
          return isPrime(number, divisor - 1);
     }
}
