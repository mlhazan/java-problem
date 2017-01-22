package com.interview.problem;

/**
 * @author Hasan
 * @version java version "1.8.0_92"
 * @os windows 10
 * @date Jan 8, 2017
 */
public class Permutation_2 {

     public static void main(String[] args) {

          int[] a = {1, 2, 3, 4};
          permute(0, a);
     }

     public static void permute(int start, int[] input) {
          if (start == input.length) {
               //System.out.println(input);
               for (int x : input) {
                    System.out.print(x);
               }
               System.out.println("");
               return;
          }
          for (int i = start; i < input.length; i++) {
               // swapping
               int temp = input[i];
               input[i] = input[start];
               input[start] = temp;
               // swap(input[i], input[start]);

               permute(start + 1, input);
               // swap(input[i],input[start]);

               int temp2 = input[i];
               input[i] = input[start];
               input[start] = temp2;
          }
     }
}
