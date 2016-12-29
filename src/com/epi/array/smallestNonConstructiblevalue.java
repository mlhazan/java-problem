package com.epi.array;
/*
Write a program which takes an array of positive int and returns the smallest
number which is not the sum of the subset of that array
*/
import java.util.*;

public class smallestNonConstructiblevalue {

     public static void main(String[] args) {
          int[] array = {12, 2, 1, 15, 2, 4};
          List<Integer> alist = new ArrayList<>();
          for (int a : array) {
               alist.add(a);
          }
          System.out.println(smallestValue(alist));
     }

     public static int smallestValue(List<Integer> A) {

          Collections.sort(A);
          int maxConstructableValue = 0;
          for (int a : A) {
               if (a > maxConstructableValue + 1) {
                    break;
               }

               maxConstructableValue += a;
          }
          return maxConstructableValue + 1;
     }
}
