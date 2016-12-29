package com.epi.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PlusOne {
     // @include

     public static List<Integer> plusOne(List<Integer> A) {
          int n = A.size() - 1;
          A.set(n, A.get(n) + 1);
          for (int i = n; i > 0 && A.get(i) == 10; --i) {
               A.set(i, 0);
               A.set(i - 1, A.get(i - 1) + 1);
          }
          if (A.get(0) == 10) {//10,0,0
               // Need additional digit as the most significant digit (i.e., A.get(0))
               // has a carry-out.
               A.set(0, 0);//0,0,0
               A.add(0, 1);//1,0,0,0
          }
          return A;
     }
     // @exclude

     private static List<Integer> randArray(int len) {
          if (len == 0) {
               return Arrays.asList(0);
          }
          Random r = new Random();
          List<Integer> A = new ArrayList<>();

          while (len != 0) {
               A.add(r.nextInt(10));//A.add(9); <--Try it
               --len;
          }
          return A;
     }

     public static void main(String[] args) {
          //smallTest();
          Random r = new Random();
          int n;
          if (args.length == 1) {
               n = Integer.parseInt(args[0]);
          } else {
               n = r.nextInt(10);
          }
          List<Integer> A = randArray(n);
          System.out.println(A);
          List<Integer> result = plusOne(A);
          System.out.println(result);
     }
}
