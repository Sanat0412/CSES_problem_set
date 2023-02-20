/*
 * @Jai_Bajrang_Bali
 * @Har_Har_Mahadev
 */
/*   Created by IntelliJ IDEA.
 *   Author: Sanat Kumar Dubey (sanat04)
 *   Date: 20-02-2023
 *   Time: 19:16
 *   File: intoductory_problem.Trailing_zeros.java
 */
/*
in this problem we have to find that after doing factorial of a number how many zeroes is at the end
so, I have use the proper method which I've studied in aptitude and yess by that approach I got AC.
*/
package intoductory_problem;
import java.util.Scanner;
public class Trailing_zeros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder res=new StringBuilder();
        long n= sc.nextLong();
        long sum=0;
        for (int i = 5; i <=n ; i*=5) {
            sum+=Math.floor(n/i);
        }
        res.append(sum);
        System.out.println(res.toString());
    }
}

