package com.epi.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Hasan
 * @version java version "1.8.0_92"
 * @os windows 10
 * @date Jan 1, 2017
 */
public class DeleteDuplicate {

     public static int delete(List<Integer> arr) {
        
          Collections.sort(arr);
          System.out.println(arr.toString());
          if (arr.isEmpty()) {
               System.out.println(arr.isEmpty());
          }
          int writeIndex = 1;
          for (int i = 1; i < arr.size(); i++) {
               if(!arr.get(i-1).equals(arr.get(i)))
                    arr.set(writeIndex++, arr.get(i));
               
          }
          System.out.println(arr.toString());
          return writeIndex;
     }

     public static void main(String[] args) {
          List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 2, 0, 0, 1));
          System.out.println(arr.toString());
          int newArr =delete(arr);
          for (int i = 0; i < newArr; i++) {
               System.out.print(arr.get(i)+" ");
               
          }
     }
}