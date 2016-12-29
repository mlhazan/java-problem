package com.epi.primitiveTypes;

/**
 * Create a program that counts no of 1 in a binary number
 *
 * @author Hasan
 */
public class CountBits {

     public static void main(String[] args) {
          int x = 151;
          System.out.println(Integer.toBinaryString(x));
          short numBits = 0;
          while (x != 0) {
               numBits += (x & 1);
               x >>>= 1;
              
          }
          System.out.println(numBits);
     }
}
