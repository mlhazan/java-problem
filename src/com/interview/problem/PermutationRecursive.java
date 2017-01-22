package com.interview.problem;

import java.util.Arrays;

/**
 * @author Hasan
 * @version java version "1.8.0_92"
 * @os windows 10
 * @date Jan 8, 2017
 */
public class PermutationRecursive {

     public void swap(int[] arr, int i, int j) {
          int tmp = arr[i];
          arr[i] = arr[j];
          arr[j] = tmp;
     }

     public void permute(int[] arr, int i) {
          if (i == arr.length) {
               System.out.println(Arrays.toString(arr));
               return;
          }
          for (int j = i; j < arr.length; j++) {
               swap(arr, i, j);
               permute(arr, i + 1);  // recurse call
               swap(arr, i, j);      // backtracking
          }
     }

     public static void main(String[] args) {

          PermutationRecursive permutations = new PermutationRecursive();
          int[] arr = {1, 2, 3, 4};
          permutations.permute(arr, 0);
     }
}
