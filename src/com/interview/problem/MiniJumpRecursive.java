package com.interview.problem;

/**
 * @author Hasan
 * @version java version "1.8.0_92"
 * @os windows 10
 * @date Dec 30, 2016
 */
class MiniJumpRecursive {

     public static void main(String[] args) {
          int arr[] = {2, 3, 1, 1, 2};
          int n = arr.length;
          System.out.printf("Minimum number of jumps to reach end is %d ", minJumps(arr, 0, n - 1));
     }

     public static int minJumps(int arr[], int l, int h) {
          // Base case: when source and destination are same
          if (h == l) {
               return 0;
          }

          // When nothing is reachable from the given source
          if (arr[l] == 0) {
               return Integer.MAX_VALUE;
          }

          // Traverse through all the points reachable from arr[l]. Recursively
          // get the minimum number of jumps needed to reach arr[h] from these
          // reachable points.
          int min = Integer.MAX_VALUE;
          for (int i = l + 1; i <= h && i <= l + arr[l]; i++) {
               int jumps = minJumps(arr, i, h);
               if (jumps != Integer.MAX_VALUE && jumps + 1 < min) {
                    min = jumps + 1;
               }
          }
          return min;
     }

}
