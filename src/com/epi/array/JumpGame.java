package com.epi.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JumpGame {

     public static boolean canReachEnd(List<Integer> arr) {
          int current = 0, lastIndex = arr.size()-1;
          for (int i = 0; i <= current && current < lastIndex; i++) {
               current = Math.max(current, i + arr.get(i));
          }
          return current >= lastIndex;
     }

     public static void main(String[] args) {
          List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 2, 0, 0, 1));
          System.out.println(canReachEnd(arr));
     }
}
