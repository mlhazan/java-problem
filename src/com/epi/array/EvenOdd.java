package com.epi.array;

import java.util.Arrays;

/**
 * @author Hasan
 * @version java version "1.8.0_92" Rearrange an array such that the even
 * numbers appear before odds.
 */
public class EvenOdd {

     public static void main(String[] args) {
          int[] a = {6, 3, 5, 2, 1, 8, 9, 23};
          System.out.println(Arrays.toString(a));
          evenOdd(a);
     }

     public static void evenOdd(int a[]) {
          int nextEven = 0, nextOdd = a.length - 1;
          while (nextEven < nextOdd) {
               if (a[nextEven] % 2 == 0) {
                    nextEven++;
               } else {
                    int temp = a[nextEven];
                    a[nextEven] = a[nextOdd];
                    a[nextOdd--] = temp;
               }
          }
          System.out.println(Arrays.toString(a));
     }
}
//