package com.ctci.array_string;

import com.interview.problem.*;

public class Problem_1_6_1 {
// {1, 2, 3} {3, 6, 9}
// {4, 5, 6} {2, 5, 8}
// {7, 8, 9} {1, 4 ,7}

     public static void main(String[] args) {
          int mat[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
          // Consider all squares one by one
          int N = mat.length;

          for (int x = 0; x < N / 2; x++) {
               // Consider elements in group of 4 in 
               // current square
               for (int y = x; y < N - 1 - x; y++) {
                    // store current cell in temp variable
                    int temp = mat[x][y];

                    // move values from right to top
                    mat[x][y] = mat[y][N - 1 - x];

                    // move values from bottom to right
                    mat[y][N - 1 - x] = mat[N - 1 - x][N - 1 - y];

                    // move values from left to bottom
                    mat[N - 1 - x][N - 1 - y] = mat[N - 1 - y][x];

                    // assign temp to left
                    mat[N - 1 - y][x] = temp;
               }
          }

          for (int i = 0; i < mat.length; i++) {
               for (int j = 0; j < mat[i].length; j++) {
                    System.out.print(mat[i][j]);

                    if (j == mat[i].length - 1) {
                         System.out.println("");
                    }
               }
          }

     }
}
