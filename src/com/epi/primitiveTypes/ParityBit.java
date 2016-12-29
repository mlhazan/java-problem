package com.epi.primitiveTypes;

/**
 * Get the parity bit of a number
 *
 * @author Hasan
 */
public class ParityBit {

     public static void main(String[] args) {
          long x = 8;
          short result = 0;
          while (x != 0) {
               result ^= x & 1;
               x >>>= 1;
          }
          System.out.println(result);
     }
}
/**
 * 8 = 1000; 
 * 1000 & 1 = 0000 ^ 0000
 * 0100 & 1 = 0000 ^ 0000
 * 0010 & 1 = 0000 ^ 0000
 * 0001 & 1 = 0000 ^ 0001 = 1
 *
 */
