
package com.euler.problem;

/**
 * @author Hasan
 * @version java version "1.8.0_92"
 * @os windows 10
 * @date Jan 6, 2017
 */
public class Problem_3_2 {
     public static int largestPrimeFactor(long number) {
    int i;
    for (i = 2; i <= number; i++) {
        if (number % i == 0) {
            number /= i;
            i--;
        }
    }
    return i;
}

/*  change according to ur requirement. 
public static long getLong(String prompt) {
    System.out.print(prompt + " ");
    long mrlong = input.nextLong();
    input.nextLine();
    return mrlong;
}
 */

public static void main(String[] args) {
    //long num = getLong("What number do you want to analyse? ");
    System.out.println(largestPrimeFactor(600851475143l));
}
}


