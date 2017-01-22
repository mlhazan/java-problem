
package com.interview.problem;

/**
 * @author Hasan
 * @version java version "1.8.0_92"
 * @os windows 10
 * @date Jan 8, 2017
 */
public class Permutation_3 {

    public static void permute(char[] input2, int startindex) {

        if (input2.length == startindex) {
             displayArray(input2);
        } else {
            for (int i = startindex; i < input2.length; i++) {
                char[] input = input2.clone();
                char temp = input[i];
                input[i] = input[startindex];
                input[startindex] = temp;
                permute(input, startindex + 1);
            }
        }
    }


    private static void displayArray(char[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ";  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        char[] input = { 'a', 'b', 'c', 'd'};
        permute(input, 0);
    }

}