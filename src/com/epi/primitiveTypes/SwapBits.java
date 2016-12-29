package com.epi.primitiveTypes;
/**
 * swapBits(214, 2, 3) --> 218
 * 1101 0110 if i swap bit at location 2 and 3
 * 1101 1010-->218
 * 
 * swapBits(114, 1, 2) --> 218
 * 111 0010 if i swap bit at location 1 and 2
 * 111 0100-->116
 * @author Hasan
 */
public class SwapBits {
   

     public static long swapBits(long x, int i, int j) {
          // Extract the i-th and j-th bits, and see if they differ.
          if (((x >>> i) & 1) != ((x >>> j) & 1)) {
               // i-th and j-th bits differ. We will swap them by flipping their values.
               // Select the bits to flip with bitMask. Since x^1 = 0 when x = 1 and 1
               // when x = 0, we can perform the flip XOR.
               long bitMask = (1L << i) | (1L << j);
               x ^= bitMask;
          }
          return x;
     }

     public static void main(String[] args) {

          long x;
          int i, j;

          x = 114;
          i = 1;
          j = 2;

          System.out.println("x = " + x + ", i = " + i + ", j = " + j);
          System.out.println(swapBits(x, i, j));
     }
}
