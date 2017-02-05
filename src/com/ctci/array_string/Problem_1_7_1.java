package com.ctci.array_string;

public class Problem_1_7_1 {

     public static void main(String[] args) {
          int arr[][] = {{5, 2, 8, 7}, {7, 2, 6, 9}, {7, 0, 1, 9}};
          System.out.println(arr.length);
          System.out.println(arr[0].length);
          print(arr);

          System.out.println();
          int m = 0;
          int n = 0;
          for (int i = 0; i < arr.length; i++) {
               for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] == 0) {
                         m = i;
                         n = j;
                         break;
                    }
               }
          }
          zeroOutRow(arr, m);
          zeroOutCol(arr, n);

          print(arr);

     }

     private static void zeroOutRow(int[][] arr, int m) {
          for (int i = 0; i < arr.length; i++) {
               arr[m][i] = 0;
          }
     }

     private static void zeroOutCol(int[][] arr, int n) {
          for (int i = 0; i < arr[0].length; i++) {
               arr[i][n] = 0;
          }
     }

     public static void print(int arr[][]) {
          for (int i = 0; i < arr.length; i++) {
               for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j]);

               }
               System.out.println();
          }
     }

}
