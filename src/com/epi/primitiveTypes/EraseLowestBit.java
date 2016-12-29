package com.epi.primitiveTypes;

public class EraseLowestBit {

     public static void main(String[] args) {
          short result = 0;
          long x = 9;
          while (x != 0) {
               result ^= 1;
               x &= x - 1;
          }
          System.out.println(result);
     }
}
