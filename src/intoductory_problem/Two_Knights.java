/*
 * @Jai_Bajrang_Bali
 * @Har_Har_Mahadev
 */
/*   Created by IntelliJ IDEA.
 *   Author: Sanat Kumar Dubey (sanat04)
 *   Date: 28-06-2023
 *   Time: 12:53
 *   File: Two_Knights.java
 */

package intoductory_problem;

import java.util.Scanner;

public class Two_Knights {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder res=new StringBuilder();
        long n= sc.nextLong();
        for (long i = 1; i <=n ; i++) {
            res.append((((i*i)*((i*i)-1))/2)-(4*(i-1)*(i-2))).append("\n");
        }
        System.out.println(res);
    }
}

