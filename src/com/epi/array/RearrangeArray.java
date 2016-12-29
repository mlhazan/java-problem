package com.epi.array;
/**
 rearrange an array so that A[0]<A[1]>A[2]<A[3]>..
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RearrangeArray {

     public static void main(String[] args) {
          int[] array = {2, 3, 4, 1};
          List<Integer> alist = new ArrayList<>();
          for (int a : array) {
               alist.add(a);
          }
          smallestValue(alist);
          System.out.println((alist));
     }

     public static void  smallestValue(List<Integer> A) {

          for (int i = 1; i < A.size(); ++i) {
               if(((i % 2) == 0 && A.get(i - 1) < A.get(i)) || ((i % 2) != 0 && A.get(i - 1) > A.get(i)))            
               {
                    Collections.swap(A, i - 1, i);
               }
          }
     }
}
