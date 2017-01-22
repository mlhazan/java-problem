package com.interview.problem;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraySubsets {

     public static void main(String[] args) {
          int arr[] = {1, 2, 3, 4};
          subsets(arr);
         // System.out.println(subsets(arr));
     }

     private static ArrayList<ArrayList<Integer>> subsets(int S[]) {
          if (S == null) {
               return null;
          }

          Arrays.sort(S);

          ArrayList<ArrayList<Integer>> result = new ArrayList<>();

          for (int i = 0; i < S.length; i++) {
               ArrayList<ArrayList<Integer>> temp = new ArrayList<>();

               //get sets that are already in result
               for (ArrayList<Integer> a : result) {
                    temp.add(new ArrayList<>(a));
               }

               //add S[i] to existing sets
               for (ArrayList<Integer> a : temp) {
                    a.add(S[i]);
               }

               //add S[i] only as a set
               ArrayList<Integer> single = new ArrayList<>();
               single.add(S[i]);
               temp.add(single);
               System.out.println(temp);
               result.addAll(temp);
          }

          //add empty set
          result.add(new ArrayList<>());

          return result;
     }
}
